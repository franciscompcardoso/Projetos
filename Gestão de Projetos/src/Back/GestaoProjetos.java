package Back;


import Front.Entrar;
import static Front.Entrar.sessao;
import Front.Main;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import sun.java2d.pipe.AlphaPaintPipe;
import java.time.LocalDate;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.lang.Iterable;

public class GestaoProjetos implements java.io.Serializable {

    public Map <String, Utilizador> utilizadores;
    public List <Projeto> projetos;

    public GestaoProjetos() {
        
        this.utilizadores = new HashMap<String, Utilizador>();
       this.projetos = new ArrayList<Projeto>();
    }

    //UTILIZADORES

    //adicionar Utilizador
    public void adicionarUtilizador(Utilizador u) {
        this.utilizadores.put(u.getEmail(), u);
        this.guardar(ser);
    }

    //numero de utilizadores existentes
    public int numUtilExiste() {
        return this.utilizadores.size();
    }

    //retorna lista de utilizadores
    public Map <String, Utilizador> visualizarUtilizadores() {
        return this.utilizadores;
    }
    
    // alterar Utilizador
    
    public void alterarNomeUtilizador ( Utilizador u, String novoNome, Date nascimento, String pass ){
//        for(Utilizador utilizador2 : Main.getDados()utilizadores()){
//            if (utilizador2.getNome().equals(N2)){
//                utilizador2.setNome(novoNome);
//          }
//        }
//        
                u.setNome(novoNome);
                u.setNascimento(nascimento);
                u.setPassword(pass);
                
                this.guardar(ser);
                

        
    }
    
      //ADICIONAR PROJETO
    public void adicionarProjeto(Projeto e) {
        this.projetos.add(e);
        this.guardar(ser);
    }


    //numero de projetos existentes
    public int numProjExiste() {
        return this.projetos.size();
    }

    //retorna lista de projetos
    public List<Projeto> visualizarProjetos() {
        return this.projetos;
    }



    // get do projeto por nome e owner
    public Projeto getProjeto(String proj, String owner) {
        for (Projeto p: this.projetos) {
            if(p.getNome().equals(proj) && p.getOwner().getEmail().equals(owner))
                return  p;

        }
        return null;
    }
    
    
    // alterar Projeto
    
    public void alterarProjeto ( Projeto p, String novoNome, String descricao, Date inicio,Date fim ){
   
                p.setNome(novoNome);
                p.setDescricao(descricao);
                p.setInicio(inicio);
                p.setFim(fim);
                
                this.guardar(ser);
                        
    }
    
    
    
    
    public void terminar() {
        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");
        if (JOptionPane.showConfirmDialog(null,
                "Deseja realmente terminar o programa?",
                "Terminar",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            sair();
        }
    }
    
    private void sair() {
        guardar(this.ser);
        System.exit(0);
    }
    
    public static final String ser = "GestaoProjetos.bin";

    public void guardar(String nomeFicheiro) {
        try {
            FileOutputStream fileOut = new FileOutputStream("GestaoProjetos.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in GestaoProjetos.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    

}