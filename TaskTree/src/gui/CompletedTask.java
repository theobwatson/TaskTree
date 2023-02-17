package gui;

import task.TaskTree;

public class CompletedTask extends javax.swing.JFrame {

    public CompletedTask() {
        initComponents();
    }
    
    public CompletedTask(TaskTree tree) {
        initComponents();
        this.displayLeaves.setText(tree.user.priorityCheck() + tree.user.rankingCheck() + "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeButton = new javax.swing.JButton();
        displayLeaves = new javax.swing.JLabel();
        leavesLabel = new javax.swing.JLabel();
        earnedLabel = new javax.swing.JLabel();
        congratsLabel = new javax.swing.JLabel();
        backgroundPNG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(330, 230));
        setPreferredSize(new java.awt.Dimension(330, 230));
        setResizable(false);
        setSize(new java.awt.Dimension(330, 230));
        getContentPane().setLayout(null);

        closeButton.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        closeButton.setForeground(new java.awt.Color(255, 255, 255));
        closeButton.setText("Close");
        closeButton.setBorderPainted(false);
        closeButton.setContentAreaFilled(false);
        closeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        closeButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton);
        closeButton.setBounds(140, 160, 110, 30);

        displayLeaves.setFont(new java.awt.Font("Drm Handwritten Thin", 0, 48)); // NOI18N
        displayLeaves.setForeground(new java.awt.Color(255, 255, 255));
        displayLeaves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displayLeaves.setText("0");
        getContentPane().add(displayLeaves);
        displayLeaves.setBounds(90, 90, 160, 60);

        leavesLabel.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        leavesLabel.setForeground(new java.awt.Color(255, 255, 255));
        leavesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leavesLabel.setText("leaves");
        getContentPane().add(leavesLabel);
        leavesLabel.setBounds(102, 140, 130, 20);

        earnedLabel.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        earnedLabel.setForeground(new java.awt.Color(255, 255, 255));
        earnedLabel.setText("You've earned ");
        getContentPane().add(earnedLabel);
        earnedLabel.setBounds(120, 70, 112, 20);

        congratsLabel.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        congratsLabel.setForeground(new java.awt.Color(255, 255, 255));
        congratsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        congratsLabel.setText("Woohoo!");
        getContentPane().add(congratsLabel);
        congratsLabel.setBounds(140, 50, 60, 20);

        backgroundPNG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/miniBackground.png"))); // NOI18N
        getContentPane().add(backgroundPNG);
        backgroundPNG.setBounds(0, 0, 330, 230);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CompletedTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompletedTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompletedTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompletedTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompletedTask().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundPNG;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel congratsLabel;
    private javax.swing.JLabel displayLeaves;
    private javax.swing.JLabel earnedLabel;
    private javax.swing.JLabel leavesLabel;
    // End of variables declaration//GEN-END:variables
}
