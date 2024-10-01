package model;

public class GrupoMuscular extends Academia {
    private String Torax;
    private String Ombro;
    private String Triceps;
    private String Costas;
    private String Abdomem;
    private String Biceps;
    private String Pernas;
    private String Gluteo;

    public GrupoMuscular() {
    }

    public GrupoMuscular(String id, String nome, String endereco, int telefone, String data_de_nascimento, String email, String cpf, String superior, String inferior, String Torax, String Ombro, String Triceps, String Costas, String Abdomem, String  Biceps, String Pernas, String Gluteo) {
        super();
        this.Torax = Torax;
        this.Ombro = Ombro;
        this.Triceps = Triceps;
        this.Costas = Costas;
        this.Abdomem = Abdomem;
        this.Biceps = Biceps;
        this.Pernas = Pernas;
        this.Gluteo = Gluteo;
    }

    public String getTorax() {
        return Torax;
    }

    public void setTorax(String Torax) {
        this.Torax = Torax;
    }

    public String getOmbro() {
        return Ombro;
    }

    public void setOmbro(String Ombro) {
        this.Ombro = Ombro;
    }

    public String getCostas() {
        return Costas;
    }

    public void setCostas(String Costas) {
        this.Costas = Costas;
    }

    public String getAbdomem() {
        return Abdomem;
    }

    public void setAbdomem(String Abdomem) {
        this.Abdomem = Abdomem;
    }

    public String getBiceps() {
        return Biceps;
    }

    public void setBiceps(String Biceps) {
        this.Biceps = Biceps;
    }

    public String getPernas() {
        return Pernas;
    }

    public void setPernas(String Pernas) {
        this.Pernas = Pernas;
    }

    public String getGluteo() {
        return Gluteo;
    }

    public void setGluteo(String Gluteo) {
        this.Gluteo = Gluteo;
    }

    @Override
    public String toString() {
        return "GrupoMuscular [Torax=" + Torax + ", Ombro=" + Ombro + ", Triceps=" + Triceps + ", Costas=" + Costas
                + ", Abdomem=" + Abdomem + ", Biceps=" + Biceps + ", Pernas=" + Pernas + ", Gluteo=" + Gluteo
                + ", getNome()=" + getNome() + ", getTorax()=" + getTorax() + ", getId()=" + getId() + ", getOmbro()="
                + getOmbro() + ", getEndereco()=" + getEndereco() + ", getCostas()=" + getCostas() + ", getTelefone()="
                + getTelefone() + ", getAbdomem()=" + getAbdomem() + ", getData_De_Nascimento()="
                + getData_De_Nascimento() + ", getBiceps()=" + getBiceps() + ", getCPF()=" + getCPF() + ", getPernas()="
                + getPernas() + ", getEmail()=" + getEmail() + ", getGluteo()=" + getGluteo() + "]";
    }

    
}
