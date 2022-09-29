package br.ulbra.view;

import br.ulbra.DAO.ConnectionFactory;
import br.ulbra.DAO.UsuarioDAO;
import br.ulbra.entity.BuscadorDeCep;
import br.ulbra.entity.Usuario;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Priscila Butzke e Andriele Joras
 */
public class FrUsuario extends javax.swing.JFrame {

    public FrUsuario() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);//centraliza no centro da tela ao executar
        controlarBtn(1);
        UsuarioDAO ud = new UsuarioDAO();
        visualizarPesquisaCompleta(ud.pesquisarTabela());
        edCod.setEnabled(false);
    }

    public JTextField getEdBairro() {
        return edBairro;
    }

    public void setEdBairro(JTextField edBairro) {
        this.edBairro = edBairro;
    }

    public JFormattedTextField getEdCep() {
        return edCep;
    }

    public void setEdCep(JFormattedTextField edCep) {
        this.edCep = edCep;
    }

    public JTextField getEdCidade() {
        return edCidade;
    }

    public void setEdCidade(JTextField edCidade) {
        this.edCidade = edCidade;
    }

    public JLabel getEdCod() {
        return edCod;
    }

    public void setEdCod(JLabel edCod) {
        this.edCod = edCod;
    }

    public JTextField getEdEmail() {
        return edEmail;
    }

    public void setEdEmail(JTextField edEmail) {
        this.edEmail = edEmail;
    }

    public JTextField getEdEstado() {
        return edEstado;
    }

    public void setEdEstado(JTextField edEstado) {
        this.edEstado = edEstado;
    }

    public JFormattedTextField getEdFone() {
        return edFone;
    }

    public void setEdFone(JFormattedTextField edFone) {
        this.edFone = edFone;
    }

    public JTextField getEdLogradouro() {
        return edLogradouro;
    }

    public void setEdLogradouro(JTextField edLogradouro) {
        this.edLogradouro = edLogradouro;
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

    public JTextField getEdPesquisa() {
        return edPesquisa;
    }

    public void setEdPesquisa(JTextField edPesquisa) {
        this.edPesquisa = edPesquisa;
    }

    public JPasswordField getEdSenha1() {
        return edSenha1;
    }

    public void setEdSenha1(JPasswordField edSenha1) {
        this.edSenha1 = edSenha1;
    }

    public JPasswordField getEdSenha2() {
        return edSenha2;
    }

    public void setEdSenha2(JPasswordField edSenha2) {
        this.edSenha2 = edSenha2;
    }

    public void controlarBtn(int op) {
        switch (op) {
            case 1:
                pnCad.setVisible(false);
                btSalvar.setEnabled(true);
                break;
            case 2:
                pnCad.setVisible(true);
                btSalvar.setEnabled(true);
                btAlterar.setEnabled(false);
                btExcluir.setEnabled(false);

                break;
            case 3:
                pnCad.setVisible(true);
                btAlterar.setEnabled(true);
                btExcluir.setEnabled(true);
                btSalvar.setEnabled(false);
                break;
        }
        this.pack();
    }

    public void visualizarPesquisaCompleta(List<Usuario> listaDeResposta) throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) tbUsuario.getModel();
        modelo.setNumRows(0);
        listaDeResposta.forEach((p) -> {
            modelo.addRow(new Object[]{
                p.getIdUsu(),
                p.getNomeUsu(),
                p.getEmailUsu(),
                p.getSenhaUsu(),
                p.getFoneUsu(),
                p.getSexoUsu(),
                p.getCepUsu(),
                p.getLogradouroUsu(),
                p.getBairroUsu(),
                p.getCidadeUsu(),
                p.getEstadoUsu(),
                p.getNumeroUsu()
            });
        });
    }

    public boolean useRegex(String input) {
        // Compile regular expression
        Pattern pattern = Pattern.compile("[a-zA-Z]+@[a-zA-Z]+\\.[a-zA-Z]+", Pattern.CASE_INSENSITIVE);
        // Match regex against input
        Matcher matcher = pattern.matcher(input);
        // Use results...
        return matcher.matches();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuario = new javax.swing.JTable();
        btNovo = new javax.swing.JButton();
        edPesquisa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btPesquisa = new javax.swing.JButton();
        liFiltro = new javax.swing.JComboBox<>();
        pnCad = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rbM = new javax.swing.JRadioButton();
        rbF = new javax.swing.JRadioButton();
        rbO = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        edSenha2 = new javax.swing.JPasswordField();
        edNome = new javax.swing.JTextField();
        edEmail = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        edSenha1 = new javax.swing.JPasswordField();
        edFone = new javax.swing.JFormattedTextField();
        edCod = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        edLogradouro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        edBairro = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        edCidade = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        edEstado = new javax.swing.JTextField();
        edNumero = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btBuscarCep = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        edCep = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));

        tbUsuario.setBackground(new java.awt.Color(255, 102, 102));
        tbUsuario.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        tbUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod", "Nome", "E-mail", "Senha", "Fone", "Sexo", "Cep", "Logradouro", "Bairro", "Cidade", "Estado", "Numero"
            }
        ));
        tbUsuario.setSelectionBackground(new java.awt.Color(51, 51, 55));
        tbUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbUsuario);

        btNovo.setBackground(new java.awt.Color(0, 153, 102));
        btNovo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btNovo.setText("+");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        edPesquisa.setBackground(new java.awt.Color(204, 204, 204));
        edPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edPesquisaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cadastro de Usuários");

        btPesquisa.setBackground(new java.awt.Color(255, 102, 102));
        btPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loupe_79257.png"))); // NOI18N
        btPesquisa.setBorder(null);
        btPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisaActionPerformed(evt);
            }
        });

        liFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome(Padrão)", "Estado", "Cidade", "Contato", "(A-Z) Ordem alfábetica", "(Z-A) Ordem alfábetica" }));
        liFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liFiltroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(liFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(liFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2)))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnCad.setBackground(new java.awt.Color(51, 51, 51));
        pnCad.setForeground(new java.awt.Color(255, 255, 255));
        pnCad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("CÓDIGO");
        pnCad.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOME");
        pnCad.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 40, 20));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("E-MAIL");
        pnCad.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TELEFONE");
        pnCad.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, 20));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SEXO");
        pnCad.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, 30));

        rbM.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rbM);
        rbM.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        rbM.setForeground(new java.awt.Color(255, 255, 255));
        rbM.setText("MASCULINO");
        rbM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMActionPerformed(evt);
            }
        });
        pnCad.add(rbM, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        rbF.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rbF);
        rbF.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        rbF.setForeground(new java.awt.Color(255, 255, 255));
        rbF.setText("FEMININO");
        pnCad.add(rbF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        rbO.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rbO);
        rbO.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        rbO.setForeground(new java.awt.Color(255, 255, 255));
        rbO.setText("OUTROS");
        pnCad.add(rbO, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CIDADE");
        pnCad.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, -1, -1));

        edSenha2.setBackground(new java.awt.Color(204, 204, 204));
        edSenha2.setCaretColor(new java.awt.Color(153, 153, 0));
        pnCad.add(edSenha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 160, 30));

        edNome.setBackground(new java.awt.Color(204, 204, 204));
        edNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edNomeActionPerformed(evt);
            }
        });
        pnCad.add(edNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 320, 30));

        edEmail.setBackground(new java.awt.Color(204, 204, 204));
        pnCad.add(edEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 320, 30));

        btSalvar.setBackground(new java.awt.Color(0, 153, 102));
        btSalvar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        pnCad.add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 40, 40));

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
        pnCad.add(btAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, 40, 40));

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
        pnCad.add(btExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 40, 40));

        edSenha1.setBackground(new java.awt.Color(204, 204, 204));
        pnCad.add(edSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 150, 30));

        edFone.setBackground(new java.awt.Color(204, 204, 204));
        try {
            edFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)# ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pnCad.add(edFone, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 320, 30));

        edCod.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        pnCad.add(edCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 50, 30));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CONFIRMAR SENHA");
        pnCad.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        edLogradouro.setBackground(new java.awt.Color(204, 204, 204));
        edLogradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edLogradouroActionPerformed(evt);
            }
        });
        pnCad.add(edLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 330, 30));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CEP");
        pnCad.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));

        edBairro.setBackground(new java.awt.Color(204, 204, 204));
        edBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edBairroActionPerformed(evt);
            }
        });
        pnCad.add(edBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 170, 30));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("LOGRADOURO");
        pnCad.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, 20));

        edCidade.setBackground(new java.awt.Color(204, 204, 204));
        edCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edCidadeActionPerformed(evt);
            }
        });
        pnCad.add(edCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 150, 30));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("BAIRRO");
        pnCad.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, -1, -1));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ESTADO");
        pnCad.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, -1, -1));

        edEstado.setBackground(new java.awt.Color(204, 204, 204));
        edEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edEstadoActionPerformed(evt);
            }
        });
        pnCad.add(edEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 170, 30));

        edNumero.setBackground(new java.awt.Color(204, 204, 204));
        edNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edNumeroActionPerformed(evt);
            }
        });
        pnCad.add(edNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 150, 30));

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("NÚMERO");
        pnCad.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        btBuscarCep.setBackground(new java.awt.Color(0, 153, 102));
        btBuscarCep.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btBuscarCep.setText("BUSCAR CEP");
        btBuscarCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarCepActionPerformed(evt);
            }
        });
        btBuscarCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btBuscarCepKeyPressed(evt);
            }
        });
        pnCad.add(btBuscarCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 110, 30));

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("SENHA");
        pnCad.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("REBORN |");
        pnCad.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-place-marker-30 (1).png"))); // NOI18N
        pnCad.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 102));
        jLabel12.setText("Places");
        pnCad.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, -1, 20));

        edCep.setBackground(new java.awt.Color(204, 204, 204));
        try {
            edCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        edCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edCepActionPerformed(evt);
            }
        });
        edCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edCepKeyPressed(evt);
            }
        });
        pnCad.add(edCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 210, 30));

        jMenu1.setText("Cadastros");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Pontos Turísticos");
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

        jMenu2.setText("Relátorios");

        jMenuItem5.setText("Relatório 1");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem4.setText("Relatório 2");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnCad, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMActionPerformed

    private void edNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edNomeActionPerformed


    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        Usuario u = new Usuario();
        boolean isComplete = !edNome.getText().isEmpty()
                && !edEmail.getText().isEmpty()
                && !edSenha1.getText().isEmpty()
                && !edSenha2.getText().isEmpty()
                && !edFone.getText().isEmpty();

        try {
            UsuarioDAO ud = new UsuarioDAO();
            if (isComplete) {
                inserirNaEntity(u);

                if (rbM.isSelected()) {
                    u.setSexoUsu(1);
                } else if (rbF.isSelected()) {
                    u.setSexoUsu(2);
                } else {
                    u.setSexoUsu(3);
                }

                if (ehSenhaValida(edSenha1.getText(), edSenha2.getText()) && ehEmailValido(edEmail.getText())) {
                    ud.create(u);
                    controlarBtn(1);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_btSalvarActionPerformed
    private boolean ehEmailValido(String email) {
        if (useRegex(email)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null,
                    "Email inválido.");
            return false;
        }
    }

    private boolean ehSenhaValida(String senha, String senha2) {
        if (senha.equals(senha2)) {
            return true;

        } else {
            JOptionPane.showMessageDialog(null,
                    "Você inseriu senhas diferentes!");
            return false;
        }
    }

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        controlarBtn(1);

        Usuario u = new Usuario();
        try {
            UsuarioDAO ud = new UsuarioDAO();

            inserirNaEntity(u);
            u.setIdUsu(Integer.parseInt(edCod.getText()));

            if (rbM.isSelected()) {
                u.setSexoUsu(1);
            } else if (rbF.isSelected()) {
                u.setSexoUsu(2);
            } else {
                u.setSexoUsu(3);
            }
            if (edSenha1.getText().equals(edSenha2.getText())) {
                ud.update(u);
                visualizarPesquisaCompleta(ud.pesquisarTabela());
            } else {
                JOptionPane.showMessageDialog(null,
                        "Você inseriu senhas diferentes!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btAlterarActionPerformed
    private void inserirNaEntity(Usuario u) throws SQLException {
        u.setNomeUsu(edNome.getText());
        u.setEmailUsu(edEmail.getText());
        u.setSenhaUsu(edSenha1.getText());
        u.setSenhaUsu(edSenha2.getText());
        u.setFoneUsu(edFone.getText());
        u.setCepUsu(edCep.getText());
        u.setLogradouroUsu(edLogradouro.getText());
        u.setBairroUsu(edBairro.getText());
        u.setCidadeUsu(edCidade.getText());
        u.setEstadoUsu(edEstado.getText());
        u.setNumeroUsu(edNumero.getText());
    }
    private void edPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edPesquisaActionPerformed

    private void btPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisaActionPerformed
        realizarPesquisa();
    }//GEN-LAST:event_btPesquisaActionPerformed
    private void realizarPesquisa() {
        try {
            UsuarioDAO ud = new UsuarioDAO();
            switch (liFiltro.getSelectedIndex()) {
                case 0:
                    visualizarPesquisaCompleta(ud.pesquisarPorNome(edPesquisa.getText()));
                    break;
                case 1:
                    visualizarPesquisaCompleta(ud.pesquisarPorLocal("estadoUsu", edPesquisa.getText()));
                    break;
                case 2:
                    visualizarPesquisaCompleta(ud.pesquisarPorLocal("cidadeUsu", edPesquisa.getText()));
                    break;
                case 3:
                    visualizarPesquisaCompleta(ud.pesquisarPorContato(edPesquisa.getText()));
                    break;
                case 4:
                    visualizarPesquisaCompleta(ud.organizarEmOrdemAlfabetica(""));
                    break;
                case 5:
                    visualizarPesquisaCompleta(ud.organizarEmOrdemAlfabetica("desc"));
                    break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FrUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        controlarBtn(2);

        edNome.setText("");
        edEmail.setText("");
        edSenha1.setText("");
        edSenha2.setText("");
        edFone.setText("");
        edCep.setText("");
        edLogradouro.setText("");
        edBairro.setText("");
        edCidade.setText("");
        edEstado.setText("");
        edNumero.setText("");
        rbO.setSelected(true);
    }//GEN-LAST:event_btNovoActionPerformed

    private void tbUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsuarioMouseClicked
        controlarBtn(3);

        //puxa as informações do banco de dados
        if (tbUsuario.getSelectedRow() != -1) {

            //seta as informações do banco nas linhas da tabela da view, em ordem de colunas
            edCod.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 0).toString());
            edNome.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 1).toString());
            edEmail.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 2).toString());
            edSenha1.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 3).toString());
            edSenha2.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 3).toString());
            edFone.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 4).toString());
            edCep.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 6).toString());
            edLogradouro.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 7).toString());
            edBairro.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 8).toString());
            edCidade.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 9).toString());
            edEstado.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 10).toString());
            edNumero.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 11).toString());
            int s = (int) tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 5);

            if (s == 1) {
                rbM.setSelected(true);
            } else if (s == 2) {
                rbF.setSelected(true);
            } else {
                rbO.setSelected(true);
            }

        }
    }//GEN-LAST:event_tbUsuarioMouseClicked

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        controlarBtn(1);
        Usuario u = new Usuario();
        try {
            UsuarioDAO ud = new UsuarioDAO();
            u.setIdUsu(Integer.parseInt(edCod.getText()));
            ud.delete(u);
            visualizarPesquisaCompleta(ud.pesquisarTabela());

        } catch (SQLException ex) {
            Logger.getLogger(FrUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btExcluirActionPerformed

    private void edLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edLogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edLogradouroActionPerformed

    private void edBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edBairroActionPerformed

    private void edCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edCidadeActionPerformed

    private void edEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edEstadoActionPerformed

    private void edNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edNumeroActionPerformed

    private void btBuscarCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarCepActionPerformed
        BuscadorDeCep buscador = new BuscadorDeCep();
        String cep = edCep.getText();
        buscador.buscarCep(cep.replace("-", ""), getEdLogradouro(), getEdBairro(), getEdCidade(), getEdEstado());
    }//GEN-LAST:event_btBuscarCepActionPerformed

    private void btBuscarCepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btBuscarCepKeyPressed

    }//GEN-LAST:event_btBuscarCepKeyPressed

    private void edCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edCepActionPerformed

    private void edCepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edCepKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            BuscadorDeCep buscador = new BuscadorDeCep();
            String cep = edCep.getText();
            buscador.buscarCep(cep.replace("-", ""), getEdLogradouro(), getEdBairro(), getEdCidade(), getEdEstado());
        }
    }//GEN-LAST:event_edCepKeyPressed

    private void liFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_liFiltroActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            new FrPontos().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try {
            mostrarRelatorio();
        } catch (SQLException ex) {
            Logger.getLogger(FrUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(FrUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    public void mostrarRelatorio() throws SQLException, JRException {
        Connection con = null;
        
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdaulapooii", "root", "");
       
        JasperPrint print = JasperFillManager.fillReport("C:\\relatorios\\RelatorioUsuario.jasper", null, con);
        JasperViewer.viewReport(print, false);
        con.close();
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
            java.util.logging.Logger.getLogger(FrUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrUsuario().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FrUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btBuscarCep;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisa;
    private javax.swing.JButton btSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField edBairro;
    private javax.swing.JFormattedTextField edCep;
    private javax.swing.JTextField edCidade;
    private javax.swing.JLabel edCod;
    private javax.swing.JTextField edEmail;
    private javax.swing.JTextField edEstado;
    private javax.swing.JFormattedTextField edFone;
    private javax.swing.JTextField edLogradouro;
    private javax.swing.JTextField edNome;
    private javax.swing.JTextField edNumero;
    private javax.swing.JTextField edPesquisa;
    private javax.swing.JPasswordField edSenha1;
    private javax.swing.JPasswordField edSenha2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> liFiltro;
    private javax.swing.JPanel pnCad;
    private javax.swing.JRadioButton rbF;
    private javax.swing.JRadioButton rbM;
    private javax.swing.JRadioButton rbO;
    private javax.swing.JTable tbUsuario;
    // End of variables declaration//GEN-END:variables
}
