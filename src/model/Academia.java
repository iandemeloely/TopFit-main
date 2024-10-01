package model;

public class Academia {
    private int Id;
    private String Nome;
    private String Endereco;
    private int Telefone;
    private String Data_De_Nascimento;
    private String Email;
    private int CPF;
    public Academia() {
    }
    //Clase para aluno e instrutor
    /**
     * @param Id
     * @param Nome
     * @param Endereco
     * @param Telefone
     * @param Data_De_Nascimento
     * @param Email
     * @param CPF
     */
    public Academia(int Id, String Nome, String Endereco, int Telefone, String Data_De_Nascimento,String Email, int CPF) {
        this.Id = Id;
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
        this.Data_De_Nascimento = Data_De_Nascimento;
        this.Email = Email;
        this.CPF = CPF;
    }
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }

    public String getData_De_Nascimento() {
        return Data_De_Nascimento;
    }

    public void setData_De_Nascimento(String Data_De_Nascimento) {
        this.Data_De_Nascimento = Data_De_Nascimento;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getEmail(){
        return Email;
    }

    public void setEmail(String Email){
        this.Email = Email;
    }
    
    public String toString() {
        return "Pessoa [Nome=" + Nome + ", Id=" + Id + ",Endereco=" +Endereco + ", Telefone=" + Telefone + ", Data_De_Nascimento=" + Data_De_Nascimento
                + ", CPF=" + CPF + "]";
    }

    public int getid() {
        return Id;
    }

    public void setid(int Id) {
        this.Id = Id;
    }
}
