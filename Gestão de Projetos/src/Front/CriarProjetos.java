/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Front;

import Back.GestaoProjetos;
import Back.Projeto;
import Back.Tarefa;
import Back.Utilizador;
import static Front.Entrar.sessao;
import java.awt.Dimension;
import java.util.*;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miegsi
 */
public class CriarProjetos extends javax.swing.JFrame {
            
        private GestaoProjetos dados;
        public Map<String, Utilizador> colaboradores;
    
        public CriarProjetos(GestaoProjetos d) {
        initComponents();
        this.dados = d;
        this.colaboradores = new HashMap<>();
        inserirDataInicio.setDateFormatString("dd-MM-yyyy");
        inserirDataFim.setDateFormatString("dd-MM-yyyy");
       
        
    }

    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botaoAdicUtil = new javax.swing.JButton();
        inserirNomeProjeto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        inserirDescricao = new javax.swing.JTextArea();
        inserirDataInicio = new com.toedter.calendar.JDateChooser();
        inserirDataFim = new com.toedter.calendar.JDateChooser();
        botaoSubmeterP = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaUtilizadores = new javax.swing.JList<>();

        jLabel8.setText("jLabel1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Descrição:");

        jLabel2.setText("Data Início:");

        jLabel3.setText("Data Fim:");

        jLabel5.setText("Nome do Projeto:");

        botaoAdicUtil.setText("Adicionar Colaboradores");
        botaoAdicUtil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicUtilActionPerformed(evt);
            }
        });

        inserirNomeProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirNomeProjetoActionPerformed(evt);
            }
        });

        inserirDescricao.setColumns(20);
        inserirDescricao.setRows(5);
        jScrollPane1.setViewportView(inserirDescricao);

        botaoSubmeterP.setText("Submeter");
        botaoSubmeterP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSubmeterPActionPerformed(evt);
            }
        });

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        listaUtilizadores.setModel(new javax.swing.AbstractListModel<String>() {

            Set<String> aux = Main.getDados().utilizadores.keySet();
            Boolean b = aux.remove(Entrar.sessao.getEmail());
            String[] strings = aux.toArray(new String[0]);
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listaUtilizadores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(102, 102, 102)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inserirNomeProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109)
                                .addComponent(inserirDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(inserirDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(botaoAdicUtil)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoSubmeterP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(inserirNomeProjeto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inserirDataInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inserirDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(botaoAdicUtil)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoSubmeterP, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSubmeterPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSubmeterPActionPerformed
          
          Utilizador owner = Entrar.sessao;
          Projeto e;
         
          String nome = inserirNomeProjeto.getText();
          String descricao = inserirDescricao.getText();
          Date dataInicio = inserirDataInicio.getDate();
          Date dataFim = inserirDataFim.getDate();
          //String AdcColab = Arrays.toString(listaColabAdic.getListSelectionListeners());        
          List tarefa = new ArrayList<>();
          
          
          if (nome.isEmpty() || descricao.isEmpty() || dataInicio == null || dataFim == null) {
            JOptionPane.showMessageDialog(this, "Os campos obrigatórios não foram preenchidos");
          }
          else{
            e = new  Projeto(owner, nome, descricao, dataInicio, dataFim, this.colaboradores, tarefa);
                             
            
            
            Main.getDados().adicionarProjeto(e);
            
            JOptionPane.showMessageDialog(Main.getFrame(),
                                        "A sua conta foi criada com sucesso!\n"
                                                + "Faça Login agora!",
                                        "Confirmado",
                                         JOptionPane.PLAIN_MESSAGE);
          }
          

          /*Projeto d = new Projeto (owner, nome, descricao, dataInicio, dataFim);
          System.out.println(dados.getProjeto());
          int a = dados.getProjeto().visualizaProjetos().size();
          
           
        if(nome.isEmpty() || descricao.isEmpty() || dataInicio == null || dataFim == null ){//|| AdcColab.isEmpty() || AdcTarefa.isEmpty()) {
              JOptionPane.showMessageDialog(this, "Os campos obrigatórios não foram preenchidos");
        } else{
              if (dados.getProjeto().visualizaProjetos().isEmpty()) {
                dados.getProjeto().adicionarProjeto(d);
                this.dispose();
            } else {
                for (int i = 0; i < a; i++) {
                    Projeto j = dados.getProjeto().visualizaProjetos().get(i);
                    if ((j.getNome().equals(nome)) 
                            && (j.getOwner().equals(owner)) 
                            && (j.getDescricao().equals(descricao)) 
                            && (j.getInicio().equals(dataInicio))
                            && (j.getFim().equals(dataFim))) {
                        JOptionPane.showMessageDialog(this, "O Produto já existe");
                    } else {
                        dados.getProjeto().adicionarProjeto(d);
                        this.dispose();
              
          }
         }   
        }
       }   */             
    }//GEN-LAST:event_botaoSubmeterPActionPerformed

    private void inserirNomeProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirNomeProjetoActionPerformed
       
    }//GEN-LAST:event_inserirNomeProjetoActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoAdicUtilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicUtilActionPerformed

        ArrayList<String> colaboradoresList = (ArrayList<String>) this.listaUtilizadores.getSelectedValuesList();
        for(String user: colaboradoresList) {
                this.colaboradores.put(user, Main.getDados().utilizadores.get(user));
        }
        
       
    }//GEN-LAST:event_botaoAdicUtilActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicUtil;
    private javax.swing.JButton botaoSubmeterP;
    private javax.swing.JButton botaoVoltar;
    private com.toedter.calendar.JDateChooser inserirDataFim;
    private com.toedter.calendar.JDateChooser inserirDataInicio;
    private javax.swing.JTextArea inserirDescricao;
    private javax.swing.JTextField inserirNomeProjeto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JList<String> listaUtilizadores;
    // End of variables declaration//GEN-END:variables

}
    
