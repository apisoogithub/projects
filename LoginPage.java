package clinicmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class LoginPage extends javax.swing.JFrame {
    
    public LoginPage() {
        
        initComponents();
        setExtendedState(getExtendedState() | LoginPage.MAXIMIZED_BOTH);
        showDate();
        showTime();
        
    }
        void showDate(){
            Date d = new Date();
            SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
            datelab.setText(s.format(d));
        }
        void showTime(){
            
        new Timer(0,new ActionListener(){
            
                public void actionPerformed(ActionEvent e){
                    Date d = new Date();
                    SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                    timelab.setText(s.format(d));
                    
                }
            }).start();
        }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        un = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        datelab = new javax.swing.JLabel();
        timelab = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clinic Application System - Login Page ");
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicmanagementsystem/clinic.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(535, 90, 300, 300);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Username :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(532, 422, 70, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Password :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(537, 457, 70, 17);

        un.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unActionPerformed(evt);
            }
        });
        getContentPane().add(un);
        un.setBounds(612, 422, 221, 20);

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        getContentPane().add(pass);
        pass.setBounds(612, 452, 221, 20);

        jButton1.setText("Log In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(750, 480, 80, 23);

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(750, 520, 80, 23);

        datelab.setText("Date :");
        getContentPane().add(datelab);
        datelab.setBounds(374, 19, 140, 14);

        timelab.setText("Time :");
        getContentPane().add(timelab);
        timelab.setBounds(904, 19, 150, 14);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\pinkbckgrnd.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -10, 1370, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unActionPerformed

    }//GEN-LAST:event_unActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String username = un.getText();
        String password = pass.getText();
        
        if(username.equals("admin") && password.equals("admin")){
            MenuPage obj = new MenuPage();
            obj.setVisible(true);
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"Invalid Username or password");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        
    }//GEN-LAST:event_passActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]){
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel datelab;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel timelab;
    private javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables
}
