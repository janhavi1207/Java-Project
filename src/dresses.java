/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mahendra
 */
public class dresses extends javax.swing.JFrame {

    /**
     * Creates new form dresses
     */
    public dresses() {
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
        mens = new javax.swing.JButton();
        women = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 51));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setLayout(null);

        mens.setBackground(new java.awt.Color(255, 255, 255));
        mens.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        mens.setForeground(new java.awt.Color(51, 0, 51));
        mens.setText("Mens");
        mens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mensActionPerformed(evt);
            }
        });
        jPanel1.add(mens);
        mens.setBounds(280, 110, 90, 50);

        women.setBackground(new java.awt.Color(255, 255, 255));
        women.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        women.setForeground(new java.awt.Color(51, 0, 51));
        women.setText("Womens");
        women.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                womenActionPerformed(evt);
            }
        });
        jPanel1.add(women);
        women.setBounds(100, 110, 110, 50);

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 0, 0));
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(190, 230, 100, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mensActionPerformed
      this.dispose();
new men().setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_mensActionPerformed

    private void womenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_womenActionPerformed
this.dispose();
new female().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_womenActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
System.exit(0);          // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(dresses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dresses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dresses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dresses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dresses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mens;
    private javax.swing.JButton women;
    // End of variables declaration//GEN-END:variables
}