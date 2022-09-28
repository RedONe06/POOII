package br.ulbra.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import br.ulbra.entity.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    Connection con;

    public UsuarioDAO() throws SQLException {
        con = ConnectionFactory.getConnection();
    }

    public boolean checkLogin(String login, String senha) {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {
            stmt = con.prepareStatement("SELECT * FROM tbusuario"
                    + " WHERE emailUsu = ? and senhaUsu = ?");

            stmt.setString(1, login);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();
            if (rs.next()) {
                check = true;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return check;
    }

    public void create(Usuario u) {

        PreparedStatement stmt = null;

        try {
            stmt = inserirValoresPrincipaisNoStmt(u, "INSERT INTO tbusuario(nomeusu,emailusu, "
                    + "senhausu, foneusu, sexousu, cepUsu, logradouroUsu, "
                    + "bairroUsu, cidadeUsu, estadoUsu, numeroUsu) "
                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário Salvo com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Erro: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void update(Usuario u) {

        PreparedStatement stmt = null;

        try {
            stmt = inserirValoresPrincipaisNoStmt(u, "UPDATE tbusuario SET nomeUsu =  ?, "
                    + "emailusu = ?, senhausu =  ?, foneusu =  ?, sexousu =  ?, "
                    + "cepUsu = ?, logradouroUsu = ?, bairroUsu = ?, cidadeUsu = ?, "
                    + "estadoUsu = ?, numeroUsu = ?"
                    + "WHERE  idusu =  ?  ");

            stmt.setInt(12, u.getIdUsu());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public PreparedStatement inserirValoresPrincipaisNoStmt(Usuario usuario, String comandoBd) throws SQLException {
        PreparedStatement stmt = con.prepareStatement(comandoBd);

        stmt.setString(1, usuario.getNomeUsu());
        stmt.setString(2, usuario.getEmailUsu());
        stmt.setString(3, usuario.getSenhaUsu());
        stmt.setString(4, usuario.getFoneUsu());
        stmt.setInt(5, usuario.getSexoUsu());
        stmt.setString(6, usuario.getCepUsu());
        stmt.setString(7, usuario.getLogradouroUsu());
        stmt.setString(8, usuario.getBairroUsu());
        stmt.setString(9, usuario.getCidadeUsu());
        stmt.setString(10, usuario.getEstadoUsu());
        stmt.setString(11, usuario.getNumeroUsu());

        return stmt;
    }

    public void delete(Usuario u) {

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tbusuario WHERE idusu = ? ");
            stmt.setInt(1, u.getIdUsu());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, " Usuário excluído com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir:" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public List<Usuario> pesquisarTabela() {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tbUsuario");
            separarResultados(stmt.executeQuery(), usuarios);

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return usuarios;
    }

    public List<Usuario> pesquisarPorNome(String nome) {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Usuario> usuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tbusuario WHERE nomeusu LIKE ?");
            stmt.setString(1, "%" + nome + "%");

            separarResultados(stmt.executeQuery(), usuarios);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return usuarios;
    }

    public ArrayList<Usuario> organizarEmOrdemAlfabetica(String tipoOrdem) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<>();

        try {
            if (tipoOrdem.equals("desc")) {
                stmt = con.prepareStatement("SELECT * FROM tbusuario ORDER BY nomeUsu DESC");

            } else {
                stmt = con.prepareStatement("SELECT * FROM tbusuario ORDER BY nomeUsu");
            }

            separarResultados(stmt.executeQuery(), usuarios);

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return (ArrayList<Usuario>) usuarios;
    }

    public void separarResultados(ResultSet rs, List<Usuario> usuarios) throws SQLException {
        while (rs.next()) {
            Usuario usuario = new Usuario();
            usuario.setIdUsu(rs.getInt("idUsu"));
            usuario.setNomeUsu(rs.getString("nomeUsu"));
            usuario.setEmailUsu(rs.getString("emailUsu"));
            usuario.setFoneUsu(rs.getString("foneUsu"));
            usuario.setSexoUsu(rs.getInt("sexoUsu"));
            usuario.setSenhaUsu(rs.getString("senhaUsu"));
            usuario.setCepUsu(rs.getString("cepUsu"));
            usuario.setLogradouroUsu(rs.getString("logradouroUsu"));
            usuario.setBairroUsu(rs.getString("bairroUsu"));
            usuario.setCidadeUsu(rs.getString("cidadeUsu"));
            usuario.setEstadoUsu(rs.getString("estadoUsu"));
            usuario.setNumeroUsu(rs.getString("numeroUsu"));

            usuarios.add(usuario);
        }
    }

    public List<Usuario> pesquisarPorLocal(String campoBd, String pesquisa) {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<>();
        String args = campoBd + " like '%" + pesquisa + "%'";

        try {
            stmt = con.prepareStatement("SELECT * FROM tbusuario WHERE " + args);

            rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsu(rs.getInt("idUsu"));
                usuario.setNomeUsu(rs.getString("nomeUsu"));
                usuario.setEmailUsu("");
                usuario.setFoneUsu(rs.getString("foneUsu"));
                usuario.setSexoUsu(rs.getInt("sexoUsu"));
                usuario.setSenhaUsu("");
                usuario.setCepUsu("");
                usuario.setLogradouroUsu("");
                usuario.setBairroUsu("");
                usuario.setCidadeUsu(rs.getString("cidadeUsu"));
                usuario.setEstadoUsu(rs.getString("estadoUsu"));
                usuario.setNumeroUsu("");

                usuarios.add(usuario);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return usuarios;
    }
    
    public List<Usuario> pesquisarPorContato(String nome) {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tbusuario WHERE foneUsu LIKE ?");
            stmt.setString(1, "%" + nome + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsu(rs.getInt("idUsu"));
                usuario.setNomeUsu(rs.getString("nomeUsu"));
                usuario.setEmailUsu("");
                usuario.setFoneUsu(rs.getString("foneUsu"));
                usuario.setSexoUsu(rs.getInt("sexoUsu"));
                usuario.setSenhaUsu("");
                usuario.setCepUsu("");
                usuario.setLogradouroUsu("");
                usuario.setBairroUsu("");
                usuario.setCidadeUsu("");
                usuario.setEstadoUsu("");
                usuario.setNumeroUsu("");
                
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return usuarios;
    }
}
