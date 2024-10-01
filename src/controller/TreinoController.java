package controller;

import java.util.ArrayList;

import dao.DAOFactory;
import dao.TreinoDAO;
import model.Treino;


public class TreinoController {
    TreinoDAO tDAO = DAOFactory.TreinoDAO();

    public void cadastrarTreino(Treino tVO) {
        tDAO.cadastrarTreino(tVO);
    }

    public ArrayList<Treino> listarTreinos() {
        return tDAO.listarTreinos();
    }

    public Treino getTreinosByNome(String nome) {
        return tDAO.getTreinoByNome(nome);
    }

    public void atualizarTreino(Treino tVO) {
        tDAO.atualizarTreino(tVO);
    }

    public boolean deletarTreinos(int id) {
        return tDAO.deletarTreino(id);
    }

    public Treino getTreinoById(int id) {
        return tDAO.getTreinoById(id);
    }
}
