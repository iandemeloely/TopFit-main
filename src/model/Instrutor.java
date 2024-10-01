package model;

public class Instrutor extends Academia {
    private String certificado_instrutor;

    public Instrutor() {
    }

    public Instrutor(String id, String nome, String endereco, int telefone, String data_de_nascimento, String email, String cpf, String certificado_instrutor) {
        super(); // Chama o construtor da classe mãe
        this.certificado_instrutor = certificado_instrutor;
    }

    public String getCertificadoInstrutor() {
        return certificado_instrutor;
    }

    public void setCertificadoInstrutor(String certificado_instrutor) {
        this.certificado_instrutor = certificado_instrutor;
    }

    public String toString() {
        return "Instrutor [getNome()=" + getNome() + ", getId()=" + getId() + ", getEndereco()=" + getEndereco() +
        ", getTelefone()=" + getTelefone() + ", getDataDeNascimento()=" + getData_De_Nascimento() +
        ", getEmail()=" + getEmail() + ", getCpf()=" + getCPF() + ", getCertificadoInstrutor()=" + getCertificadoInstrutor() + "]";
    }


}
