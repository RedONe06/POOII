package br.ulbra.DAO;

import br.ulbra.DAO.ConnectionFactory;
import br.ulbra.entity.Ponto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class PontoDAO {

    Connection con;

    public PontoDAO() throws SQLException {
        con = ConnectionFactory.getConnection();
    }

    //MÉTODO CRIADO PARA INSERIR USUÁRIO NO BANCO DE DADOS
    public void create(Ponto p) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO tbPontos(nomePonto, ruaPonto, "
                    + "numeroPonto, cidadePonto, estadoPonto, contatoPonto, descricaoPonto) "
                    + "VALUES( ?,  ?,  ?,  ?,  ?, ?, ?)");

            stmt.setString(1, p.getNomePonto());
            stmt.setString(2, p.getRuaPonto());
            stmt.setInt(3, p.getNumeroPonto());
            stmt.setString(4, p.getCidadePonto());
            stmt.setString(5, p.getEstadoPonto());
            stmt.setString(6, p.getContatoPonto());
            stmt.setString(7, p.getDescricaoPonto());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Ponto turístico salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Erro: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    // MÉTODO CRIADO PARA EXCLUIR DO BANCO DE DADOS
    public void delete(Ponto p) {

        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement("DELETE FROM tbPonto WHERE idPonto = ? ");
            stmt.setInt(1, p.getIdPonto());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, " Ponto turístico excluído com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir:" + ex.getMessage());

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    //MÉTODO CRIADO PARA MODIFICAR NO BANCO DE DADOS
    public void update(Ponto p) {

        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement("UPDATE tbpontos SET nomePonto =  ?, ruaPonto = ?, numeroPonto =  ?, "
                    + "cidadePonto =  ?, estadoPonto =  ?, contatoPonto = ?, descricaoPonto = ? WHERE  idPonto =  ?  ");

            stmt.setString(1, p.getNomePonto());
            stmt.setString(2, p.getRuaPonto());
            stmt.setInt(3, p.getNumeroPonto());
            stmt.setString(4, p.getCidadePonto());
            stmt.setString(5, p.getEstadoPonto());
            stmt.setString(6, p.getContatoPonto());
            stmt.setString(7, p.getDescricaoPonto());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    //Método utilizado para preencher a tabela que se encontra no formulário de Usuarios
    public ArrayList<Ponto> read() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Ponto> pontos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM tbPontos");
            rs = stmt.executeQuery();
            while (rs.next()) {
                
                Ponto ponto = new Ponto();
                
                ponto.setIdPonto(rs.getInt("idPonto"));
                ponto.setNomePonto(rs.getString("nomePonto"));
                ponto.setRuaPonto(rs.getString("ruaPonto"));
                ponto.setNumeroPonto(rs.getInt("numeroPonto"));
                ponto.setCidadePonto(rs.getString("cidadePonto"));
                ponto.setEstadoPonto(rs.getString("estadoPonto"));
                ponto.setContatoPonto(rs.getString("contatoPonto"));
                ponto.setDescricaoPonto(rs.getString("descricaoPonto"));
               
                pontos.add(ponto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return (ArrayList<Ponto>) pontos;
    }

    //metodo para pesquisar pessoa por nome
    public List<Ponto> readForDesc(String nome) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Ponto> pontos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tbpontos WHERE nomePonto LIKE ?");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Ponto ponto = new Ponto();
                ponto.setIdPonto(rs.getInt("idPonto"));
                ponto.setNomePonto(rs.getString("nomePonto"));
                ponto.setRuaPonto(rs.getString("ruaPonto"));
                ponto.setNumeroPonto(rs.getInt("numeroPonto"));
                ponto.setCidadePonto(rs.getString("cidadePonto"));
                ponto.setEstadoPonto(rs.getString("estadoPonto"));
                ponto.setContatoPonto(rs.getString("contatoPonto"));
                ponto.setDescricaoPonto(rs.getString("descricaoPonto"));
                pontos.add(ponto);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return pontos;
    }

}
