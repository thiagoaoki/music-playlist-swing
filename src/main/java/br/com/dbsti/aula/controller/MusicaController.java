package br.com.dbsti.aula.controller;

import br.com.dbsti.aula.model.Cantor;
import br.com.dbsti.aula.model.Musica;
import br.com.dbsti.aula.model.dao.CantorDAO;
import br.com.dbsti.aula.model.dao.MusicaDAO;
import br.com.dbsti.aula.model.dao.hibernate.CantorDaoHibernate;
import br.com.dbsti.aula.model.dao.hibernate.MusicaDaoHibernate;
import br.com.dbsti.aula.view.MusicaDialog;
import br.com.dbsti.aula.view.table.MusicaTableModel;
import java.util.List;

public class MusicaController {    
    private MusicaDialog view;
    private Musica musica; 
    private MusicaDAO musicaDao;
    private CantorDAO cantorDao;
    private MusicaTableModel musicaTableModel;   
    
    public MusicaController(MusicaDialog view){
        this.view = view;
        musicaDao = new MusicaDaoHibernate();
        cantorDao = new CantorDaoHibernate();
    }
        
    public void preencheCantores() {
        List<Cantor> cantores = cantorDao.lista();
        for (Cantor cantor: cantores) {
            view.adicionaCantorNoComboBox(cantor);
        }
    }       

    public void salvar() {
        if (musica == null) {
            musica = new Musica();
        }
        
        musica.setNome(view.getNome());
        musica.setCantor(view.getCantorSelecionado());       
        musica.setDuracao(view.getDuracao());
        
        if (musica.getId() == null){
            musicaDao.adiciona(musica);
        } else {
            musicaDao.atualiza(musica);
        }
        
        preencheMusicas();
        view.mostraMensagem("Operação realizada com sucesso.");
    }

    public void preencheMusicas() {
        List<Musica> musicas = musicaDao.lista();
        
        musicaTableModel = new MusicaTableModel(musicas);
        view.atualizaTabelaDeMusicas(musicaTableModel); 
    }

    public void carregaMusica(int selectedRow) {
        musica = musicaTableModel.getMusica(selectedRow);
        view.setNomeDaMusica(musica.getNome());
        view.setCantor(musica.getCantor());
        view.setDuracao(musica.getDuracaoDate());
    }

    public void excluir(int selectedRow) {
        musica = musicaTableModel.getMusica(selectedRow);
        musicaDao.remove(musica.getId());
        preencheMusicas();
    }

    public void perquisar() {
        String nomeFiltro = view.getNomeFiltro();
        List<Musica> musicas = musicaDao.pesquisaPorNome(nomeFiltro);  
        
        musicaTableModel = new MusicaTableModel(musicas);
        view.atualizaTabelaDeMusicas(musicaTableModel);
    }

}