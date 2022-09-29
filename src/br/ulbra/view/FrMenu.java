package br.ulbra.view;

import br.ulbra.DAO.PontoDAO;
import br.ulbra.entity.Ponto;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Priscila Butzke & Andriele Joras
 */
public final class FrMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrMenu
     *
     * @throws java.sql.SQLException
     */
    public FrMenu() throws SQLException {
        initComponents();
        PontoDAO pdao = new PontoDAO();
        visualizarPesquisaCompleta(pdao.pesquisarTabela());
        this.setLocationRelativeTo(null);//centraliza no centro da tela ao executar
    }

    public void visualizarPesquisaCompleta(List<Ponto> listaDeResposta) throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) tbPontos.getModel();
        modelo.setNumRows(0);
        listaDeResposta.forEach((p) -> {
            modelo.addRow(new Object[]{
                p.getIdPonto(),
                p.getNomePonto(),
                p.getRuaPonto(),
                p.getNumeroPonto(),
                p.getCidadePonto(),
                p.getEstadoPonto(),
                p.getContatoPonto(),
                p.getDescricaoPonto(),
                p.getCepPonto(),
                p.getBairroPonto()
            });
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        BtnPesquisa = new javax.swing.JButton();
        edPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPontos = new javax.swing.JTable();
        btNovo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        liFiltro = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuUsuarios = new javax.swing.JMenuItem();
        menuPontoTuristico = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java CRUD");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        BtnPesquisa.setBackground(new java.awt.Color(255, 102, 102));
        BtnPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        BtnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-search-24.png"))); // NOI18N
        BtnPesquisa.setBorder(null);
        BtnPesquisa.setBorderPainted(false);
        BtnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesquisaActionPerformed(evt);
            }
        });

        edPesquisa.setBackground(new java.awt.Color(204, 204, 204));
        edPesquisa.setBorder(null);
        edPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edPesquisaActionPerformed(evt);
            }
        });
        edPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edPesquisaKeyPressed(evt);
            }
        });

        tbPontos.setBackground(new java.awt.Color(255, 102, 102));
        tbPontos.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        tbPontos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod", "Nome", "Rua", "Número", "Cidade", "Estado", "Contato", "Descrição", "CEP", "Bairro"
            }
        ));
        tbPontos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPontosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPontos);

        btNovo.setBackground(new java.awt.Color(0, 153, 102));
        btNovo.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        btNovo.setForeground(new java.awt.Color(255, 255, 255));
        btNovo.setText("+");
        btNovo.setBorder(null);
        btNovo.setFocusable(false);
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-place-marker-30 (1).png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("REBORN |");

        jLabel6.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("Places");

        jPanel3.setBackground(new java.awt.Color(0, 153, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        liFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome(Padrão)", "Estado", "Cidade", "Contato", "(A-Z) Ordem alfábetica", "(Z-A) Ordem alfábetica" }));
        liFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liFiltroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(liFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(liFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setMaximumSize(new java.awt.Dimension(200, 32769));

        jMenu1.setText("Cadastros ");
        jMenu1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        menuUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        menuUsuarios.setText("Usuários");
        menuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(menuUsuarios);

        menuPontoTuristico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menuPontoTuristico.setText("Pontos Turísticos");
        menuPontoTuristico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPontoTuristicoActionPerformed(evt);
            }
        });
        jMenu1.add(menuPontoTuristico);

        menuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_END, java.awt.event.InputEvent.CTRL_MASK));
        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        jMenu1.add(menuSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatórios");
        jMenu2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jMenuItem3.setText("Relatório 1");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Relatório 2");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUsuariosActionPerformed
        try {
            new FrUsuario().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuUsuariosActionPerformed

    private void BtnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesquisaActionPerformed
        realizarPesquisa();
    }//GEN-LAST:event_BtnPesquisaActionPerformed

    private void edPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edPesquisaActionPerformed

    private void tbPontosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPontosMouseClicked

        FrPontos p = null;
        try {
            p = new FrPontos();
        } catch (SQLException ex) {
            Logger.getLogger(FrMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        p.setVisible(true);
        p.controlarBtn(3);
        //puxa as informações do banco de dados
        if (tbPontos.getSelectedRow() != -1) {

            //seta as informações do banco nas linhas da tabela da view, em ordem de colunas
            p.getEdCodigo().setText(tbPontos.getValueAt(tbPontos.getSelectedRow(), 0).toString());
            p.getEdNome().setText(tbPontos.getValueAt(tbPontos.getSelectedRow(), 1).toString());
            p.getEdRua().setText(tbPontos.getValueAt(tbPontos.getSelectedRow(), 2).toString());
            p.getEdNumero().setText(tbPontos.getValueAt(tbPontos.getSelectedRow(), 3).toString());
            p.getEdCidade().setText(tbPontos.getValueAt(tbPontos.getSelectedRow(), 4).toString());
            p.getEdEstado().setText(tbPontos.getValueAt(tbPontos.getSelectedRow(), 5).toString());
            p.getEdContato().setText(tbPontos.getValueAt(tbPontos.getSelectedRow(), 6).toString());
            p.getEdDescricao().setText(tbPontos.getValueAt(tbPontos.getSelectedRow(), 7).toString());
            p.getEdBairro().setText(tbPontos.getValueAt(tbPontos.getSelectedRow(), 9).toString());
            try {
                p.getEdCep().setText(tbPontos.getValueAt(tbPontos.getSelectedRow(), 8).toString());
            } catch (Exception ex) {
                p.getEdCep().setText("");
            }
        }
    }//GEN-LAST:event_tbPontosMouseClicked

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed

        try {
            new FrPontos().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        FrPontos p = null;
        try {
            p = new FrPontos();
        } catch (SQLException ex) {
            Logger.getLogger(FrMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        p.controlarBtn(2);

        p.getEdNome().setText("");
        p.getEdCodigo().setText("");
        p.getEdRua().setText("");
        p.getEdNumero().setText("");
        p.getEdCidade().setText("");
        p.getEdEstado().setText("");
        p.getEdContato().setText("");
        p.getEdDescricao().setText("");
        p.getEdCep().setText("");
        p.getEdBairro().setText("");
    }//GEN-LAST:event_btNovoActionPerformed

    private void menuPontoTuristicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPontoTuristicoActionPerformed
        try {
            new FrPontos().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuPontoTuristicoActionPerformed

    private void liFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_liFiltroActionPerformed


    private void edPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edPesquisaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            realizarPesquisa();
        }
    }//GEN-LAST:event_edPesquisaKeyPressed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_menuSairActionPerformed

    private void realizarPesquisa() {
        try {
            PontoDAO pd = new PontoDAO();
            switch (liFiltro.getSelectedIndex()) {
                case 0:
                    visualizarPesquisaCompleta(pd.pesquisarPorNome(edPesquisa.getText()));
                    break;
                case 1:
                    visualizarPesquisaCompleta(pd.pesquisarPorLocal("estadoPonto", edPesquisa.getText()));
                    break;
                case 2:
                    visualizarPesquisaCompleta(pd.pesquisarPorLocal("cidadePonto", edPesquisa.getText()));
                    break;
                case 3:
                    visualizarPesquisaCompleta(pd.pesquisarPorContato(edPesquisa.getText()));
                    break;
                case 4:
                    visualizarPesquisaCompleta(pd.organizarEmOrdemAlfabetica(""));
                    break;
                case 5:
                    visualizarPesquisaCompleta(pd.organizarEmOrdemAlfabetica("desc"));
                    break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FrUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {
                    new FrMenu().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FrMenu.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnPesquisa;
    private javax.swing.JButton btNovo;
    private javax.swing.JTextField edPesquisa;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> liFiltro;
    private javax.swing.JMenuItem menuPontoTuristico;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenuItem menuUsuarios;
    private javax.swing.JTable tbPontos;
    // End of variables declaration//GEN-END:variables
}
