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
            stmt = con.prepareStatement("INSERT INTO tbusuario(nomeusu,emailusu, "
                    + "senhausu, foneusu, sexousu, cepUsu, logradouroUsu, "
                    + "bairroUsu, cidadeUsu, estadoUsu, numeroUsu) "
                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
            stmt.setString(1, u.getNomeUsu());
            stmt.setString(2, u.getEmailUsu());
            stmt.setString(3, u.getSenhaUsu());
            stmt.setString(4, u.getFoneUsu());
            stmt.setInt(5, u.getSexoUsu());
            stmt.setString(6, u.getCepUsu());
            stmt.setString(7, u.getLogradouroUsu());
            stmt.setString(8, u.getBairroUsu());
            stmt.setString(9, u.getCidadeUsu());
            stmt.setString(10, u.getEstadoUsu());
            stmt.setString(11, u.getNumeroUsu());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário Salvo com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Erro: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
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

    public void update(Usuario u) {

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE tbusuario SET nomeUsu =  ?, "
                    + "emailusu = ?, senhausu =  ?, foneusu =  ?, sexousu =  ?, "
                    + "cepUsu = ?, logradouroUsu = ?, bairroUsu = ?, cidadeUsu = ?, "
                    + "estadoUsu = ?, numeroUsu = ?"
                    + "WHERE  idusu =  ?  ");
            
            stmt.setString(1, u.getNomeUsu());
            stmt.setString(2, u.getEmailUsu());
            stmt.setString(3, u.getSenhaUsu());
            stmt.setString(4, u.getFoneUsu());
            stmt.setInt(5, u.getSexoUsu());
            stmt.setString(6, u.getCepUsu());
            stmt.setString(7, u.getLogradouroUsu());
            stmt.setString(8, u.getBairroUsu());
            stmt.setString(9, u.getCidadeUsu());
            stmt.setString(10, u.getEstadoUsu());
            stmt.setString(11, u.getNumeroUsu());
            stmt.setInt(12, u.getIdUsu());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public ArrayList<Usuario> read() {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tbUsuario");
            rs = stmt.executeQuery();
            
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
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return (ArrayList<Usuario>) usuarios;
    }

    public List<Usuario> readForDesc(String nome) {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Usuario> usuarios = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tbusuario WHERE nomeusu LIKE ?");
            stmt.setString(1, "%" + nome + "%");
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsu(rs.getInt("idusu"));
                usuario.setNomeUsu(rs.getString("nomeusu"));
                usuario.setEmailUsu(rs.getString("emailusu"));
                usuario.setSenhaUsu(rs.getString("senhausu"));
                usuario.setFoneUsu(rs.getString("foneusu"));
                usuario.setSexoUsu(rs.getInt("sexousu"));
                usuario.setCepUsu(rs.getString("cepUsu"));
                usuario.setLogradouroUsu(rs.getString("logradouroUsu"));
                usuario.setBairroUsu(rs.getString("bairroUsu"));
                usuario.setCidadeUsu(rs.getString("cidadeUsu"));
                usuario.setEstadoUsu(rs.getString("estadoUsu"));
                usuario.setNumeroUsu(rs.getString("numeroUsu"));
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
