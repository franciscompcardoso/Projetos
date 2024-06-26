package Back;

import java.util.Date;

public class Tarefa implements java.io.Serializable {

    private String titulo;
    private String descricao;
    private String prioridade;     //baixa media alta
    private Date inicio;
    private Date fim;
    private String estado;
    private Utilizador colaborador;


    //construtor
    public Tarefa() {
        this.titulo = "";
        this.descricao = "";
        this.prioridade = "";
        this.inicio = new Date();
        this.fim = new Date();
        this.estado = "";
        this.colaborador = new Utilizador();
    }

    public Tarefa(String titulo,
                  String descricao,
                  String prioridade,
                  Date inicio,
                  Date fim,
                  String estado_tarefa,
                  Utilizador colaborador) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.inicio = inicio;
        this.fim = fim;
        this.estado = estado_tarefa;
        this.colaborador = colaborador;
    }


    //seletores

    public String getTitulo() {
        return this.titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String getPrioridade() {
        return this.prioridade;
    }

    public Date getInicio() {
        return this.inicio;
    }

    public Date getFim() {
        return this.fim;
    }

    public String getEstado() {
        return this.estado;
    }

    public Utilizador getColaborador() {
        return this.colaborador;
    }


    //seletores

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setColaborador(Utilizador colaborador) {
        this.colaborador = colaborador;
    }


    //outros metodos

    //metodo compareTo para ordenar a lista de tarefas


    public int comapareTo (Tarefa o) {
        int i = this.titulo.compareTo(o.getTitulo());
        if(i != 0)
            return i;
        else {
            return this.fim.compareTo(o.getFim());
        }
    }


    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Tarefa) &&
                this.titulo.equals(((Tarefa) obj).getTitulo());
    }


    //Metodo toString

    @Override
    public String toString() {

        StringBuilder s2 = new StringBuilder()
                .append("Titulo : " + titulo + ", ")
                .append("Descrição da tarefa : " + descricao + ", ")
                .append("Data Inicio : " + inicio + ", ")
                .append("Data Fim : " + fim + ", ")
                .append("Estado da tarefa : " + estado + " ");
        return s2.toString();


    }

}
    
    
    
    
    
    
    
    
    

