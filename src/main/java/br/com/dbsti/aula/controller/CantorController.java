package br.com.dbsti.aula.controller;

import br.com.dbsti.aula.model.Cantor;
import br.com.dbsti.aula.model.dao.CantorDAO;
import br.com.dbsti.aula.model.dao.hibernate.CantorDaoHibernate;
import br.com.dbsti.aula.util.ImagemUtil;
import br.com.dbsti.aula.view.CantorFrame;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;

public class CantorController {

    private CantorFrame view;
    private Cantor cantor;
    private CantorDAO cantorDAO;

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
}
