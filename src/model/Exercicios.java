package model;

public class Exercicios extends Academia {
    private String Exercicios;
    private String Series_e_Repeticoes;

    public Exercicios() {
    }

    public Exercicios(String id, String nome, String endereco, int telefone, String data_de_nascimento, String email,
            String cpf, String superior, String inferior) {
        super();
        this.Exercicios = Exercicios;
        this.Series_e_Repeticoes = Series_e_Repeticoes;
    }

    public String getExercicios() {
        return Exercicios;
    }

    public void setExercicios(String Exercicios) {
        this.Exercicios = Exercicios;
    }

    public String getSeries_e_Repeticoes() {
        return Series_e_Repeticoes;
    }

    public void setSeries_e_Repeticoes(String Series_e_Repeticoes) {
        this.Series_e_Repeticoes = Series_e_Repeticoes;
    }

    @Override
    public String toString() {
        return "Exercicios [Exercicios=" + Exercicios + ", Series_e_Repeticoes=" + Series_e_Repeticoes
                + ", getExercicios()=" + getExercicios() + ", getSeries_e_Repeticoes()=" + getSeries_e_Repeticoes()
                + ", getNome()=" + getNome() + ", getId()=" + getId() + ", getEndereco()=" + getEndereco()
                + ", getTelefone()=" + getTelefone() + ", getData_De_Nascimento()=" + getData_De_Nascimento()
                + ", getCPF()=" + getCPF() + ", getEmail()=" + getEmail() + ", toString()=" + super.toString()
                + ", getid()=" + getid() + "]";
    }

    
}
