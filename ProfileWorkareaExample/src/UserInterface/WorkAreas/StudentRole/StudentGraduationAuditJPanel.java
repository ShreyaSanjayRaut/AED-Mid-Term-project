/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.StudentRole;

import Business.Business;
import Business.Course;
import Business.CourseList;
import Business.Profiles.StudentProfile;
import Business.StudentCourseBean;
import ManagerBean.CourseManagerBean;
import ManagerBean.FacultyManagerBean;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author manal
 */
public class StudentGraduationAuditJPanel extends javax.swing.JPanel {

    Business business;
    StudentProfile student;
    CourseList courselists;
    CourseManagerBean courseManagerBean;
    String selectedCourse = null;
    String selectedProfessor = null;
    FacultyManagerBean facultyManagerBean;
    JPanel CardSequencePanel;
    Course selectedCorse;
    /**
     * Creates new form StudentGraduationAuditJPanel
     */
    public StudentGraduationAuditJPanel(Business business, StudentProfile student, CourseList courselist, CourseManagerBean courseManagerBean, FacultyManagerBean facultyManagerBean,JPanel CardSequencePanel) {
        this.business = business;
        this.student = student;
        this.courselists = courselists;
        this.courseManagerBean = courseManagerBean;
        this.CardSequencePanel =CardSequencePanel ;
        initComponents();
        populateCredits();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTotalCredit = new javax.swing.JTextField();
        txtRemainingCredit = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        jLabel1.setText("Graduation :");

        jLabel2.setText("Total Credits taken :");

        jLabel3.setText("Remaining Credits :");

        txtTotalCredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalCreditActionPerformed(evt);
            }
        });

        jButton1.setText("Audit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Back.setText("<< Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Back)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRemainingCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(34, 34, 34)
                            .addComponent(txtTotalCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(1017, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTotalCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRemainingCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(Back)
                .addContainerGap(494, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
        //       ((java.awt.CardLayout)CardSequencePanel.getLayout()).show(CardSequencePanel, "IdentifyEventTypes");
    }//GEN-LAST:event_BackActionPerformed

    private void txtTotalCreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalCreditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalCreditActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         int totalCredits=0;
        
       for (StudentProfile student : StudentCourseBean.studentCourseMap.keySet()) {
              List<Course> studentCourses = StudentCourseBean.studentCourseMap.get(student);

        for (Course course : studentCourses) {
            
           totalCredits += course.getCredit();
        }
  
       }
       int remainingCredit=8-totalCredits;
       if(remainingCredit!=0)
       {
           JOptionPane.showMessageDialog(this, "You still need to complete " + remainingCredit + " . Please enroll courses");
       }else{
            JOptionPane.showMessageDialog(this, "Congratulation You completed your credits");
       }
       
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtRemainingCredit;
    private javax.swing.JTextField txtTotalCredit;
    // End of variables declaration//GEN-END:variables

    private void populateCredits() {
        
        int totalCredits=0;
        
       for (StudentProfile student : StudentCourseBean.studentCourseMap.keySet()) {
              List<Course> studentCourses = StudentCourseBean.studentCourseMap.get(student);

        for (Course course : studentCourses) {
            
           totalCredits += course.getCredit();
        }
  
       }
       
       txtTotalCredit.setText(Integer.toString(totalCredits));
       txtRemainingCredit.setText(Integer.toString(8-totalCredits));
       
       
       
    }
}