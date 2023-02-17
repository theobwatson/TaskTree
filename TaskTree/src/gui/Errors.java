package gui;

import javax.swing.JTextArea;
import interfaces.TaskCallback;

/**
 *
 * @author theobenvie-watson
 */
public class Errors extends javax.swing.JFrame {

    static String errors;
    
    public Errors(String errors) {
        
        Errors.errors = errors;
        initComponents();
    }
    
    public Errors(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleText = new javax.swing.JLabel();
        errorScrollPane = new javax.swing.JScrollPane();
        showErrorsArea = new javax.swing.JTextArea(errors);
        tryAgainButton = new javax.swing.JButton();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(330, 230));
        setPreferredSize(new java.awt.Dimension(330, 230));
        setResizable(false);
        setSize(new java.awt.Dimension(330, 230));
        getContentPane().setLayout(null);

        titleText.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        titleText.setForeground(new java.awt.Color(255, 255, 255));
        titleText.setText("Uh oh...");
        getContentPane().add(titleText);
        titleText.setBounds(140, 50, 90, 15);

        showErrorsArea.setEditable(false);
        showErrorsArea.setBackground(new java.awt.Color(255, 255, 255));
        showErrorsArea.setColumns(1);
        showErrorsArea.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        showErrorsArea.setRows(20);
        errorScrollPane.setViewportView(showErrorsArea);

        getContentPane().add(errorScrollPane);
        errorScrollPane.setBounds(60, 70, 220, 80);

        tryAgainButton.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        tryAgainButton.setForeground(new java.awt.Color(255, 255, 255));
        tryAgainButton.setText("Try Again");
        tryAgainButton.setContentAreaFilled(false);
        tryAgainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tryAgainButtonActionPerformed(evt);
            }
        });
        getContentPane().add(tryAgainButton);
        tryAgainButton.setBounds(98, 163, 150, 20);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/miniBackground.png"))); // NOI18N
        backgroundImage.setText("jLabel1");
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(0, 0, 330, 230);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tryAgainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tryAgainButtonActionPerformed
        dispose();
    }//GEN-LAST:event_tryAgainButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Errors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Errors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Errors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Errors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Errors(errors).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JScrollPane errorScrollPane;
    private javax.swing.JTextArea showErrorsArea;
    private javax.swing.JLabel titleText;
    private javax.swing.JButton tryAgainButton;
    // End of variables declaration//GEN-END:variables
}
