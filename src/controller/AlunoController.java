package controller;
import java.util.ArrayList;

import dao.AlunoDAO;
import dao.DAOFactory;
import model.Aluno;
public class AlunoController {
    AlunoDAO aDAO = DAOFactory.AlunoDAO();

    public void cadastrarAluno(Aluno aVO) {
        aDAO.cadastrarAluno(aVO);
    }

    public ArrayList<Aluno> listaAlunos() {
        return aDAO.listarAlunos();
    }

    public Aluno buscarAlunoPorNome(String nome) {
        return aDAO.buscarAlunoPorNome(nome);
    }

    public void atualizarAluno(Aluno aVO) {
        aDAO.atualizarAluno(aVO);
    }

    public boolean deletarAluno(int id) {
        return aDAO.deletarAluno(id);
    }
        public Aluno buscarAlunoPorId(int id) {
        return aDAO.buscarAlunoPorId(id);
    }
}
