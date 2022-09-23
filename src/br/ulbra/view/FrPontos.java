package br.ulbra.view;

import br.ulbra.entity.Ponto;
import br.ulbra.DAO.PontoDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Priscila Butzke e Andriele Joras
 */
public class FrPontos extends javax.swing.JFrame {

    /**
     * Creates new form FrPontos
     */
    public FrPontos() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        FrMenu fm = new FrMenu();
        fm.readJTable();
    }

    public JLabel getEdCodigo() {
        return edCodigo;
    }

    public void setEdCodigo(JLabel edCodigo) {
        this.edCodigo = edCodigo;
    }

    public JFormattedTextField getEdContato() {
        return edContato;
    }

    public void setEdContato(JFormattedTextField edContato) {
        this.edContato = edContato;
    }

    public JTextField getEdDescricao() {
        return edDescricao;
    }

    public JTextField getEdCidade() {
        return edCidade;
    }

    public void setEdCidade(JPasswordField edCidade) {
        this.edCidade = edCidade;
    }

    public void setEdDescricao(JPasswordField edDescricao) {
        this.edDescricao = edDescricao;
    }

    public JTextField getEdEstado() {
        return edEstado;
    }

    public void setEdEstado(JPasswordField edEstado) {
        this.edEstado = edEstado;
    }

    public JTextField getEdNome() {
        return edNome;
    }

    public void setEdNome(JTextField edNome) {
        this.edNome = edNome;
    }

    public JTextField getEdNumero() {
        return edNumero;
    }

    public void setEdNumero(JTextField edNumero) {
        this.edNumero = edNumero;
    }

    public JTextField getEdRua() {
        return edRua;
    }

    public void setEdRua(JTextField edRua) {
        this.edRua = edRua;
    }

    public JFormattedTextField getEdCep() {
        return edCep;
    }

    public void setEdCep(JFormattedTextField edCep) {
        this.edCep = edCep;
    }

    public void controlarBtn(int op) {
        switch (op) {
            case 1:
                btSalvar.setEnabled(true);
                break;
            case 2:
                btSalvar.setEnabled(true);
                btAlterar.setEnabled(false);
                btExcluir.setEnabled(false);
                break;
            case 3:
                btAlterar.setEnabled(true);
                btExcluir.setEnabled(true);
                btSalvar.setEnabled(false);
                break;
        }
        this.pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnCad = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        edNome = new javax.swing.JTextField();
        edRua = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        edNumero = new javax.swing.JTextField();
        edCidade = new javax.swing.JTextField();
        edDescricao = new javax.swing.JTextField();
        edEstado = new javax.swing.JTextField();
        edContato = new javax.swing.JFormattedTextField();
        edCodigo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        edCep = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        btSalvar1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnCad.setBackground(new java.awt.Color(51, 51, 51));
        pnCad.setForeground(new java.awt.Color(255, 129, 79));
        pnCad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("CÓDIGO");
        pnCad.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("NOME");
        pnCad.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 20));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("NÚMERO");
        pnCad.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("RUA");
        pnCad.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("ESTADO");
        pnCad.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        edNome.setBackground(new java.awt.Color(204, 204, 204));
        edNome.setForeground(new java.awt.Color(0, 0, 0));
        edNome.setBorder(null);
        edNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edNomeActionPerformed(evt);
            }
        });
        pnCad.add(edNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 250, 30));

        edRua.setBackground(new java.awt.Color(204, 204, 204));
        edRua.setForeground(new java.awt.Color(0, 0, 0));
        edRua.setBorder(null);
        edRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edRuaActionPerformed(evt);
            }
        });
        pnCad.add(edRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 250, 30));

        btSalvar.setBackground(new java.awt.Color(0, 153, 102));
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        pnCad.add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 190, 40));

        btAlterar.setBackground(new java.awt.Color(255, 102, 102));
        btAlterar.setForeground(new java.awt.Color(255, 129, 79));
        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-engrenagem-30.png"))); // NOI18N
        btAlterar.setToolTipText("");
        btAlterar.setBorder(null);
        btAlterar.setBorderPainted(false);
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });
        pnCad.add(btAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 170, 40));

        btExcluir.setBackground(new java.awt.Color(255, 102, 102));
        btExcluir.setForeground(new java.awt.Color(255, 129, 79));
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lixeira.png"))); // NOI18N
        btExcluir.setBorder(null);
        btExcluir.setBorderPainted(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        pnCad.add(btExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 150, 40));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("DESCRICÃO");
        pnCad.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, 20));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("CIDADE");
        pnCad.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("CEP");
        pnCad.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, 20));

        edNumero.setBackground(new java.awt.Color(204, 204, 204));
        edNumero.setBorder(null);
        pnCad.add(edNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 120, 30));

        edCidade.setBackground(new java.awt.Color(204, 204, 204));
        edCidade.setBorder(null);
        pnCad.add(edCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 250, 30));

        edDescricao.setBackground(new java.awt.Color(204, 204, 204));
        edDescricao.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        edDescricao.setBorder(null);
        edDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edDescricaoActionPerformed(evt);
            }
        });
        pnCad.add(edDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 260, 90));

        edEstado.setBackground(new java.awt.Color(204, 204, 204));
        edEstado.setBorder(null);
        pnCad.add(edEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 120, 30));

        edContato.setBackground(new java.awt.Color(204, 204, 204));
        edContato.setBorder(null);
        pnCad.add(edContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 260, 30));

        edCodigo.setBackground(new java.awt.Color(204, 204, 204));
        edCodigo.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        edCodigo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnCad.add(edCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 40, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("REBORN |");
        pnCad.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        jLabel12.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 102));
        jLabel12.setText("Places");
        pnCad.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, 20));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-place-marker-30 (1).png"))); // NOI18N
        pnCad.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 153, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        pnCad.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 740, 20));

        edCep.setBackground(new java.awt.Color(204, 204, 204));
        edCep.setBorder(null);
        pnCad.add(edCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 140, 30));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("CONTATO");
        pnCad.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, 20));

        btSalvar1.setBackground(new java.awt.Color(0, 153, 102));
        btSalvar1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btSalvar1.setText("BUSCAR CEP");
        btSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvar1ActionPerformed(evt);
            }
        });
        pnCad.add(btSalvar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 110, 30));

        jMenuBar1.setMaximumSize(new java.awt.Dimension(200, 32769));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(184, 26));

        jMenu1.setText("Cadastros");
        jMenu1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Usuários");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_END, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatórios");
        jMenu2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N

        jMenuItem4.setText("Rel 1");
        jMenu2.add(jMenuItem4);

        jMenuItem3.setText("Rel 2");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnCad, javax.swing.GroupLayout.PREFERRED_SIZE, 590, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edNomeActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

          FrMenu fm = null;
        try {
            fm = new FrMenu();
        } catch (SQLException ex) {
            Logger.getLogger(FrPontos.class.getName()).log(Level.SEVERE, null, ex);
        }
        Ponto p = new Ponto();
        try {
            PontoDAO pd = new PontoDAO();
            if (!edNome.getText().isEmpty()
                    && !edRua.getText().isEmpty()
                    && !edDescricao.getText().isEmpty()
                    && !edCidade.getText().isEmpty()
                    && !edDescricao.getText().isEmpty()) {

                p.setNomePonto(edNome.getText());
                p.setRuaPonto(edRua.getText());
                p.setNumeroPonto(edNumero.getText());
                p.setCidadePonto(edCidade.getText());
                p.setEstadoPonto(edEstado.getText());
                p.setContatoPonto(edContato.getText());
                p.setDescricaoPonto(edDescricao.getText());
                p.setCepPonto(edCep.getText());
                
                pd.create(p);
                this.dispose();
                fm.readJTable();
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        }

        controlarBtn(1);
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        controlarBtn(1);
        
          FrMenu fm = null;
        try {
            fm = new FrMenu();
        } catch (SQLException ex) {
            Logger.getLogger(FrPontos.class.getName()).log(Level.SEVERE, null, ex);
        }

        Ponto p = new Ponto();
        try {
            PontoDAO pd = new PontoDAO();

            p.setNomePonto(edNome.getText());
            p.setRuaPonto(edRua.getText());
            p.setNumeroPonto(edNumero.getText());
            p.setCidadePonto(edCidade.getText());
            p.setEstadoPonto(edEstado.getText());
            p.setContatoPonto(edContato.getText());
            p.setDescricaoPonto(edDescricao.getText());
            p.setCepPonto(edCep.getText());
            
            pd.update(p);
            fm.readJTable();
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }

    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        controlarBtn(1);
        
          FrMenu fm = null;
        try {
            fm = new FrMenu();
        } catch (SQLException ex) {
            Logger.getLogger(FrPontos.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        Ponto p = new Ponto();
        try {
            PontoDAO pd = new PontoDAO();
            p.setIdPonto(Integer.parseInt(edCodigo.getText()));
            pd.delete(p);
            fm.readJTable();
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(FrUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void edDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edDescricaoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            new FrUsuario().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrPontos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSalvar1ActionPerformed

    private void edRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edRuaActionPerformed

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
            java.util.logging.Logger.getLogger(FrPontos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrPontos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrPontos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrPontos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrPontos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FrPontos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btSalvar1;
    private javax.swing.JFormattedTextField edCep;
    private javax.swing.JTextField edCidade;
    private javax.swing.JLabel edCodigo;
    private javax.swing.JFormattedTextField edContato;
    private javax.swing.JTextField edDescricao;
    private javax.swing.JTextField edEstado;
    private javax.swing.JTextField edNome;
    private javax.swing.JTextField edNumero;
    private javax.swing.JTextField edRua;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel pnCad;
    // End of variables declaration//GEN-END:variables
}
