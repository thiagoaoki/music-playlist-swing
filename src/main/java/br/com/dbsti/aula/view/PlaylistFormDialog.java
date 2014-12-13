/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dbsti.aula.view;

import br.com.dbsti.aula.controller.PlayListController;
import br.com.dbsti.aula.view.table.MusicaTableModel;
import com.sun.corba.se.spi.orb.OperationFactory;
import java.util.Date;
import javax.swing.JDialog;

/**
 *
 * @author DBS
 */
public class PlaylistFormDialog extends javax.swing.JDialog {

    private PlayListController controller;
    
    /**
     * Creates new form PlaylistFormDialog
     */
    public PlaylistFormDialog(JDialog parent, PlayListController controller) {
        super(parent, true);
        initComponents();
        this.controller = controller;
        this.controller.registraForm(this);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        camposPnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomeTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        duracaoTotalTxt = new javax.swing.JFormattedTextField();
        musicasDisponiveisPnl = new javax.swing.JScrollPane();
        musicasDisponiveisTbl = new javax.swing.JTable();
        musicasPlayListPnl = new javax.swing.JScrollPane();
        musicasPlayListTbl = new javax.swing.JTable();
        botoesPnl = new javax.swing.JPanel();
        adicionarBtn = new javax.swing.JButton();
        removerBtn = new javax.swing.JButton();
        botoesDeBaixoPnl = new javax.swing.JPanel();
        salvarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dados da Playlist");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        camposPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Nome da PlayList");

        jLabel2.setText("Duração Total");

        duracaoTotalTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance())));

        javax.swing.GroupLayout camposPnlLayout = new javax.swing.GroupLayout(camposPnl);
        camposPnl.setLayout(camposPnlLayout);
        camposPnlLayout.setHorizontalGroup(
            camposPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(camposPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(camposPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(camposPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeTxt)
                    .addGroup(camposPnlLayout.createSequentialGroup()
                        .addComponent(duracaoTotalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        camposPnlLayout.setVerticalGroup(
            camposPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(camposPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(camposPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(camposPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(duracaoTotalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        musicasDisponiveisTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        musicasDisponiveisPnl.setViewportView(musicasDisponiveisTbl);

        musicasPlayListTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        musicasPlayListPnl.setViewportView(musicasPlayListTbl);

        botoesPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        adicionarBtn.setText("Adicionar");
        adicionarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarBtnActionPerformed(evt);
            }
        });
        botoesPnl.add(adicionarBtn);

        removerBtn.setText("Remover");
        removerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerBtnActionPerformed(evt);
            }
        });
        botoesPnl.add(removerBtn);

        botoesDeBaixoPnl.setBackground(new java.awt.Color(102, 102, 102));
        botoesDeBaixoPnl.setForeground(new java.awt.Color(102, 102, 102));

        salvarBtn.setText("Salvar");
        salvarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botoesDeBaixoPnlLayout = new javax.swing.GroupLayout(botoesDeBaixoPnl);
        botoesDeBaixoPnl.setLayout(botoesDeBaixoPnlLayout);
        botoesDeBaixoPnlLayout.setHorizontalGroup(
            botoesDeBaixoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botoesDeBaixoPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salvarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        botoesDeBaixoPnlLayout.setVerticalGroup(
            botoesDeBaixoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salvarBtn)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(camposPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(musicasDisponiveisPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
            .addComponent(botoesPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(musicasPlayListPnl)
            .addComponent(botoesDeBaixoPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(camposPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(musicasDisponiveisPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botoesPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(musicasPlayListPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botoesDeBaixoPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        controller.preencheTabelaMusicasDisponiveis();
    }//GEN-LAST:event_formWindowOpened

    private void adicionarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarBtnActionPerformed
        controller.adicionaMusica(musicasDisponiveisTbl.getSelectedRow());
    }//GEN-LAST:event_adicionarBtnActionPerformed

    private void removerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerBtnActionPerformed
        controller.removeMusica(musicasPlayListTbl.getSelectedRow());
    }//GEN-LAST:event_removerBtnActionPerformed

    private void salvarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarBtnActionPerformed
        controller.salvar();
        dispose();
    }//GEN-LAST:event_salvarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarBtn;
    private javax.swing.JPanel botoesDeBaixoPnl;
    private javax.swing.JPanel botoesPnl;
    private javax.swing.JPanel camposPnl;
    private javax.swing.JFormattedTextField duracaoTotalTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane musicasDisponiveisPnl;
    private javax.swing.JTable musicasDisponiveisTbl;
    private javax.swing.JScrollPane musicasPlayListPnl;
    private javax.swing.JTable musicasPlayListTbl;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JButton removerBtn;
    private javax.swing.JButton salvarBtn;
    // End of variables declaration//GEN-END:variables

    public void atualizaTabelaMusicasDisponiveis(MusicaTableModel musicaTableModelDisponiveis) {
        musicasDisponiveisTbl.setModel(musicaTableModelDisponiveis);
        musicasDisponiveisTbl.repaint();
    }

    public void atualizaTabelaMusicasPlaylist(MusicaTableModel musicaTableModelPlaylist) {
        musicasPlayListTbl.setModel(musicaTableModelPlaylist);
        musicasPlayListTbl.repaint();
    }

    public String getNome() {
        return nomeTxt.getText();
    }
    
    void carregaPlayList(int selectedRow){
        controller.preencheFormPlaylist(selectedRow);
    }

    public void setNome(String nome) {
        nomeTxt.setText(nome);
    }

    public void setDuracao(Date duracaoTotalDate) {
        duracaoTotalTxt.setValue(duracaoTotalDate);
    }
}
