package controller;
import java.util.ArrayList;

import dao.DAOFactory;
import model.Academia;
import model.GrupoMuscular;
public class GrupoMuscularController {
        GrupoMuscularDAO iDAO = DAOFactory.GrupoMuscularDAO();

    public void cadastrarGrupoMuscular(GrupoMuscular lVO) {
        iDAO.cadastrarGrupoMuscular(lVO);
    }

    public ArrayList<GrupoMuscular> listaGrupoMuscular() {
        return iDAO.listarGrupoMusculars();
    }

    public GrupoMuscular buscarGrupoMuscularPorNome(String nome) {
        return iDAO.buscarGrupoMuscularPorNome(nome);
    }

    public void atualizarGrupoMuscular(GrupoMuscular lVO) {
        iDAO.atualizarGrupoMuscular(lVO);
    }

    public boolean deletarGrupoMuscular(int id) {
        return iDAO.deletarGrupoMuscular(id);
    }

    public Academia getGrupoMuscularPorId(int id) {
        return iDAO.buscarGrupoMuscularPorId(id);
    }
}
