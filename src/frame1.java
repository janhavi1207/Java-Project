
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
public class frame1 extends javax.swing.JFrame {

    /**
     * Creates new form frame1
     */
    public frame1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pwd = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        custnm = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        Signup = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(16, 0, 100));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setForeground(new java.awt.Color(39, 15, 144));
        jPanel1.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(255, 153, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 255));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(320, 130, 160, 40);

        pwd.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.add(pwd);
        pwd.setBounds(510, 140, 140, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setText("Username");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(320, 70, 170, 30);

        custnm.setBackground(new java.awt.Color(255, 255, 102));
        custnm.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        custnm.setForeground(java.awt.Color.red);
        jPanel1.add(custnm);
        custnm.setBounds(510, 70, 140, 30);

        login.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 0, 0));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login);
        login.setBounds(310, 260, 120, 30);

        Signup.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Signup.setForeground(new java.awt.Color(255, 0, 0));
        Signup.setText("Sign up");
        Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupActionPerformed(evt);
            }
        });
        jPanel1.add(Signup);
        Signup.setBounds(510, 260, 140, 33);

        exit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(440, 340, 80, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/lavender.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 255), new java.awt.Color(255, 0, 255), new java.awt.Color(255, 0, 255), new java.awt.Color(255, 0, 255)));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 50, 250, 250);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupActionPerformed
this.dispose();
new Cloths().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_SignupActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        String nm=custnm.getText();
        String pass= new String(pwd.getPassword());
         try
         {
             Class.forName("java.sql.DriverManager");
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost;3306/project", "root", "admin");
              Statement s=con.createStatement();
              String q ="SELECT * FROM userinfo WHERE Usernm='"+nm+"' AND password='"+pass+"';";
              ResultSet rs=s.executeQuery(q);
              if (rs.next())
              {
              JOptionPane.showMessageDialog(null,"Login Successful");
              this.dispose();
              new dresses().setVisible(true);}
              else 
                JOptionPane.showMessageDialog(null,"Login Failed");  
              
         }
         catch (Exception ex)
         {
             JOptionPane.showMessageDialog(rootPane, ex.getMessage());
         }
              
              
                   
         
// TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Signup;
    private javax.swing.JTextField custnm;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField pwd;
    // End of variables declaration//GEN-END:variables
}
