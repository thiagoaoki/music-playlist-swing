package br.com.dbsti.aula.controller;

import br.com.dbsti.aula.model.Cantor;
import br.com.dbsti.aula.model.dao.CantorDAO;
import br.com.dbsti.aula.model.dao.hibernate.CantorDaoHibernate;
import br.com.dbsti.aula.util.ImagemUtil;
import br.com.dbsti.aula.view.CantorFrame;
import br.com.dbsti.aula.view.table.CantorTableModel;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.swing.ImageIcon;

public class CantorController {

    private CantorFrame view;
    private Cantor cantor;
    private CantorDAO cantorDAO;
    private CantorTableModel cantorTableModel;    

    public CantorController(CantorFrame view) {
        this.view = view;
        cantorDAO = new CantorDaoHibernate();
    }

    public void salvar() {
        if (cantor == null) {
            cantor = new Cantor();
        }
        cantor.setNome(view.getNome());
        cantor.setSobrenome(view.getSobrenome());

        if (cantor.getId() == null) {
            cantorDAO.adiciona(cantor);
        } else {
            cantorDAO.atualiza(cantor);
        }

        preencheTabela();
        view.mostraMensagem("Operação realizada com sucesso.");
    }
    
    public void novo(){
        cantor = null;
        view.limpaCampos();
    }
    
    public void carregarFoto(File foto){
        if (cantor == null) {
            cantor = new Cantor();
        }
        
        try {
            ImageIcon icone = ImagemUtil.converteArquivoEmIcone(foto);
            byte[] fotoByte = ImagemUtil.converteIconeEmByte(icone);
                                   
            cantor.setFoto(fotoByte);
            view.setFoto(icone);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void preencheTabela(){
        List<Cantor> lista = cantorDAO.lista();
        
        cantorTableModel = new CantorTableModel(lista);
        view.atualizaTabelaDeCantores(cantorTableModel);                
    }

    public void preencheCampos(int linhaSelecionada) {
       cantor = cantorTableModel.getCantor(linhaSelecionada);
       view.setNome(cantor.getNome());
       view.setSobrenome(cantor.getSobrenome());
       view.setFoto(ImagemUtil.converteByteEmIcone(cantor.getFoto()));
    }

    public void exclui(int linhaSelecionada) {
        cantor = cantorTableModel.getCantor(linhaSelecionada);
        cantorDAO.remove(cantor.getId());
        
        view.limpaCampos();
        preencheTabela();
        view.mostraMensagem("Cantor excluido com sucesso.");
    }

    public void pesquisa() {
        final String nomeFiltro = view.getNomeFiltro();
        List<Cantor> cantores;
        if (nomeFiltro == null || nomeFiltro.isEmpty()){
            cantores = cantorDAO.lista();
        } else {
            cantores = cantorDAO.pesquesaPorNome(nomeFiltro);
        }
        cantorTableModel = new CantorTableModel(cantores);
        view.atualizaTabelaDeCantores(cantorTableModel);
    }       
}
