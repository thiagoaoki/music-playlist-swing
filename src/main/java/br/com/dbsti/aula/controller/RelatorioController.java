package br.com.dbsti.aula.controller;

import br.com.dbsti.aula.model.util.JPAUtil;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class RelatorioController {

    public void gerarRelatorio(String nomePlaylist) {
        try {
            JasperCompileManager.compileReportToFile("relatorio-playlists.jrxml");

            Map<String, Object> params = new HashMap<String, Object>();
            params.put("NOME_PLAYLIST", nomePlaylist);
            
            Connection conn = JPAUtil.getConnection();            
            
            JasperPrint jasperPrint = JasperFillManager.fillReport("relatorio-playlists.jasper", params, conn);
            JasperViewer.viewReport(jasperPrint,false);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
