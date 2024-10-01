package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexao.Conexao;
import model.Treino;

public class TreinoDAO {
    public Treino cadastrarTreino(Treino tVO) {
        Treino t = new Treino();
        try (Connection con = Conexao.getConexao()) {
            String sql = "INSERT INTO academia (nome, id, inferior, superior) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, tVO.getNome());
            pst.setInt(2, tVO.getId());
            pst.setString(3, tVO.getinferior());
            pst.setString(4, tVO.getsuperior());
            pst.executeUpdate();
            System.out.println("Treino cadastrado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar Treino: " + e.getMessage());
        }
        return t;
    }

    public ArrayList<Treino> listarTreinos() {
        ArrayList<Treino> treinos = new ArrayList<>();
        try (Connection con = Conexao.getConexao()) {
            String sql = "SELECT * FROM academia WHERE matricula IS NOT NULL";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Treino treino = new Treino();
                treino.setId(rs.getInt("id"));
                treino.setNome(rs.getString("nome"));
                treino.setData_De_Nascimento(rs.getString("data_de_nascimento"));
                treino.setEndereco(rs.getString("endereco"));
                treino.setEmail(rs.getString("email"));
                treino.setTelefone(rs.getInt("telefone"));
                treino.setinferior(rs.getString("inferior"));
                treino.setsuperior(rs.getString("superior"));
                treinos.add(treino);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar treinos: " + e.getMessage());
        }
        return treinos;
    }

    public Treino getTreinoByNome(String nome) {
        Treino t = null;
        try (Connection con = Conexao.getConexao()) {
            String sql = "SELECT * FROM academia WHERE nome LIKE ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                t = new Treino();
                t.setId(rs.getInt("id"));
                t.setNome(rs.getString("nome"));
                t.setinferior(rs.getString("inferior"));
                t.setsuperior(rs.getString("superior"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar Treino: " + e.getMessage());
        }
        return t;
    }

    public Treino getTreinoById(int id) {
        Treino t = null;
        try (Connection con = Conexao.getConexao()) {
            String sql = "SELECT * FROM academia WHERE id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                t = new Treino();
                t.setId(rs.getInt("id"));
                t.setNome(rs.getString("nome"));
                t.setinferior(rs.getString("inferior"));
                t.setsuperior(rs.getString("superior"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar Treino: " + e.getMessage());
        }
        return t;
    }

    public void atualizarTreino(Treino tVO) {
        try (Connection con = Conexao.getConexao()) {
            String sql = "UPDATE academia SET inferior = ?, superior = ? WHERE id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, tVO.getinferior());
            pst.setString(2, tVO.getsuperior());
            pst.setInt(3, tVO.getId());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar Treino: " + e.getMessage());
        }
    }

    public boolean deletarTreino(int id) {
        try (Connection con = Conexao.getConexao()) {
            String sql = "DELETE FROM academia WHERE id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            return pst.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Erro ao deletar Treino: " + e.getMessage());
        }
        return false;
    }
}