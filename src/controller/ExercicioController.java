package controller;

public class ExercicioController {
    private static AlunoController AlunoC = new AlunoController();

    public static AlunoController getAlunoController() {
        return AlunoC;
    }

    private static InstrutorController InstrutorC = new InstrutorController();

    public static InstrutorController getInstrutorController() {
        return InstrutorC;
    }

    private static TreinoController TreinoC = new TreinoController();

    public static TreinoController getTreinoController() {
        return TreinoC;
    }
    private static GrupoMuscularController GrupoMuscularC = new GrupoMuscularController();

    public static GrupoMuscularController getGrupoMuscularController(){
        return GrupoMuscularC;
    }

    private static ExercicioController ExercicioC = new ExercicioController();

    public static ExercicioController getExercicioController(){
        return ExercicioC;
    }
}
