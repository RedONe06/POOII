package br.ulbra.view;

import br.ulbra.entity.Ponto;
import br.ulbra.DAO.PontoDAO;
import br.ulbra.DAO.UsuarioDAO;
import br.ulbra.entity.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Priscila Butzke
 */
public class FrPontos extends javax.swing.JFrame {

    /**
     * Creates new form FrPontos
     */
    public FrPontos() {
        initComponents();
      
    }
    
      FrMenu fm = new FrMenu();

    public JTextField getEdCodigo() {
        return edCodigo;
    }

    public void setEdCodigo(JTextField edCodigo) {
        this.edCodigo = edCodigo;
    }

    public JPasswordField getEdContato() {
        return edContato;
    }

    public void setEdContato(JPasswordField edContato) {
        this.edContato = edContato;
    }

    public JPasswordField getEdDescricao() {
        return edDescricao;
    }

    public JPasswordField getEdCidade() {
        return edCidade;
    }

    public void setEdCidade(JPasswordField edCidade) {
        this.edCidade = edCidade;
    }

    public void setEdDescricao(JPasswordField edDescricao) {
        this.edDescricao = edDescricao;
    }

    public JPasswordField getEdEstado() {
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

    public JFormattedTextField getEdNumero() {
        return edNumero;
    }

    public void setEdNumero(JFormattedTextField edNumero) {
        this.edNumero = edNumero;
    }

    public JTextField getEdRua() {
        return edRua;
    }

    public void setEdRua(JTextField edRua) {
        this.edRua = edRua;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        edDescricao = new javax.swing.JPasswordField();
        edCodigo = new javax.swing.JTextField();
        edNome = new javax.swing.JTextField();
        edRua = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        edCidade = new javax.swing.JPasswordField();
        edNumero = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        edEstado = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        edContato = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnCad.setBackground(new java.awt.Color(255, 129, 79));
        pnCad.setForeground(new java.awt.Color(255, 129, 79));
        pnCad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/artboard-12_89035.png"))); // NOI18N
        pnCad.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 140, 160));

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cod");
        pnCad.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nome");
        pnCad.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 7, -1, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Número");
        pnCad.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Rua");
        pnCad.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Estado");
        pnCad.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        edDescricao.setBackground(new java.awt.Color(255, 255, 204));
        edDescricao.setForeground(new java.awt.Color(0, 0, 0));
        pnCad.add(edDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 210, 30));

        edCodigo.setBackground(new java.awt.Color(255, 255, 204));
        edCodigo.setForeground(new java.awt.Color(0, 0, 0));
        pnCad.add(edCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 130, 30));

        edNome.setBackground(new java.awt.Color(255, 255, 204));
        edNome.setForeground(new java.awt.Color(0, 0, 0));
        edNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edNomeActionPerformed(evt);
            }
        });
        pnCad.add(edNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 460, 30));

        edRua.setBackground(new java.awt.Color(255, 255, 204));
        edRua.setForeground(new java.awt.Color(0, 0, 0));
        pnCad.add(edRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 410, 30));

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        btSalvar.setText("SALVAR");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        pnCad.add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 120, 40));

        btAlterar.setBackground(new java.awt.Color(255, 129, 79));
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
        pnCad.add(btAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 40, 40));

        btExcluir.setBackground(new java.awt.Color(255, 129, 79));
        btExcluir.setForeground(new java.awt.Color(255, 129, 79));
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lixeira.png"))); // NOI18N
        btExcluir.setBorder(null);
        btExcluir.setBorderPainted(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        pnCad.add(btExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 40, 40));

        edCidade.setBackground(new java.awt.Color(255, 255, 204));
        edCidade.setForeground(new java.awt.Color(0, 0, 0));
        pnCad.add(edCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 190, 30));

        edNumero.setBackground(new java.awt.Color(255, 255, 204));
        try {
            edNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)# ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pnCad.add(edNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 130, 30));

        jLabel9.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Descrição");
        pnCad.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, 30));

        jLabel10.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Cidade");
        pnCad.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        edEstado.setBackground(new java.awt.Color(255, 255, 204));
        edEstado.setForeground(new java.awt.Color(0, 0, 0));
        pnCad.add(edEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 210, 30));

        jLabel11.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Contato");
        pnCad.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 30));

        edContato.setBackground(new java.awt.Color(255, 255, 204));
        edContato.setForeground(new java.awt.Color(0, 0, 0));
        pnCad.add(edContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 210, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnCad, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnCad, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edNomeActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        Ponto p = new Ponto();
        try {
            PontoDAO pd = new PontoDAO();
            if (!edNome.getText().isEmpty()
                    && !edRua.getText().isEmpty()
                    && !edNumero.getText().isEmpty()
                    && !edCidade.getText().isEmpty()
                    && !edEstado.getText().isEmpty()) {

                p.setNomePonto(edNome.getText());
                p.setRuaPonto(edRua.getText());
                p.setNumeroPonto(Integer.parseInt(edNumero.getText()));
                p.setCidadePonto(edCidade.getText());
                p.setEstadoPonto(edEstado.getText());
                p.setContatoPonto(edContato.getText());
                p.setDescricaoPonto(edDescricao.getText());
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

        Ponto p = new Ponto();
        try {
            PontoDAO pd = new PontoDAO();

            p.setNomePonto(edNome.getText());
            p.setRuaPonto(edRua.getText());
            p.setNumeroPonto(Integer.parseInt(edNumero.getText()));
            p.setCidadePonto(edCidade.getText());
            p.setEstadoPonto(edEstado.getText());
            p.setContatoPonto(edContato.getText());
            p.setDescricaoPonto(edDescricao.getText());
            pd.update(p);
            fm.readJTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }

    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        controlarBtn(1);
        Ponto p = new Ponto();
        try {
            PontoDAO pd = new PontoDAO();
            p.setIdPonto(Integer.parseInt(edCodigo.getText()));
            pd.delete(p);
            fm.readJTable();
        } catch (SQLException ex) {
            Logger.getLogger(FrUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btExcluirActionPerformed

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
                new FrPontos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSalvar;
    private javax.swing.JPasswordField edCidade;
    private javax.swing.JTextField edCodigo;
    private javax.swing.JPasswordField edContato;
    private javax.swing.JPasswordField edDescricao;
    private javax.swing.JPasswordField edEstado;
    private javax.swing.JTextField edNome;
    private javax.swing.JFormattedTextField edNumero;
    private javax.swing.JTextField edRua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pnCad;
    // End of variables declaration//GEN-END:variables
}