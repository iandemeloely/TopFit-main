package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexao.Conexao;
import model.Instrutor;

public class InstrutorDAO {
    public void cadastrarInstrutor(Instrutor iVO) {
        try {
            Connection con = Conexao.getConexao();

            String sql = "Insert into academia values ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, iVO.getNome());
            pst.setString(2, iVO.getEndereco());
            pst.setString(3, iVO.getData_De_Nascimento());
            pst.setString(4, iVO.getEmail());
            pst.setInt(5, iVO.getId());
            pst.setInt(6, iVO.getTelefone());
            pst.setString(7, iVO.getCertificadoInstrutor());
            pst.execute();
            System.out.println("Instrutor cadastrado com sucesso! ");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar instrutor: " + e.getMessage());
        }
    }

    public ArrayList<Instrutor> listarInstrutors() {
        ArrayList<Instrutor> ins = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from academia where CertificadoInstrutor is not null";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Instrutor Instrutor = new Instrutor();
                Instrutor.setId(rs.getInt("id"));
                Instrutor.setNome(rs.getString("nome"));
                Instrutor.setData_De_Nascimento(rs.getString("data_de_nascimento"));
                Instrutor.setEndereco(rs.getString("endereco"));
                Instrutor.setEmail(rs.getString("email"));
                Instrutor.setCertificadoInstrutor(rs.getString("CertificadoInstrutor"));
                Instrutor.setTelefone(rs.getInt("telefone"));
                ins.add(Instrutor);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar instrutor: \n" + e.getMessage());
        }
        return ins;
    }

    public Instrutor buscarInstrutorPorNome(String nome) {
        Instrutor Instrutor = new Instrutor();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from academia where nome like ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, "%" + nome + "%"); // Adicionando os curingas para o LIKE
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Instrutor.setId(rs.getInt("id"));
                Instrutor.setNome(rs.getString("nome"));
                Instrutor.setData_De_Nascimento(rs.getString("data_de_nascimento"));
                Instrutor.setEndereco(rs.getString("endereco"));
                Instrutor.setEmail(rs.getString("email"));
                Instrutor.setCertificadoInstrutor(rs.getString("CertificadoInstrutor"));
                Instrutor.setTelefone(rs.getInt("telefone"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar instrutor por nome: \n" + e.getMessage());
        }
        return Instrutor;
    }

    public Instrutor buscarInstrutorPorId(int id) {
        Instrutor Instrutor = new Instrutor();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from academia where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Instrutor.setId(rs.getInt("id"));
                Instrutor.setNome(rs.getString("nome"));
                Instrutor.setData_De_Nascimento(rs.getString("data_de_nascimento"));
                Instrutor.setEndereco(rs.getString("endereco"));
                Instrutor.setEmail(rs.getString("email"));
                Instrutor.setCertificadoInstrutor(rs.getString("CertificadoInstrutor"));
                Instrutor.setTelefone(rs.getInt("telefone"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar instrutor por ID: \n" + e.getMessage());
        }
        return Instrutor;
    }

    public void atualizarInstrutor(Instrutor aVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "update academia set CertificadoInstrutor = ? where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, aVO.getCertificadoInstrutor());
            pst.setInt(2, aVO.getId());
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao atualizar Instrutor: \n" + e.getMessage());
        }
    }

    public boolean deletarInstrutor(int id) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from academia where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            return pst.executeUpdate() != 0;
        } catch (Exception e) {
            System.out.println("Erro ao deletar Instrutor: \n" + e.getMessage());
        }
        return false;
    }
}
