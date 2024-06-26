package Back;



import static Back.GestaoProjetos.ser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;



public class Projeto implements java.io.Serializable {


    private Utilizador owner;
    private String nome;
    private String descricao;
    private Date inicio;
    private Date fim;
    private Map<String, Utilizador> colaboradores;
    private List<Tarefa> tarefas;
    


    //construtores
    public Projeto() {
        this.owner = new Utilizador();
        this.nome = nome;
        this.descricao = descricao;
        this.inicio = new Date();
        this.fim = new Date();
        this.colaboradores = new HashMap<String, Utilizador>();
        this.tarefas = new ArrayList<Tarefa>();
        
    }

    public Projeto(Utilizador owner, String nome, String descricao, Date inicio, Date fim,Map<String, Utilizador> colaboradores, List<Tarefa> tarefas) {
        this.owner = owner;
        this.nome = nome;
        this.descricao = descricao;
        this.inicio = inicio;
        this.fim = fim;
        this.colaboradores = colaboradores;
        this.tarefas = tarefas;
        this.colaboradores.put(owner.getEmail(), owner);
       
    }

   





    //seletores

    public Utilizador getOwner() {
        return this.owner;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public Date getInicio() {
        return this.inicio;
    }

    public Date getFim() {
        return fim;
    }

    public Map<String, Utilizador> getColaboradores() {
        return this.colaboradores;
    }

    public List<Tarefa> getTarefas() {
        return this.tarefas;
    }


    //modificadores

    public void setOwner(Utilizador owner) {
        this.owner = owner;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    public void setColaboradores(Map<String, Utilizador> colaboradores) {
        this.colaboradores = colaboradores;
    }

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }


    
      
    //UTLIZADOR

    //adicionar Utilizador
    public void adicionarUtilizador(Utilizador u){
        this.colaboradores.put(u.getEmail(), u);
    }

    //remover Utilizador
    public void removerUtilizador(String email){
        this.colaboradores.remove(email);
    }

    //numero de utilizadores existentes
    public int numUtilExiste() {
        return this.colaboradores.size();
    }

    //retorna lista de utilizadores
    public Map<String, Utilizador> visualizarUtilizadores(){
        return this.colaboradores;
    }


    //TAREFA


    //adicionar Tarefa
    public void adicionarTarefa (Tarefa e){
        this.tarefas.add(e);
        
    }

    //remover Tarefa
    public void removerTarefa (Tarefa e){
        this.tarefas.remove(e);
    }

    //numero de Tarefas
    public int numTarefaExiste() {
        return this.tarefas.size();
    }

    //retorna lista de Tarefas
    public List<Tarefa> visualizarTarefas(){
        return this.tarefas;
    }


    //outros metodos
    
    //tarefas diarias
    public static Double percentagem(){
        
SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
String inputString1 = "10-07-1998";
String inputString2 = "14-06-1998";

String teste1 = inputString1.replace('-', ' ');
String teste2 = inputString2.replace('-', ' ');

StringBuilder dias = new StringBuilder();


try {
    Date date1 = myFormat.parse(teste1);
    Date date2 = myFormat.parse(teste2);
    long diff = date2.getTime() - date1.getTime();
    
    dias.append(TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
 
} catch (ParseException e) {
    e.printStackTrace();
}   

    Long diasT = Long.valueOf(dias.toString().trim());
    
    System.out.println ("Days: " + diasT);
    
    Integer tarefas = 12 ;
    
    System.out.println ("tarefas: " + tarefas);
    
    Double teste = (double) diasT / (double)tarefas; 

    return teste;
       
    }




    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Projeto) &&
                this.nome.equals(((Projeto) obj).getNome()) &&
                    this.owner.equals(((Projeto) obj).getOwner());
    }

    //Metodo toString
    public String toString() {
        StringBuilder s2 = new StringBuilder();
        s2.append("Owner : " + owner + ", ");
        s2.append("Nome Projeto : " + nome + ", ");
        s2.append("Descrição : " + descricao + ", ");
        s2.append("Data Inicio : " + inicio + ", ");
        s2.append("Data Fim : " + fim + ", ");
        s2.append("Lista Utilizadores no Projeto : " + colaboradores + ", ");
        s2.append("Lista Tarefas no Projeto: " + tarefas + " ");
        return s2.toString();


    }


} 
    
    

