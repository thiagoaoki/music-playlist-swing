/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dbsti.aula.view;

import br.com.dbsti.aula.controller.CantorController;
import java.awt.Frame;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author DBS
 */
public class CantorFrame extends javax.swing.JDialog {

    
    public CantorFrame(Frame owner){
       super(owner);
       initComponents(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botoesPnl = new javax.swing.JPanel();
        camposPnl = new javax.swing.JPanel();
        fotoPnl = new javax.swing.JPanel();
        fotoLbl = new javax.swing.JLabel();
        nomelbl = new javax.swing.JLabel();
        nomeTxt = new javax.swing.JTextField();
        sobreNomeLbl = new javax.swing.JLabel();
        sobrenomeTxt = new javax.swing.JTextField();
        carregarFotoBtn = new javax.swing.JButton();
        tabelaPnl = new javax.swing.JScrollPane();
        cantoresTbl = new javax.swing.JTable();
        filtrosPnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomeFiltroTxt = new javax.swing.JTextField();
        pesquisarBtn = new javax.swing.JButton();
        opcoesPnl = new javax.swing.JPanel();
        novoBtn = new javax.swing.JButton();
        salvarBtn = new javax.swing.JButton();
        excluirBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cantor");
        setName("CantorFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(400, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        botoesPnl.setPreferredSize(new java.awt.Dimension(400, 400));

        camposPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        fotoPnl.setBorder(javax.swing.BorderFactory.createTitledBorder("Foto"));

        javax.swing.GroupLayout fotoPnlLayout = new javax.swing.GroupLayout(fotoPnl);
        fotoPnl.setLayout(fotoPnlLayout);
        fotoPnlLayout.setHorizontalGroup(
            fotoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fotoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        );
        fotoPnlLayout.setVerticalGroup(
            fotoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fotoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        nomelbl.setText("Nome");

        sobreNomeLbl.setText("Sobrenome");

        carregarFotoBtn.setText("Carregar Foto");
        carregarFotoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carregarFotoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout camposPnlLayout = new javax.swing.GroupLayout(camposPnl);
        camposPnl.setLayout(camposPnlLayout);
        camposPnlLayout.setHorizontalGroup(
            camposPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(camposPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fotoPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(camposPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(camposPnlLayout.createSequentialGroup()
                        .addComponent(nomelbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeTxt))
                    .addGroup(camposPnlLayout.createSequentialGroup()
                        .addComponent(sobreNomeLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sobrenomeTxt))
                    .addGroup(camposPnlLayout.createSequentialGroup()
                        .addComponent(carregarFotoBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        camposPnlLayout.setVerticalGroup(
            camposPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(camposPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(camposPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(camposPnlLayout.createSequentialGroup()
                        .addGroup(camposPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomelbl)
                            .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(camposPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sobreNomeLbl)
                            .addComponent(sobrenomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(carregarFotoBtn))
                    .addComponent(fotoPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabelaPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cantoresTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        cantoresTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cantoresTblMouseClicked(evt);
            }
        });
        tabelaPnl.setViewportView(cantoresTbl);

        filtrosPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Nome");

        pesquisarBtn.setText("Pesquisar");
        pesquisarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout filtrosPnlLayout = new javax.swing.GroupLayout(filtrosPnl);
        filtrosPnl.setLayout(filtrosPnlLayout);
        filtrosPnlLayout.setHorizontalGroup(
            filtrosPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filtrosPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeFiltroTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesquisarBtn)
                .addContainerGap())
        );
        filtrosPnlLayout.setVerticalGroup(
            filtrosPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filtrosPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(filtrosPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomeFiltroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisarBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout botoesPnlLayout = new javax.swing.GroupLayout(botoesPnl);
        botoesPnl.setLayout(botoesPnlLayout);
        botoesPnlLayout.setHorizontalGroup(
            botoesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(filtrosPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabelaPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
            .addComponent(camposPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        botoesPnlLayout.setVerticalGroup(
            botoesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botoesPnlLayout.createSequentialGroup()
                .addComponent(filtrosPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabelaPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(camposPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        opcoesPnl.setBackground(new java.awt.Color(51, 51, 51));
        opcoesPnl.setLayout(new java.awt.GridLayout(1, 0));

        novoBtn.setText("Novo");
        novoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoBtnActionPerformed(evt);
            }
        });
        opcoesPnl.add(novoBtn);

        salvarBtn.setText("Salvar");
        salvarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarBtnActionPerformed(evt);
            }
        });
        opcoesPnl.add(salvarBtn);

        excluirBtn.setText("Excluir");
        excluirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirBtnActionPerformed(evt);
            }
        });
        opcoesPnl.add(excluirBtn);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botoesPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
            .addComponent(opcoesPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(botoesPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(opcoesPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        opcoesPnl.getAccessibleContext().setAccessibleName("");

        setSize(new java.awt.Dimension(546, 451));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salvarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarBtnActionPerformed
        controller.salvar();
    }//GEN-LAST:event_salvarBtnActionPerformed

    private void novoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoBtnActionPerformed
        controller.novo();
    }//GEN-LAST:event_novoBtnActionPerformed

    private void carregarFotoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carregarFotoBtnActionPerformed
        JFileChooser selecionador = new JFileChooser();
        int opcao = selecionador.showOpenDialog(this);
        if (opcao == JFileChooser.APPROVE_OPTION) {
            File foto = selecionador.getSelectedFile();
            controller.carregarFoto(foto);
        }
    }//GEN-LAST:event_carregarFotoBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        controller.preencheTabela();
    }//GEN-LAST:event_formWindowOpened

    private void cantoresTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantoresTblMouseClicked
        controller.preencheCampos(cantoresTbl.getSelectedRow());
    }//GEN-LAST:event_cantoresTblMouseClicked

    private void excluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBtnActionPerformed
        controller.exclui(cantoresTbl.getSelectedRow());
    }//GEN-LAST:event_excluirBtnActionPerformed

    private void pesquisarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarBtnActionPerformed
        controller.pesquisa();
    }//GEN-LAST:event_pesquisarBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botoesPnl;
    private javax.swing.JPanel camposPnl;
    private javax.swing.JTable cantoresTbl;
    private javax.swing.JButton carregarFotoBtn;
    private javax.swing.JButton excluirBtn;
    private javax.swing.JPanel filtrosPnl;
    private javax.swing.JLabel fotoLbl;
    private javax.swing.JPanel fotoPnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nomeFiltroTxt;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JLabel nomelbl;
    private javax.swing.JButton novoBtn;
    private javax.swing.JPanel opcoesPnl;
    private javax.swing.JButton pesquisarBtn;
    private javax.swing.JButton salvarBtn;
    private javax.swing.JLabel sobreNomeLbl;
    private javax.swing.JTextField sobrenomeTxt;
    private javax.swing.JScrollPane tabelaPnl;
    // End of variables declaration//GEN-END:variables
    private CantorController controller = new CantorController(this);
        
    public String getNome() {
        return nomeTxt.getText();
    }

    public String getSobrenome() {
        return sobrenomeTxt.getText();
    }
    
    public void mostraMensagem(String msn){
        JOptionPane.showMessageDialog(this, msn);
    }

    public void limpaCampos() {
        nomeTxt.setText(null);
        sobrenomeTxt.setText(null);
        setFoto(null);
    }

    public void setFoto(ImageIcon icone) {
        fotoLbl.setIcon(icone);
    }

    public void atualizaTabelaDeCantores(TableModel tableModel) {
        cantoresTbl.setModel(tableModel);
        cantoresTbl.repaint();
    }

    public void setNome(String nome) {
        nomeTxt.setText(nome);
    }

    public void setSobrenome(String sobrenome) {
        sobrenomeTxt.setText(sobrenome);
    }

    public String getNomeFiltro() {
        return nomeFiltroTxt.getText();
    }
}
