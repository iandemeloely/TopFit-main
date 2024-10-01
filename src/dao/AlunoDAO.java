package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexao.Conexao;
import model.Aluno;

public class AlunoDAO {
    public void cadastrarAluno(Aluno aVO) {
        try {
            Connection con = Conexao.getConexao();

            String sql = "Insert into academia values ( ?, ?, ?, ?, ?, ?, ?, ?, null)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, aVO.getNome());
            pst.setString(2, aVO.getEndereco());
            pst.setString(3, aVO.getData_De_Nascimento());
            pst.setString(4, aVO.getEmail());
            pst.setInt(5, aVO.getId());
            pst.setString(6, aVO.getInfo_Medicas());
            pst.setInt(7, aVO.getTelefone());
            pst.setInt(8, aVO.getMatricula());
            pst.execute();
            System.out.println("Aluno cadastrado com sucesso! ");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar aluno: " + e.getMessage());
        }
    }

    public ArrayList<Aluno> listarAlunos() {
        ArrayList<Aluno> alunos = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from academia where matricula is not null";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setData_De_Nascimento(rs.getString("data_de_nascimento"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setInfo_Medicas(rs.getString("info_medicas"));
                aluno.setEmail(rs.getString("email"));
                aluno.setMatricula(rs.getInt("matricula"));
                aluno.setTelefone(rs.getInt("telefone"));
                alunos.add(aluno);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar Alunos: \n" + e.getMessage());
        }
        return alunos;
    }

    public Aluno buscarAlunoPorNome(String nome) {
        Aluno aluno = new Aluno();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from academia where nome like ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, "%" + nome + "%"); // Adicionando os curingas para o LIKE
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setData_De_Nascimento(rs.getString("data_de_nascimento"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setEmail(rs.getString("email"));
                aluno.setInfo_Medicas(rs.getString("info_medicas"));
                aluno.setMatricula(rs.getInt("matricula"));
                aluno.setTelefone(rs.getInt("telefone"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar Aluno por nome: \n" + e.getMessage());
        }
        return aluno;
    }

    public Aluno buscarAlunoPorId(int id) {
        Aluno aluno = new Aluno();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from academia where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setData_De_Nascimento(rs.getString("data_de_nascimento"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setEmail(rs.getString("email"));
                aluno.setInfo_Medicas(rs.getString("info_medicas"));
                aluno.setMatricula(rs.getInt("matricula"));
                aluno.setTelefone(rs.getInt("telefone"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar Aluno por ID: \n" + e.getMessage());
        }
        return aluno;
    }

    public void atualizarAluno(Aluno aVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "update academia set data_de_nascimento = ? where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, aVO.getData_De_Nascimento());
            pst.setInt(2, aVO.getId());
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao atualizar Aluno: \n" + e.getMessage());
        }
    }

    public boolean deletarAluno(int id) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from academia where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            return pst.executeUpdate() != 0;
        } catch (Exception e) {
            System.out.println("Erro ao deletar Aluno: \n" + e.getMessage());
        }
        return false;
    }
}