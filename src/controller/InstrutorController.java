package controller;

import java.util.ArrayList;

import dao.DAOFactory;
import dao.InstrutorDAO;
import model.Academia;
import model.Instrutor;

public class InstrutorController {
    InstrutorDAO iDAO = DAOFactory.InstrutorDAO();

    public void cadastrarInstrutor(Instrutor lVO) {
        iDAO.cadastrarInstrutor(lVO);
    }

    public ArrayList<Instrutor> listaInstrutor() {
        return iDAO.listarInstrutors();
    }

    public Instrutor buscarInstrutorPorNome(String nome) {
        return iDAO.buscarInstrutorPorNome(nome);
    }

    public void atualizarInstrutor(Instrutor lVO) {
        iDAO.atualizarInstrutor(lVO);
    }

    public boolean deletarInstrutor(int id) {
        return iDAO.deletarInstrutor(id);
    }

    public Academia getInstrutorPorId(int id) {
        return iDAO.buscarInstrutorPorId(id);
    }
}
