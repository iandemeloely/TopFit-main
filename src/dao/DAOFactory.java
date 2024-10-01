package dao;

public class DAOFactory {
    private static AlunoDAO aDAO = new AlunoDAO();

    public static AlunoDAO AlunoDAO() {
        return aDAO;
    }

    private static InstrutorDAO iDAO = new InstrutorDAO();

    public static InstrutorDAO InstrutorDAO() {
        return iDAO;
    }

    private static TreinoDAO tDAO = new TreinoDAO();

    public static TreinoDAO TreinoDAO() {
        return tDAO;
    }

    private static GrupuMuscularDAO gmDAO = new GrupuMuscularDAO();

    public static GrupuMuscularDAO GrupuMuscularDAO() {
        return gmDAO;
    }

    private static ExerciciosDAO eDAO = new ExerciciosDAO();

    public static ExerciciosDAO ExerciciosDAO() {
        return eDAO;
    }
}
