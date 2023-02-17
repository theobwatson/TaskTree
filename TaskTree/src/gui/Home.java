/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import date.DateTimeConverter;
import interfaces.TaskCallback;
import task.Task;
import task.TaskTree;

public class Home extends javax.swing.JFrame implements TaskCallback {

    public TaskTree mainTree;
    public Task current;
    public static String name;

    public Home(String name) {
        Home.name = name;
        initComponents();
        WelcomeText.setText(name);
        this.mainTree = new TaskTree(name);
        this.displayRanking.setText(mainTree.user.getRanking() + "");
        this.rankProgress.setMaximum(mainTree.user.getRanking().leaves);
        this.rankProgress.setValue(mainTree.user.getLeaves());
        nullCurrentTask();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        displayLeaves = new javax.swing.JLabel();
        resetTreeButton = new javax.swing.JButton();
        myGrowthButton = new javax.swing.JButton();
        upNext = new javax.swing.JLabel();
        helpButton = new javax.swing.JButton();
        TaskHistoryButton = new javax.swing.JButton();
        dueLabel = new javax.swing.JLabel();
        nextTitle = new javax.swing.JLabel();
        displayRanking = new javax.swing.JLabel();
        viewAllButton = new javax.swing.JButton();
        deleteCurrentButton = new javax.swing.JButton();
        displayDue = new javax.swing.JLabel();
        nextDescription = new javax.swing.JLabel();
        addNewButton = new javax.swing.JButton();
        markCompletedButton = new javax.swing.JButton();
        changeToCurrentButton = new javax.swing.JButton();
        editCurrentButton = new javax.swing.JButton();
        openCurrentButton = new javax.swing.JButton();
        currentDescription = new javax.swing.JLabel();
        currentTitle = new javax.swing.JLabel();
        MainTitle = new javax.swing.JLabel();
        currentTask = new javax.swing.JLabel();
        rankProgress = new javax.swing.JProgressBar();
        version = new javax.swing.JLabel();
        WelcomeText = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TaskTree");
        setMinimumSize(new java.awt.Dimension(844, 575));
        setResizable(false);
        setSize(new java.awt.Dimension(856, 551));
        getContentPane().setLayout(null);

        displayLeaves.setFont(new java.awt.Font("Drm Handwritten Thin", 0, 48)); // NOI18N
        displayLeaves.setForeground(new java.awt.Color(255, 255, 255));
        displayLeaves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displayLeaves.setText("0");
        getContentPane().add(displayLeaves);
        displayLeaves.setBounds(10, 170, 150, 70);

        resetTreeButton.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        resetTreeButton.setForeground(new java.awt.Color(255, 222, 220));
        resetTreeButton.setText("Reset Tree");
        resetTreeButton.setContentAreaFilled(false);
        getContentPane().add(resetTreeButton);
        resetTreeButton.setBounds(10, 510, 110, 30);

        myGrowthButton.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        myGrowthButton.setForeground(new java.awt.Color(167, 202, 177));
        myGrowthButton.setText("My Growth");
        myGrowthButton.setContentAreaFilled(false);
        getContentPane().add(myGrowthButton);
        myGrowthButton.setBounds(10, 375, 150, 30);

        upNext.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        upNext.setForeground(new java.awt.Color(167, 202, 177));
        upNext.setText("Up Next >");
        getContentPane().add(upNext);
        upNext.setBounds(210, 271, 140, 40);

        helpButton.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        helpButton.setForeground(new java.awt.Color(255, 255, 255));
        helpButton.setText("?");
        helpButton.setContentAreaFilled(false);
        getContentPane().add(helpButton);
        helpButton.setBounds(130, 510, 30, 30);

        TaskHistoryButton.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        TaskHistoryButton.setForeground(new java.awt.Color(167, 202, 177));
        TaskHistoryButton.setText("Task History");
        TaskHistoryButton.setContentAreaFilled(false);
        getContentPane().add(TaskHistoryButton);
        TaskHistoryButton.setBounds(10, 424, 150, 30);

        dueLabel.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        dueLabel.setForeground(new java.awt.Color(49, 10, 49));
        dueLabel.setText("Due:");
        getContentPane().add(dueLabel);
        dueLabel.setBounds(628, 70, 44, 20);

        nextTitle.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        nextTitle.setForeground(new java.awt.Color(102, 102, 102));
        nextTitle.setText("[Task Title]");
        getContentPane().add(nextTitle);
        nextTitle.setBounds(230, 330, 260, 21);

        displayRanking.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        displayRanking.setForeground(new java.awt.Color(49, 10, 49));
        displayRanking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displayRanking.setText("[level]");
        getContentPane().add(displayRanking);
        displayRanking.setBounds(20, 245, 130, 17);

        viewAllButton.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        viewAllButton.setForeground(new java.awt.Color(255, 255, 255));
        viewAllButton.setText("      View All");
        viewAllButton.setBorderPainted(false);
        viewAllButton.setContentAreaFilled(false);
        viewAllButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        viewAllButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        viewAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllButtonActionPerformed(evt);
            }
        });
        getContentPane().add(viewAllButton);
        viewAllButton.setBounds(600, 490, 230, 40);

        deleteCurrentButton.setFont(new java.awt.Font("Courier New", 0, 16)); // NOI18N
        deleteCurrentButton.setForeground(new java.awt.Color(255, 153, 153));
        deleteCurrentButton.setText("Delete");
        deleteCurrentButton.setBorderPainted(false);
        deleteCurrentButton.setContentAreaFilled(false);
        deleteCurrentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCurrentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteCurrentButton);
        deleteCurrentButton.setBounds(730, 190, 90, 30);

        displayDue.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        displayDue.setForeground(new java.awt.Color(255, 255, 255));
        displayDue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displayDue.setText("[Due date]");
        getContentPane().add(displayDue);
        displayDue.setBounds(690, 70, 110, 21);

        nextDescription.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        nextDescription.setForeground(new java.awt.Color(102, 102, 102));
        nextDescription.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nextDescription.setText("[Description] ");
        nextDescription.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        nextDescription.setIconTextGap(0);
        nextDescription.setIgnoreRepaint(true);
        nextDescription.setMaximumSize(new java.awt.Dimension(141, 21));
        getContentPane().add(nextDescription);
        nextDescription.setBounds(230, 380, 580, 90);

        addNewButton.setFont(new java.awt.Font("Courier New", 1, 17)); // NOI18N
        addNewButton.setForeground(new java.awt.Color(255, 255, 255));
        addNewButton.setText("+ Add Task");
        addNewButton.setBorderPainted(false);
        addNewButton.setContentAreaFilled(false);
        addNewButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addNewButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        addNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addNewButton);
        addNewButton.setBounds(20, 67, 140, 50);

        markCompletedButton.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        markCompletedButton.setForeground(new java.awt.Color(255, 255, 255));
        markCompletedButton.setText(" Mark completed");
        markCompletedButton.setBorderPainted(false);
        markCompletedButton.setContentAreaFilled(false);
        markCompletedButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        markCompletedButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        markCompletedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markCompletedButtonActionPerformed(evt);
            }
        });
        getContentPane().add(markCompletedButton);
        markCompletedButton.setBounds(310, 190, 190, 30);

        changeToCurrentButton.setFont(new java.awt.Font("Courier New", 0, 16)); // NOI18N
        changeToCurrentButton.setForeground(new java.awt.Color(255, 255, 255));
        changeToCurrentButton.setText("Change to Current");
        changeToCurrentButton.setBorderPainted(false);
        changeToCurrentButton.setContentAreaFilled(false);
        changeToCurrentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeToCurrentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(changeToCurrentButton);
        changeToCurrentButton.setBounds(620, 326, 200, 30);

        editCurrentButton.setFont(new java.awt.Font("Courier New", 0, 16)); // NOI18N
        editCurrentButton.setForeground(new java.awt.Color(255, 255, 255));
        editCurrentButton.setText("Edit");
        editCurrentButton.setBorderPainted(false);
        editCurrentButton.setContentAreaFilled(false);
        editCurrentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCurrentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(editCurrentButton);
        editCurrentButton.setBounds(620, 190, 90, 30);

        openCurrentButton.setFont(new java.awt.Font("Courier New", 0, 16)); // NOI18N
        openCurrentButton.setForeground(new java.awt.Color(255, 255, 255));
        openCurrentButton.setText("Open");
        openCurrentButton.setBorderPainted(false);
        openCurrentButton.setContentAreaFilled(false);
        openCurrentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openCurrentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(openCurrentButton);
        openCurrentButton.setBounds(510, 190, 100, 30);

        currentDescription.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        currentDescription.setForeground(new java.awt.Color(102, 102, 102));
        currentDescription.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        currentDescription.setText("[Description]");
        currentDescription.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        currentDescription.setIconTextGap(0);
        currentDescription.setIgnoreRepaint(true);
        currentDescription.setMaximumSize(new java.awt.Dimension(141, 21));
        getContentPane().add(currentDescription);
        currentDescription.setBounds(230, 120, 580, 50);

        currentTitle.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        currentTitle.setForeground(new java.awt.Color(102, 102, 102));
        currentTitle.setText("[Task Title]");
        getContentPane().add(currentTitle);
        currentTitle.setBounds(230, 70, 260, 21);

        MainTitle.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        MainTitle.setForeground(new java.awt.Color(167, 202, 177));
        MainTitle.setText("TaskTree");
        getContentPane().add(MainTitle);
        MainTitle.setBounds(20, 10, 140, 40);

        currentTask.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        currentTask.setForeground(new java.awt.Color(167, 202, 177));
        currentTask.setText("Current Task >");
        getContentPane().add(currentTask);
        currentTask.setBounds(210, 13, 160, 40);

        rankProgress.setBackground(new java.awt.Color(255, 255, 255));
        rankProgress.setForeground(new java.awt.Color(167, 202, 177));
        rankProgress.setValue(50);
        rankProgress.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(rankProgress);
        rankProgress.setBounds(17, 270, 138, 10);

        version.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        version.setForeground(new java.awt.Color(153, 153, 255));
        version.setText("v1.0");
        getContentPane().add(version);
        version.setBounds(810, 530, 42, 17);

        WelcomeText.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        WelcomeText.setForeground(new java.awt.Color(255, 255, 255));
        WelcomeText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomeText.setText("[name]");
        getContentPane().add(WelcomeText);
        WelcomeText.setBounds(20, 332, 130, 20);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backgroundv1.5.png"))); // NOI18N
        Background.setText("jLabel2");
        Background.setMaximumSize(new java.awt.Dimension(860, 550));
        Background.setMinimumSize(new java.awt.Dimension(860, 550));
        Background.setPreferredSize(new java.awt.Dimension(860, 550));
        getContentPane().add(Background);
        Background.setBounds(0, -10, 854, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void markCompletedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markCompletedButtonActionPerformed
        if (mainTree.user.getCurrentTask() != null) {

            // sets leaves using ranking
            this.mainTree.user.taskComplete();

            // changes user leaves display
            this.displayLeaves.setText(mainTree.user.getLeaves() + "");

            // sets progress bar to new ranking and leaves
            this.rankProgress.setMaximum(mainTree.user.getRanking().leaves);
            this.rankProgress.setValue(mainTree.user.getLeaves());

            // add completed task to completed tree
            this.mainTree.completed.add(mainTree.user.getCurrentTask());
            this.mainTree.removeTask(mainTree.user.getCurrentTask());

            // open CompletedTask window
            CompletedTask window = new CompletedTask(mainTree);
            window.show();

        }
    }//GEN-LAST:event_markCompletedButtonActionPerformed


    private void editCurrentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCurrentButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editCurrentButtonActionPerformed

    private void openCurrentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openCurrentButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openCurrentButtonActionPerformed

    private void deleteCurrentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCurrentButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteCurrentButtonActionPerformed

    private void viewAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewAllButtonActionPerformed

    private void changeToCurrentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeToCurrentButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeToCurrentButtonActionPerformed

    private void addNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewButtonActionPerformed
        AddNew window = new AddNew(this);
        window.show();
    }//GEN-LAST:event_addNewButtonActionPerformed

    private void setCurrent() {
        this.currentTitle.setText(current.getTitle());
        this.currentDescription.setText(current.getDescription() + "Priority: "
                + current.getPriority());

        DateTimeConverter format = new DateTimeConverter();

        String formattedDate = format.dateToString(current.getDue());

        this.displayDue.setText(formattedDate);
    }

    private void nullCurrentTask() {
        if (this.current == null) {

            this.currentTitle.setText("[no tasks]");
            this.currentDescription.setText("[please add a new task]");
            this.displayDue.setText("[none]");
        }
    }

    private void nullNextTask() {
        try {
            this.current.getLessPriority();
        } catch (NullPointerException ex){
            this.nextTitle.setText("[no next task]");
            this.nextDescription.setText("[please add a new task]");
            this.displayDue.setText("[none]");
        }
    }

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home(name).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel MainTitle;
    private javax.swing.JButton TaskHistoryButton;
    private javax.swing.JLabel WelcomeText;
    private javax.swing.JButton addNewButton;
    private javax.swing.JButton changeToCurrentButton;
    private javax.swing.JLabel currentDescription;
    private javax.swing.JLabel currentTask;
    private javax.swing.JLabel currentTitle;
    private javax.swing.JButton deleteCurrentButton;
    private javax.swing.JLabel displayDue;
    private javax.swing.JLabel displayLeaves;
    private javax.swing.JLabel displayRanking;
    private javax.swing.JLabel dueLabel;
    private javax.swing.JButton editCurrentButton;
    private javax.swing.JButton helpButton;
    private javax.swing.JButton markCompletedButton;
    private javax.swing.JButton myGrowthButton;
    private javax.swing.JLabel nextDescription;
    private javax.swing.JLabel nextTitle;
    private javax.swing.JButton openCurrentButton;
    private javax.swing.JProgressBar rankProgress;
    private javax.swing.JButton resetTreeButton;
    private javax.swing.JLabel upNext;
    private javax.swing.JLabel version;
    private javax.swing.JButton viewAllButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onTaskCreated(Task task) {
        this.mainTree.add(task);

        if (this.current == null) {
            this.current = task;
            setCurrent();
        }
    }
}
