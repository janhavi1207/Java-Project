
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
public class female extends javax.swing.JFrame {

    /**
     * Creates new form female
     */
    public female() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        outfit = new javax.swing.JComboBox<>();
        fabric = new javax.swing.JComboBox<>();
        size = new javax.swing.JComboBox<>();
        color = new javax.swing.JComboBox<>();
        oprice = new javax.swing.JTextField();
        ta = new javax.swing.JTextField();
        fab = new javax.swing.JTextField();
        siz = new javax.swing.JTextField();
        colo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        qua = new javax.swing.JTextField();
        Calculate_Total_Amount = new javax.swing.JButton();
        home = new javax.swing.JButton();
        ptop = new javax.swing.JButton();
        exit1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Outfit");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(105, 71, 45, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Colour");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 150, 51, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fabric");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(105, 111, 46, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Amount");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(100, 280, 110, 25);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Amount");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(502, 25, 62, 25);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Specification");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(105, 25, 96, 25);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Size");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(110, 190, 30, 25);

        outfit.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        outfit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Top", "Skirt", "Jeans", "Shirt", "Sweater", "Gown" }));
        outfit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outfitActionPerformed(evt);
            }
        });
        jPanel1.add(outfit);
        outfit.setBounds(280, 70, 160, 31);

        fabric.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        fabric.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cotton", "Synthetic", "Silk", "Rayon", "Linen", "Wool" }));
        fabric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fabricActionPerformed(evt);
            }
        });
        jPanel1.add(fabric);
        fabric.setBounds(280, 110, 160, 31);

        size.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        size.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XS", "S", "M", "L", "XL" }));
        size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeActionPerformed(evt);
            }
        });
        jPanel1.add(size);
        size.setBounds(280, 190, 160, 31);

        color.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        color.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Black", "White", "Red", "Blue", "Yellow", "Green", "Orange", "Pink" }));
        color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorActionPerformed(evt);
            }
        });
        jPanel1.add(color);
        color.setBounds(280, 150, 160, 31);

        oprice.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        oprice.setForeground(new java.awt.Color(255, 0, 0));
        oprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opriceActionPerformed(evt);
            }
        });
        jPanel1.add(oprice);
        oprice.setBounds(480, 70, 115, 31);

        ta.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        ta.setForeground(new java.awt.Color(255, 0, 0));
        ta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taActionPerformed(evt);
            }
        });
        jPanel1.add(ta);
        ta.setBounds(280, 280, 160, 31);

        fab.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        fab.setForeground(new java.awt.Color(255, 0, 0));
        fab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fabActionPerformed(evt);
            }
        });
        jPanel1.add(fab);
        fab.setBounds(480, 110, 115, 31);

        siz.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        siz.setForeground(new java.awt.Color(255, 0, 0));
        siz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizActionPerformed(evt);
            }
        });
        jPanel1.add(siz);
        siz.setBounds(480, 190, 115, 31);

        colo.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        colo.setForeground(new java.awt.Color(255, 0, 0));
        colo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coloActionPerformed(evt);
            }
        });
        jPanel1.add(colo);
        colo.setBounds(480, 150, 115, 31);

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Quantity");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(100, 230, 67, 25);

        qua.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        qua.setForeground(new java.awt.Color(255, 0, 0));
        qua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quaActionPerformed(evt);
            }
        });
        jPanel1.add(qua);
        qua.setBounds(280, 230, 160, 31);

        Calculate_Total_Amount.setBackground(new java.awt.Color(255, 0, 0));
        Calculate_Total_Amount.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        Calculate_Total_Amount.setForeground(new java.awt.Color(51, 0, 51));
        Calculate_Total_Amount.setText("Calculate Total Amount");
        Calculate_Total_Amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calculate_Total_AmountActionPerformed(evt);
            }
        });
        jPanel1.add(Calculate_Total_Amount);
        Calculate_Total_Amount.setBounds(70, 350, 330, 41);

        home.setBackground(new java.awt.Color(255, 0, 0));
        home.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        home.setForeground(new java.awt.Color(51, 0, 51));
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jPanel1.add(home);
        home.setBounds(70, 420, 150, 41);

        ptop.setBackground(new java.awt.Color(255, 0, 0));
        ptop.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        ptop.setForeground(new java.awt.Color(51, 0, 51));
        ptop.setText("Proceed To Pay");
        ptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptopActionPerformed(evt);
            }
        });
        jPanel1.add(ptop);
        ptop.setBounds(510, 350, 230, 41);

        exit1.setBackground(new java.awt.Color(255, 0, 0));
        exit1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        exit1.setForeground(new java.awt.Color(51, 0, 51));
        exit1.setText("EXIT");
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });
        jPanel1.add(exit1);
        exit1.setBounds(510, 420, 150, 41);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opriceActionPerformed

    private void taActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taActionPerformed

    private void fabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fabActionPerformed

    private void sizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sizActionPerformed

    private void coloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coloActionPerformed

    private void outfitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outfitActionPerformed
