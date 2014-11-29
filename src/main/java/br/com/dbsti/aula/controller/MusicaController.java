package br.com.dbsti.aula.controller;

import br.com.dbsti.aula.model.Cantor;
import br.com.dbsti.aula.model.Musica;
import br.com.dbsti.aula.model.dao.CantorDAO;
import br.com.dbsti.aula.model.dao.MusicaDAO;
import br.com.dbsti.aula.model.dao.hibernate.CantorDaoHibernate;
import br.com.dbsti.aula.model.dao.hibernate.MusicaDaoHibernate;
import br.com.dbsti.aula.view.MusicaDialog;
import java.util.List;

public class MusicaController {    
    private MusicaDialog view;
    private Musica musica; 
    private MusicaDAO musicaDao;
    private CantorDAO cantorDao;
    
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
        //A Fazer
        //musica.setDuracao(view.getDuracao());
        
        if (musica.getId() == null){
            musicaDao.adiciona(musica);
        } else {
            musicaDao.atualiza(musica);
        }
        
        view.mostraMensagem("Operação realizada com sucesso.");
    }
}
