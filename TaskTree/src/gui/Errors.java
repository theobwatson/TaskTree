package gui;

import javax.swing.JTextArea;

/**
 *
 * @author theobenvie-watson
 */
public class Errors extends javax.swing.JFrame {

    static String errors;
    
    public Errors(String errors) {
        
        Errors.errors = errors;
        initComponents();
        showErrorsArea.setText(errors);
    }
    
    public Errors(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        treeLogo = new javax.swing.JLabel();
        titleText = new javax.swing.JLabel();
        errorScrollPane = new javax.swing.JScrollPane();
        showErrorsArea = new javax.swing.JTextArea();
        tryAgainButton = new javax.swing.JButton();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(540, 351));
        setPreferredSize(new java.awt.Dimension(540, 351));
        setResizable(false);
        setSize(new java.awt.Dimension(540, 351));
        getContentPane().setLayout(null);

        treeLogo.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        treeLogo.setForeground(new java.awt.Color(255, 255, 255));
        treeLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        treeLogo.setText("TaskTree");
        getContentPane().add(treeLogo);
        treeLogo.setBounds(0, 1, 190, 30);

        titleText.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        titleText.setForeground(new java.awt.Color(255, 255, 255));
        titleText.setText("Errors were found...");
        getContentPane().add(titleText);
        titleText.setBounds(80, 51, 230, 30);

        errorScrollPane.setBorder(null);

        showErrorsArea.setEditable(false);
        showErrorsArea.setBackground(new java.awt.Color(244, 236, 214));
        showErrorsArea.setColumns(20);
        showErrorsArea.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        errorScrollPane.setViewportView(showErrorsArea);

        getContentPane().add(errorScrollPane);
        errorScrollPane.setBounds(77, 95, 360, 170);

        tryAgainButton.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        tryAgainButton.setForeground(new java.awt.Color(255, 255, 255));
        tryAgainButton.setText("Try Again");
        tryAgainButton.setContentAreaFilled(false);
        tryAgainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tryAgainButtonActionPerformed(evt);
            }
        });
        getContentPane().add(tryAgainButton);
        tryAgainButton.setBounds(140, 270, 230, 30);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Untitled (1).png"))); // NOI18N
        backgroundImage.setText("jLabel1");
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(0, 0, 510, 350);

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
    private javax.swing.JLabel treeLogo;
    private javax.swing.JButton tryAgainButton;
    // End of variables declaration//GEN-END:variables
}
