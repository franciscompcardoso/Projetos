
package Front;

import Back.GestaoProjetos;
import Back.Projeto;
import Back.Tarefa;
import Back.Utilizador;
import java.util.Date;
import javax.swing.JOptionPane;



public class CriarTarefas extends javax.swing.JPanel {

    private GestaoProjetos dados;
    public Projeto p;
   

    CriarTarefas(GestaoProjetos dados, Projeto p) {
        this.p = p;
        initComponents(); 
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inserirDescricaoTarefa = new javax.swing.JTextArea();
        inserirTituloTarefa = new javax.swing.JTextField();
        dataInicioTarefa = new com.toedter.calendar.JDateChooser();
        dataFimTarefa = new com.toedter.calendar.JDateChooser();
        botaoSubmeter = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        inserirPAlta = new javax.swing.JRadioButton();
        inserirPMedia = new javax.swing.JRadioButton();
        inserirPBaixa = new javax.swing.JRadioButton();
        estadoAtiva = new javax.swing.JRadioButton();
        estadoTerminada = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        jLabel1.setText("Descrição:");

        jLabel2.setText("Título:");

        jLabel3.setText("Prioridade:");

        jLabel4.setText("Data Início:");

        jLabel5.setText("Estado da Tarefa:");

        jLabel6.setText("Adicionar Utilizadores:");

        inserirDescricaoTarefa.setColumns(20);
        inserirDescricaoTarefa.setRows(5);
        jScrollPane1.setViewportView(inserirDescricaoTarefa);

        botaoSubmeter.setText("Submeter");
        botaoSubmeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSubmeterActionPerformed(evt);
            }
        });

        jLabel7.setText("Data Fim");

        buttonGroup1.add(inserirPAlta);
        inserirPAlta.setText("Alta");
        inserirPAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirPAltaActionPerformed(evt);
            }
        });

        buttonGroup1.add(inserirPMedia);
        inserirPMedia.setText("Media");

        buttonGroup1.add(inserirPBaixa);
        inserirPBaixa.setText("Baixa");

        buttonGroup2.add(estadoAtiva);
        estadoAtiva.setText("Ativa");

        buttonGroup2.add(estadoTerminada);
        estadoTerminada.setText("Terminada");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(
            this.p.getColaboradores().keySet().toArray(new String[0])
        )
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jLabel6))
                .addGroup(layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(98, 98, 98)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(botaoSubmeter, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inserirTituloTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dataFimTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dataInicioTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(inserirPAlta)
                                    .addGap(8, 8, 8)
                                    .addComponent(inserirPMedia)
                                    .addGap(18, 18, 18)
                                    .addComponent(inserirPBaixa)))
                            .addGap(0, 46, Short.MAX_VALUE))))
                .addGroup(layout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(estadoAtiva)
                            .addGap(18, 18, 18)
                            .addComponent(estadoTerminada)))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(49, 49, 49)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inserirTituloTarefa))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(inserirPAlta)
                .addComponent(inserirPMedia)
                .addComponent(inserirPBaixa))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(dataInicioTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel7)
                .addComponent(dataFimTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(estadoAtiva)
                        .addComponent(estadoTerminada))
                    .addGap(84, 84, 84)
                    .addComponent(botaoSubmeter, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(39, 39, 39)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(19, 19, 19))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSubmeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSubmeterActionPerformed
        
         Utilizador owner = Entrar.sessao;
          Tarefa t;
         
          String titulo = inserirTituloTarefa.getText();
          String descricao = inserirDescricaoTarefa.getText();
          String prioridade = "Baixa";
          Date inicio = dataInicioTarefa.getDate();
          Date fim = dataFimTarefa.getDate();
          String estado = "Ativa";
         
          
         if(this.inserirPAlta.isSelected())
             prioridade = "Alta";
         if(this.inserirPMedia.isSelected())
             prioridade = "Media";
         if(this.inserirPBaixa.isSelected())
             prioridade = "Baixa";
         
         if(this.estadoAtiva.isSelected())
             estado = "Ativa";
         if(this.inserirPBaixa.isSelected())
             estado = "Finalizada";
          
          
          if (titulo.isEmpty() || descricao.isEmpty() || inicio == null || fim == null) {
            JOptionPane.showMessageDialog(this, "Os campos obrigatórios não foram preenchidos");
        } else{
              Utilizador colab = Main.getDados().utilizadores.get(this.jComboBox1.getSelectedItem());
            t = new  Tarefa(titulo, descricao, prioridade, inicio, fim, estado, colab); 
                             
            this.p.adicionarTarefa(t);
            
         
            
            JOptionPane.showMessageDialog(Main.getFrame(),
                                        "A sua conta foi criada com sucesso!\n"
                                                + "Faça Login agora!",
                                        "Confirmado",
                                         JOptionPane.PLAIN_MESSAGE);
          }
          
          
          
    }//GEN-LAST:event_botaoSubmeterActionPerformed

    private void inserirPAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirPAltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inserirPAltaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botaoSubmeter;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private com.toedter.calendar.JDateChooser dataFimTarefa;
    private com.toedter.calendar.JDateChooser dataInicioTarefa;
    private javax.swing.JRadioButton estadoAtiva;
    private javax.swing.JRadioButton estadoTerminada;
    private javax.swing.JTextArea inserirDescricaoTarefa;
    private javax.swing.JRadioButton inserirPAlta;
    private javax.swing.JRadioButton inserirPBaixa;
    private javax.swing.JRadioButton inserirPMedia;
    private javax.swing.JTextField inserirTituloTarefa;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
