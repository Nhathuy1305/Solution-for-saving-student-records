/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project_pdm;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author user
 */
public class DeletingCourseForm extends javax.swing.JFrame {
    Course course;
    /**
     * Creates new form DeletingCourseForm
     */
    public DeletingCourseForm() throws SQLException {
        initComponents();
        course= new Course();
        txtWelcoming.setText(String.format("Welcoming %s", Student.getInstance().getStudentName()));
        createTable();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnEnrolledForm = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtWelcoming = new javax.swing.JLabel();
        JScrollPane = new javax.swing.JScrollPane();
        showtable = new javax.swing.JTable();
        txtCourseID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtClassroom = new javax.swing.JTextField();
        txtTeacher = new javax.swing.JTextField();
        txtCredit = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel2.setText("DELETING COURSE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        btnEnrolledForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/LogoutEnrolled-icon.png"))); // NOI18N
        btnEnrolledForm.setText("EnrolledForm");
        btnEnrolledForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnrolledFormActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnrolledForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/10207-man-student-light-skin-tone-icon-64.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 86));

        txtWelcoming.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtWelcoming.setText("jLabel4");
        getContentPane().add(txtWelcoming, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        showtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        showtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showtableMouseClicked(evt);
            }
        });
        JScrollPane.setViewportView(showtable);

        getContentPane().add(JScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 845, 342));
        getContentPane().add(txtCourseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 360, 333, 31));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 424, 333, 31));
        getContentPane().add(txtClassroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 488, 333, 31));
        getContentPane().add(txtTeacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 558, 333, 31));
        getContentPane().add(txtCredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 622, 333, 31));

        btnConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/Actions-edit-delete-icon-48.png"))); // NOI18N
        btnConfirm.setText("OK");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 665, 110, 36));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("CourseID:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 333, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Course Name:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 397, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Classroom:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 461, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Teacher:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 531, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Credit:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 595, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/DeletingBackGround4.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 290, 710));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/DeletingBackground3.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 270, 710));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/DeletingBackground2.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 300, 710));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/DeletingBackGround1.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnrolledFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnrolledFormActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        try {
            new EnrolledForm();
        } catch (SQLException ex) {
            Logger.getLogger(AddingCourseForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEnrolledFormActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        if(course.getCourseID() == null)
        {
            JOptionPane.showMessageDialog(null, "You havent choosen any course", "", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            SqlQuery sql= new SqlQuery();
            try {
                sql.deleteCourse(Student.getInstance().getStudentID(), course.getCourseID());
            } catch (SQLException ex) {
                Logger.getLogger(DeletingCourseForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Deleting course successful", "", JOptionPane.INFORMATION_MESSAGE);
            course= new Course();
            try {
                createTable();
            }
            catch (SQLException ex) {
                Logger.getLogger(AddingCourseForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnConfirmActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void showtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showtableMouseClicked
        // TODO add your handling code here:
        int i= showtable.getSelectedRow();
        TableModel model= showtable.getModel();

        course.setCourseID((String) model.getValueAt(i, 0));
        course.setCourseName((String) model.getValueAt(i, 1));
        course.setClassroom((String) model.getValueAt(i, 2));
        course.setTeacher((String) model.getValueAt(i, 3));
        course.setCredit((int) model.getValueAt(i, 4));
        
        txtCourseID.setText((String) model.getValueAt(i, 0));
        txtName.setText((String) model.getValueAt(i, 1));
        txtClassroom.setText((String) model.getValueAt(i, 2));
        txtTeacher.setText((String) model.getValueAt(i, 3));
        txtCredit.setText(Integer.toString(course.getCredit()));
        System.out.println(course);
    }//GEN-LAST:event_showtableMouseClicked

    private void createTable () throws SQLException {
        SqlQuery sqlquery = new SqlQuery();
        ResultSet rs= sqlquery.getEnrolledResultSet();
        ResultSetMetaData metaData = rs.getMetaData();
        ArrayList<Object>temp = new ArrayList<>();
        int numberrows=0;
        while(rs.next())
        {
            numberrows++;
            for(int i=1;i<=metaData.getColumnCount();i++)
            {
                temp.add(rs.getObject(i));
            }
        }
        Object [][] data = new Object[numberrows][metaData.getColumnCount()];
        for(int i=0;i<numberrows;i++)
        {
            for(int j=0;j<metaData.getColumnCount();j++)
            {
                data[i][j]= temp.get(0);
                temp.remove(0);
            }
        }
        String[] column = new String[metaData.getColumnCount()];
        for(int i=0;i<metaData.getColumnCount();i++)    column[i]= metaData.getColumnName(i+1);
        showtable.setModel(new DefaultTableModel(
                data,
                column
        ));
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
            java.util.logging.Logger.getLogger(DeletingCourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeletingCourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeletingCourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeletingCourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DeletingCourseForm().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(DeletingCourseForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnEnrolledForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTable showtable;
    private javax.swing.JTextField txtClassroom;
    private javax.swing.JTextField txtCourseID;
    private javax.swing.JTextField txtCredit;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTeacher;
    private javax.swing.JLabel txtWelcoming;
    // End of variables declaration//GEN-END:variables
}