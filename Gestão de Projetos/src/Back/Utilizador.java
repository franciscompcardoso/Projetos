package Back;


import java.util.Date;

public class Utilizador implements java.io.Serializable {

    //variaveis de instancioa

    private String nome;
    private Date nascimento;
    private String email;
    private String password;


    //construtores

    public Utilizador() {
        this.nome = "";
        this.nascimento = new Date();
        this.email = "";
        this.password = "";
    }

    public Utilizador(String nome, Date nascimento, String email, String password) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.email = email;
        this.password = password;
    }

    public Utilizador(Utilizador u) {
        this.nome = u.getNome();
        this.nascimento = u.getNascimento();
        this.email = u.getEmail();
        this.password = u.getPassword();
    }

    


    //seletores
    public String getNome() {
        return this.nome;
    }

    public Date getNascimento() {
        return this.nascimento;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }


    //modificadores

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    //outros metodos


    //Metodo toString

    @Override
    public String toString() {
        StringBuilder s2 = new StringBuilder();                                   
        s2.append("User : " + nome + ", ");
        s2.append("Password : " + password + ", ");
        s2.append("Email : " + email + ", ");
        s2.append("Data de Nascimento" + nascimento + " ");
        return s2.toString();

    }

    

   


}
