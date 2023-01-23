/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author theobenvie-watson
 */
public class NamePanel extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public NamePanel() {
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

        frameTitle = new javax.swing.JLabel();
        versionNo = new javax.swing.JLabel();
        nameError = new javax.swing.JLabel();
        namePrompt = new javax.swing.JLabel();
        nameSubmission = new javax.swing.JTextField();
        continueButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TaskTree");
        setForeground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(500, 500));
        setMinimumSize(new java.awt.Dimension(340, 257));
        setResizable(false);
        getContentPane().setLayout(null);

        frameTitle.setBackground(new java.awt.Color(255, 255, 255));
        frameTitle.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        frameTitle.setForeground(new java.awt.Color(255, 255, 255));
        frameTitle.setText("TaskTree");
        getContentPane().add(frameTitle);
        frameTitle.setBounds(10, 0, 100, 30);

        versionNo.setForeground(new java.awt.Color(255, 255, 255));
        versionNo.setText("v1.0");
        getContentPane().add(versionNo);
        versionNo.setBounds(300, 210, 30, 17);

        nameError.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        nameError.setForeground(new java.awt.Color(255, 255, 255));
        nameError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(nameError);
        nameError.setBounds(50, 140, 240, 20);

        namePrompt.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        namePrompt.setForeground(new java.awt.Color(255, 255, 255));
        namePrompt.setText("What is your name?");
        getContentPane().add(namePrompt);
        namePrompt.setBounds(100, 80, 144, 15);

        nameSubmission.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        nameSubmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameSubmissionActionPerformed(evt);
            }
        });
        getContentPane().add(nameSubmission);
        nameSubmission.setBounds(70, 110, 195, 30);

        continueButton.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        continueButton.setForeground(new java.awt.Color(255, 255, 255));
        continueButton.setText("Continue");
        continueButton.setContentAreaFilled(false);
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });
        getContentPane().add(continueButton);
        continueButton.setBounds(100, 170, 140, 10);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/nameTemplate.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 340, 230);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameSubmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameSubmissionActionPerformed

    }//GEN-LAST:event_nameSubmissionActionPerformed

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed
        String name = nameSubmission.getText();

        if (!name.isEmpty()) {
            TaskTreeMain mainScreen = new TaskTreeMain(name);
            mainScreen.show();
            dispose();
        } else {
            nameError.setText("Please enter your name.");
        }
    }//GEN-LAST:event_continueButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NamePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NamePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NamePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NamePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NamePanel().setVisible(true);
                new NamePanel().setResizable(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continueButton;
    private javax.swing.JLabel frameTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nameError;
    private javax.swing.JLabel namePrompt;
    private javax.swing.JTextField nameSubmission;
    private javax.swing.JLabel versionNo;
    // End of variables declaration//GEN-END:variables
}
