
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mahendra
 */
public class Cloths extends javax.swing.JFrame {

    /** Creates new form Cloths */
    public Cloths() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        createaccount = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        pwd = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setForeground(new java.awt.Color(102, 0, 102));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 70, 152, 28);

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter Username");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 20, 170, 28);

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enter Email ID");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 170, 230, 28);

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter Name");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 120, 210, 30);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Phone Number");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 222, 210, 28);

        username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(username);
        username.setBounds(260, 20, 90, 30);

        email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(email);
        email.setBounds(260, 170, 90, 30);

        phone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(phone);
        phone.setBounds(260, 220, 90, 30);

        createaccount.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        createaccount.setForeground(new java.awt.Color(255, 0, 0));
        createaccount.setText("Create Account");
        createaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createaccountActionPerformed(evt);
            }
        });
        jPanel1.add(createaccount);
        createaccount.setBounds(20, 270, 200, 41);

        name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(260, 120, 90, 30);

        cancel.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 0, 0));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel);
        cancel.setBounds(250, 270, 110, 40);

        pwd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(pwd);
        pwd.setBounds(260, 70, 90, 30);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 446, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

    private void createaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createaccountActionPerformed
 String unm=username.getText();
 String nm=name.getText();
 String emailid=email.getText();
 int pn=Integer.parseInt(phone.getText());
 String pass= new String(pwd.getPassword());
         try
         {
             Class.forName("java.sql.DriverManager");
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
              Statement s=con.createStatement();
              String q ="insert into usersinfo values('"+unm+"','"+pass+"','"+emailid+"','"+nm+"',Null,'"+pn+"');";
              s.executeUpdate(q);
              JOptionPane.showMessageDialog(null,"Account Created");
              this.dispose();
              new frame1().setVisible(true);
              
         }
         catch (Exception ex)
         {
             JOptionPane.showMessageDialog(rootPane, ex.getMessage());
         }        // TODO add your handling code here:
    }//GEN-LAST:event_createaccountActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Cloths.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cloths.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cloths.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cloths.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cloths().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton createaccount;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

}
