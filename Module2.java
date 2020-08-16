package clinicmanagementsystem;
import javax.swing.JOptionPane;

public class Module2 extends javax.swing.JFrame {
    
    public Module2() {
        initComponents();
        setExtendedState(getExtendedState() | Module2.MAXIMIZED_BOTH);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        dat = new javax.swing.JTextField();
        af = new javax.swing.JTextField();
        po = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doctor Availability and Confirmation");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Doctor Availability");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(595, 213, 300, 60);

        jLabel2.setText("            Dear Patient, pick a Doctor according to their availabilty.");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(550, 250, 340, 90);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dr. Rosa Noor [Monday&Tuesday][8:00 am - 5:00 pm]", "Dr. Joe Henry [Wednesday&Thursday][8:00 am - 5:00 pm]", "Dr. Vivenakaananda[Friday & Saturday][8:00 am - 5:00 pm]" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(500, 320, 289, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dr. Rosa Noor [RM 100]", "Dr. Joe Henry [RM 115]", "Dr. Vivenakaananda [RM 120]", " " }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(500, 358, 289, 20);

        jLabel3.setText("                                                        Doctor Appointment Time :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 320, 360, 30);

        jLabel4.setText("                 Appointment Fee :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(330, 360, 160, 14);

        jLabel5.setText("                   Payment Options :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(325, 399, 160, 14);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash Upon Arrival", "Atm Transfer", "Online Banking" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(500, 396, 289, 20);

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(998, 438, 80, 30);
        getContentPane().add(dat);
        dat.setBounds(795, 320, 283, 20);
        getContentPane().add(af);
        af.setBounds(795, 358, 283, 20);
        getContentPane().add(po);
        po.setBounds(795, 396, 283, 20);

        jLabel6.setText("<<Go Back");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1010, 150, 90, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\forestbckgrnd.jpg")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1360, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
      
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        dat.setText(jComboBox1.getSelectedItem().toString());
        af.setText(jComboBox2.getSelectedItem().toString());
        po.setText(jComboBox3.getSelectedItem().toString());
        
        JOptionPane.showMessageDialog(rootPane,"Dear Patient, Here are the following summary of your appointment confirmation :"
        +"\n\n\nTime:"+jComboBox1.getSelectedItem().toString()+ "\n\nFee:"+jComboBox2.getSelectedItem().toString()
        +"\n\nPayment Option:"+jComboBox3.getSelectedItem().toString()+"\n"+"\nPatients are required to complete a transaction for the appointment"+
        " fee to one of the bank accounts provided below :"+"\n\n\nBank Rakyat [1524 3123 3131 13] (Abc clinic)"+"\n\nBank Islam [7813 1323 3311 12] (Abc Clinic)"
        +"\n\nPatients are required to complete the transaction 3 days before attending for the appointment:"+"\nUpon completing the transaction, be sure to take a"
        +" screenshot of the completed transaction"+"\nand send it to Miss Alia(010 768 2736) or Mr Guy(010 389 3123)");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        
        MenuPage obj = new MenuPage();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Module2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Module2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Module2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Module2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Module2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField af;
    private javax.swing.JTextField dat;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField po;
    // End of variables declaration//GEN-END:variables
}
