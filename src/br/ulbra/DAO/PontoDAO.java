package br.ulbra.DAO;

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

    public void criar(Ponto p) {
        PreparedStatement stmt = null;
        try {
            stmt = inserirValoresPrincipaisNoStmt(p, "INSERT INTO tbpontos(nomePonto, ruaPonto, "
                    + "numeroPonto, cidadePonto, estadoPonto, contatoPonto, descricaoPonto, cepPonto) "
                    + "VALUES( ?,  ?,  ?,  ?,  ?, ?, ?, ?)");

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Ponto turístico salvo com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Erro: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void delete(Ponto p) {

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tbpontos WHERE idPonto = ? ");

            stmt.setInt(1, p.getIdPonto());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Ponto turístico excluído com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir:" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void update(Ponto p) {

        PreparedStatement stmt = null;

        try {
            stmt = inserirValoresPrincipaisNoStmt(p, "UPDATE tbpontos SET nomePonto =  ?, ruaPonto = ?, numeroPonto =  ?, "
                    + "cidadePonto =  ?, estadoPonto =  ?, contatoPonto = ?, descricaoPonto = ?, cepPonto = ? WHERE idPonto = ?");

            stmt.setInt(9, p.getIdPonto());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public ArrayList<Ponto> organizarEmOrdemAlfabetica(String tipoOrdem) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Ponto> pontos = new ArrayList<>();

        try {
            if (tipoOrdem.equals("desc")) {
                stmt = con.prepareStatement("SELECT * FROM tbpontos ORDER BY nomePonto DESC");

            } else {
                stmt = con.prepareStatement("SELECT * FROM tbpontos ORDER BY nomePonto");
            }
            
            separarResultados(stmt.executeQuery(), pontos);

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return (ArrayList<Ponto>) pontos;
    }

    public List<Ponto> atualizarTabela() {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Ponto> pontos = new ArrayList<>();

        try {

            stmt = con.prepareStatement("SELECT * FROM tbpontos");
            separarResultados(stmt.executeQuery(), pontos);

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return pontos;
    }

    public List<Ponto> pesquisarPorNome(String nome) {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Ponto> pontos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tbpontos WHERE nomePonto LIKE ?");
            stmt.setString(1, "%" + nome + "%");

            separarResultados(stmt.executeQuery(), pontos);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return pontos;
    }

    public List<Ponto> pesquisarPorLocal(String campoBd, String pesquisa) {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Ponto> pontos = new ArrayList<>();
        String args = campoBd + " like '%" + pesquisa + "%'";

        try {
            stmt = con.prepareStatement("SELECT * FROM tbpontos WHERE " + args);

            rs = stmt.executeQuery();

            while (rs.next()) {
                Ponto ponto = new Ponto();
                ponto.setIdPonto(rs.getInt("idPonto"));
                ponto.setNomePonto(rs.getString("nomePonto"));
                ponto.setRuaPonto("");
                ponto.setNumeroPonto("");
                ponto.setCidadePonto(rs.getString("cidadePonto"));
                ponto.setEstadoPonto(rs.getString("estadoPonto"));
                ponto.setContatoPonto(rs.getString("contatoPonto"));
                ponto.setDescricaoPonto("");
                ponto.setCepPonto("");

                pontos.add(ponto);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return pontos;
    }

    public List<Ponto> pesquisarPorContato(String nome) {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Ponto> pontos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tbpontos WHERE contatoPonto LIKE ?");
            stmt.setString(1, "%" + nome + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {
                Ponto ponto = new Ponto();
                ponto.setIdPonto(rs.getInt("idPonto"));
                ponto.setNomePonto(rs.getString("nomePonto"));
                ponto.setContatoPonto(rs.getString("contatoPonto"));
                ponto.setRuaPonto("");
                ponto.setNumeroPonto("");
                ponto.setCidadePonto("");
                ponto.setEstadoPonto("");
                ponto.setContatoPonto("");
                ponto.setDescricaoPonto("");
                ponto.setCepPonto("");
                pontos.add(ponto);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return pontos;
    }

    public PreparedStatement inserirValoresPrincipaisNoStmt(Ponto ponto, String comandoBd) throws SQLException {
        PreparedStatement stmt = con.prepareStatement(comandoBd);

        stmt.setString(1, ponto.getNomePonto());
        stmt.setString(2, ponto.getRuaPonto());
        stmt.setString(3, ponto.getNumeroPonto());
        stmt.setString(4, ponto.getCidadePonto());
        stmt.setString(5, ponto.getEstadoPonto());
        stmt.setString(6, ponto.getContatoPonto());
        stmt.setString(7, ponto.getDescricaoPonto());
        stmt.setString(8, ponto.getCepPonto());

        return stmt;
    }
    
    public void separarResultados(ResultSet rs, List<Ponto> pontos) throws SQLException {
        while (rs.next()) {

            Ponto ponto = new Ponto();

            ponto.setIdPonto(rs.getInt("idPonto"));
            ponto.setNomePonto(rs.getString("nomePonto"));
            ponto.setRuaPonto(rs.getString("ruaPonto"));
            ponto.setNumeroPonto(rs.getString("numeroPonto"));
            ponto.setCidadePonto(rs.getString("cidadePonto"));
            ponto.setEstadoPonto(rs.getString("estadoPonto"));
            ponto.setContatoPonto(rs.getString("contatoPonto"));
            ponto.setDescricaoPonto(rs.getString("descricaoPonto"));
            ponto.setCepPonto(rs.getString("cepPonto"));

            pontos.add(ponto);
        }
    }
}

