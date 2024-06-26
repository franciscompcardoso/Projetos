package Front;

import Back.*;
import java.awt.Dimension;
import javax.swing.JFrame;
import Back.GestaoProjetos;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JPanel;

public class Main {
        private static JFrame f = new JFrame();
        private static GestaoProjetos dados = new GestaoProjetos();
                
                
                public static JFrame getFrame(){
                        return f;
                }
                
                public static void setFrame(JFrame frame){
                        f = frame;
                }
                public static GestaoProjetos getDados(){
                        return dados;
                }
                
                public static void main(String args[]) {
                        
                        JPanel i = new Login_1(dados);
                        Dimension d = new Dimension();
                        d.setSize(630,297);
                        f.setSize(d);
                        i.setVisible(true);
                        f.add(i);
                        f.setVisible(true);
                        
                        
                        try {
            FileInputStream fileIn = new FileInputStream("GestaoProjetos.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            dados = (GestaoProjetos) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException e) {
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("GestaoProjetos class not found");
            return;
        }
                        
                 try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
                       
 
                                
 
        }
}


