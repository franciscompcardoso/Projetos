/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Front;

import Back.*;
import java.time.Instant;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Registar extends javax.swing.JFrame  {
    
    
    
    
    private GestaoProjetos dados;
    
    
    public Registar(GestaoProjetos v) {
        initComponents();
        dados = v;
        
        inserirDN.setDateFormatString("dd-MM-yyyy");
        
    }
    
    
    public Registar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        testDayPicker1 = new com.qt.datapicker.TestDayPicker();
        testDayPicker2 = new com.qt.datapicker.TestDayPicker();
        testDayPicker3 = new com.qt.datapicker.TestDayPicker();
        testDayPicker4 = new com.qt.datapicker.TestDayPicker();
        testDayPicker5 = new com.qt.datapicker.TestDayPicker();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inserirNome = new javax.swing.JTextField();
        inserirEmail = new javax.swing.JTextField();
        botao_submeter = new javax.swing.JButton();
        inserirPassword = new javax.swing.JPasswordField();
        boataoVoltar = new javax.swing.JButton();
        inserirDN = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        jLabel2.setText("Data de Nascimento:");

        jLabel3.setText("Email:");

        jLabel4.setText("Password:");

        inserirNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirNomeActionPerformed(evt);
            }
        });

        inserirEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirEmailActionPerformed(evt);
            }
        });

        botao_submeter.setText("Submeter");
        botao_submeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_submeterActionPerformed(evt);
            }
        });

        inserirPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirPasswordActionPerformed(evt);
            }
        });

        boataoVoltar.setText("Voltar");
        boataoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boataoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(inserirPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                .addComponent(inserirEmail)
                                .addComponent(inserirNome))
                            .addComponent(inserirDN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boataoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                        .addComponent(botao_submeter, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inserirNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inserirDN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inserirEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(inserirPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boataoVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(botao_submeter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserirNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inserirNomeActionPerformed

    private void inserirEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inserirEmailActionPerformed

    private void botao_submeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_submeterActionPerformed
        
        Utilizador u;
        String nome = inserirNome.getText();
        Date nascimento = inserirDN.getDate();
        String email = inserirEmail.getText();
        String password = String.valueOf(inserirPassword.getPassword());
        
       
     
        if (nome.isEmpty() || password.isEmpty() || email.isEmpty() || nascimento == null) {
            JOptionPane.showMessageDialog(this, "Os campos obrigatórios não foram preenchidos");
        } else{
            u = new Utilizador(inserirNome.getText(),
                               inserirDN.getDate(),
                               inserirEmail.getText(),
                             String.valueOf(inserirPassword.getPassword()));
            
            //se o resultado for falso,criar if para ja existe
            if(Main.getDados().utilizadores.containsKey(email)){
                JOptionPane.showMessageDialog(this, "Este utilizador já existe!");
            }
            else{
                Main.getDados().adicionarUtilizador(u);
            
                JOptionPane.showMessageDialog(Main.getFrame(),
                                        "A sua conta foi criada com sucesso!\n"
                                                + "Faça Login agora!",
                                        "Confirmado",
                                         JOptionPane.PLAIN_MESSAGE);
                                                                
                                JPanel i = new Login_1(dados);
                                this.setVisible(false);
                                Main.getFrame().add(i);
                                i.setVisible(true);
               }
        }  
    }//GEN-LAST:event_botao_submeterActionPerformed
    
    private void inserirPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inserirPasswordActionPerformed

    private void boataoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boataoVoltarActionPerformed
       this.dispose();
    }//GEN-LAST:event_boataoVoltarActionPerformed

    
    public static void main2(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Registar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boataoVoltar;
    private javax.swing.JButton botao_submeter;
    private com.toedter.calendar.JDateChooser inserirDN;
    private javax.swing.JTextField inserirEmail;
    private javax.swing.JTextField inserirNome;
    private javax.swing.JPasswordField inserirPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private com.qt.datapicker.TestDayPicker testDayPicker1;
    private com.qt.datapicker.TestDayPicker testDayPicker2;
    private com.qt.datapicker.TestDayPicker testDayPicker3;
    private com.qt.datapicker.TestDayPicker testDayPicker4;
    private com.qt.datapicker.TestDayPicker testDayPicker5;
    // End of variables declaration//GEN-END:variables

    private void Login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
