/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//package project_pdm;

/**
 *
 * @author user
 */

package  project_pdm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.print.ServiceUIFactory;



public class MainFormAdmin extends javax.swing.JFrame {
    private User user= User.getInstance();
    
    /**
     * Creates new form MainFrom
     */
    public MainFormAdmin() {
        setVisible(true);
        setLocationRelativeTo(null);
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

        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnFreeEdit = new javax.swing.JButton();
        btnViewEnrolled = new javax.swing.JButton();
        btnViewStudent = new javax.swing.JButton();
        btnScholarship = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/LogoutEnrolled-icon.png"))); // NOI18N
        btnLogout.setText("Log out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel2.setText("STUDENT SAVING RECORDS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 550, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/gpa-icon-64.png"))); // NOI18N
        jLabel3.setText("Admin");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        btnFreeEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/edit-icon-64.png"))); // NOI18N
        btnFreeEdit.setText("Free Edit");
        btnFreeEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFreeEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnFreeEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 430, 209, 85));

        btnViewEnrolled.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/edit-icon-64.png"))); // NOI18N
        btnViewEnrolled.setText("View Course");
        btnViewEnrolled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEnrolledActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewEnrolled, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 209, 85));

        btnViewStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/edit-icon-64.png"))); // NOI18N
        btnViewStudent.setText("view Student");
        btnViewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStudentActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 209, 85));

        btnScholarship.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/edit-icon-64.png"))); // NOI18N
        btnScholarship.setText("View Scholarship");
        btnScholarship.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScholarshipActionPerformed(evt);
            }
        });
        getContentPane().add(btnScholarship, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, 209, 85));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        User.getInstance().setadmin(false);
        setVisible(false);
        new LoginForm();
        
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnFreeEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFreeEditActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new FreeEditForm();
    }//GEN-LAST:event_btnFreeEditActionPerformed

    private void btnViewEnrolledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEnrolledActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        try {
            new NewCourseForm();
        } catch (SQLException ex) {
            Logger.getLogger(MainFormAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnViewEnrolledActionPerformed

    private void btnViewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStudentActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        try {
            new ViewStudentForm();
        } catch (SQLException ex) {
            Logger.getLogger(MainFormAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnViewStudentActionPerformed

    private void btnScholarshipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScholarshipActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        try {
            new ViewScholardshipForm();
        } catch (SQLException ex) {
            Logger.getLogger(MainFormAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnScholarshipActionPerformed

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
            java.util.logging.Logger.getLogger(MainFormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFormAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFreeEdit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnScholarship;
    private javax.swing.JButton btnViewEnrolled;
    private javax.swing.JButton btnViewStudent;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