String s=(String)outfit.getSelectedItem();
        try
         {
             Class.forName("java.sql.DriverManager");
              Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "admin");
              Statement st=cn.createStatement();
              String q ="SELECT * FROM outfit WHERE cloth='"+s+"';";
              ResultSet rs=st.executeQuery(q);
              if (rs.next())
              {
              String op= rs.getString("price");
             oprice.setText(op);
              } 
                  }
         catch (Exception e)
         {
             JOptionPane.showMessageDialog(rootPane,"Error in Connectivity");
         }      // TODO add your handling code here:
    }//GEN-LAST:event_outfitActionPerformed

    private void fabricActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fabricActionPerformed
   String s=(String)fabric.getSelectedItem();
        try
         {
             Class.forName("java.sql.DriverManager");
              Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "admin");
              Statement st=cn.createStatement();
              String q ="SELECT * FROM fabric WHERE cloth='"+s+"';";
              ResultSet rs=st.executeQuery(q);
              if (rs.next())
              {
              String op= rs.getString("price");
             fab.setText(op);
              } 
                  }
         catch (Exception e)
         {
             JOptionPane.showMessageDialog(rootPane,"Error in Connectivity");
         }      // TODO add your handling code here:
    }//GEN-LAST:event_fabricActionPerformed

    private void colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorActionPerformed
     String s=(String)color.getSelectedItem();
        try
         {
             Class.forName("java.sql.DriverManager");
              Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "admin");
              Statement st=cn.createStatement();
              String q ="SELECT * FROM color WHERE cloth='"+s+"';";
              ResultSet rs=st.executeQuery(q);
              if (rs.next())
              {
              String op= rs.getString("price");
             colo.setText(op);
              } 
                  }
         catch (Exception e)
         {
             JOptionPane.showMessageDialog(rootPane,"Error in Connectivity");
         }    // TODO add your handling code here:
    }//GEN-LAST:event_colorActionPerformed

    private void sizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeActionPerformed
  String s=(String)size.getSelectedItem();
        try
         {
             Class.forName("java.sql.DriverManager");
              Connection cn = DriverManager.getConnection("jdbc:mysql://localhost;3306/project", "root", "admin");
              Statement st=cn.createStatement();
              String q ="SELECT * FROM size WHERE cloth='"+s+"';";
              ResultSet rs=st.executeQuery(q);
              if (rs.next())
              {
              String op= rs.getString("price");
             siz.setText(op);
              } 
                  }
         catch (Exception e)
         {
             JOptionPane.showMessageDialog(rootPane,"Error in Connectivity");
         }       // TODO add your handling code here:
    }//GEN-LAST:event_sizeActionPerformed

    private void quaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quaActionPerformed

    private void Calculate_Total_AmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calculate_Total_AmountActionPerformed
double n=Double.parseDouble(qua.getText());
double op=Double.parseDouble(oprice.getText());
double si=Double.parseDouble(siz.getText());
double col=Double.parseDouble(colo.getText());
double fa=Double.parseDouble(fab.getText());
ta.setText(Double.toString(n*(op+col+si+fa)));
// TODO add your handling code here:
    }//GEN-LAST:event_Calculate_Total_AmountActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
   this.dispose();
new dresses().setVisible(true);      // TODO add your handling code here:
    }//GEN-LAST:event_homeActionPerformed

    private void ptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptopActionPerformed
   this.dispose();
new billing().setVisible(true);      // TODO add your handling code here:
    }//GEN-LAST:event_ptopActionPerformed

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
       System.exit(0);  // TODO add your handling code here:
    }//GEN-LAST:event_exit1ActionPerformed

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
            java.util.logging.Logger.getLogger(female.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(female.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(female.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(female.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new female().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculate_Total_Amount;
    private javax.swing.JTextField colo;
    private javax.swing.JComboBox<String> color;
    private javax.swing.JButton exit1;
    private javax.swing.JTextField fab;
    private javax.swing.JComboBox<String> fabric;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField oprice;
    private javax.swing.JComboBox<String> outfit;
    private javax.swing.JButton ptop;
    private javax.swing.JTextField qua;
    private javax.swing.JTextField siz;
    private javax.swing.JComboBox<String> size;
    private javax.swing.JTextField ta;
    // End of variables declaration//GEN-END:variables
}
