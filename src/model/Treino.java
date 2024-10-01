package model;

public class Treino extends Academia {
    private String superior;
    private String inferior;

    public Treino() {
    }
    public Treino(String id, String nome, String endereco, int telefone, String data_de_nascimento, String email, String cpf, String superior, String inferior) {
        super();
        this.superior = superior;
    }

    public String getsuperior() {
        return superior;
    }

    public void setsuperior(String superior) {
        this.superior = superior;
    }
    public String getinferior (){
        return inferior;
    }
    public void setinferior(String inferior){
        this.inferior = inferior;
    }
    public String toString() {
        return "Instrutor [getNome()=" + getNome() + ", getId()=" + getId() + ", getEndereco()=" + getEndereco() +
        ", getTelefone()=" + getTelefone() + ", getDataDeNascimento()=" + getData_De_Nascimento() +
        ", getEmail()=" + getEmail() + ", getCpf()=" + getCPF() + ", getsuperior()=" + getsuperior() +", getinferior" + getinferior() + "]";
    }

}