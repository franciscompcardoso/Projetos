
package Front;

import Back.*;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Login_1 extends javax.swing.JPanel {
    
    private GestaoProjetos dados;
    
    public Login_1(GestaoProjetos d1) {
        initComponents();
        this.dados = d1;
    }

    

   

   

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_login = new javax.swing.JLabel();
        inserirEmail = new javax.swing.JTextField();
        label_login1 = new javax.swing.JLabel();
        botao_entrar = new javax.swing.JButton();
        botao_registar = new javax.swing.JButton();
        label_questao_conta = new javax.swing.JLabel();
        botao_sair = new javax.swing.JButton();
        label_gestao_projetos = new javax.swing.JLabel();
        inserirPassword = new javax.swing.JPasswordField();

        label_login.setText("Login:");

        label_login1.setText("Password:");

        botao_entrar.setText("Entrar");
        botao_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_entrarActionPerformed(evt);
            }
        });

        botao_registar.setText("Registar");
        botao_registar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_registarActionPerformed(evt);
            }
        });

        label_questao_conta.setText("Ainda não tem conta?");

        botao_sair.setText("SAIR");
        botao_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_sairActionPerformed(evt);
            }
        });

        label_gestao_projetos.setText("Gestão Projetos");

        inserirPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_login, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151)
                        .addComponent(label_gestao_projetos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(label_login1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botao_entrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(inserirEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(inserirPassword, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_questao_conta)
                    .addComponent(botao_registar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_login, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inserirEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inserirPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_login1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(label_gestao_projetos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(label_questao_conta)
                        .addGap(18, 18, 18)
                        .addComponent(botao_registar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botao_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_entrarActionPerformed
        
        
        String email = this.inserirEmail.getText();
        String password = String.valueOf(inserirPassword.getPassword());
       
        if (email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "É necessário introduzir os seus Dados.");
        }
     
        else{
        
            Utilizador u = Main.getDados().utilizadores.get(email);
            if (u != null && u.getEmail().equals(email) && u.getPassword().equals(password)){
                                
                Main.getFrame().dispose();
                                
                                
                Entrar janela1 = new Entrar(dados);
                Main.setFrame(janela1);
                janela1.setLocationRelativeTo(null);
                janela1.setVisible(true);
                Entrar.sessao = Main.getDados().utilizadores.get(email);
            }
            else{
                JOptionPane.showMessageDialog(Main.getFrame(),
                        "Email ou Password incorreto(a)!",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_botao_entrarActionPerformed

    private void botao_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_sairActionPerformed
        dados.terminar();
    }//GEN-LAST:event_botao_sairActionPerformed

    private void botao_registarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_registarActionPerformed
        Registar janela1 = new Registar(dados);
        janela1.setLocationRelativeTo(null);
        janela1.setVisible(true);
    }//GEN-LAST:event_botao_registarActionPerformed

    private void inserirPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inserirPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_entrar;
    private javax.swing.JButton botao_registar;
    private javax.swing.JButton botao_sair;
    private javax.swing.JTextField inserirEmail;
    private javax.swing.JPasswordField inserirPassword;
    private javax.swing.JLabel label_gestao_projetos;
    private javax.swing.JLabel label_login;
    private javax.swing.JLabel label_login1;
    private javax.swing.JLabel label_questao_conta;
    // End of variables declaration//GEN-END:variables

   


}
