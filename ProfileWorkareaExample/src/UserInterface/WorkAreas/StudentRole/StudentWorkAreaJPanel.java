/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * WorkAreaJPanel.java
 *
 * Created on May 17, 2020, 8:35:29 AM
 */
package UserInterface.WorkAreas.StudentRole;

import Business.Business;
import Business.CourseList;
import Business.Profiles.StudentProfile;
import ManagerBean.CourseManagerBean;
import ManagerBean.FacultyManagerBean;
import javax.swing.JPanel;

/**
 *
 * @author kal
 */
public class StudentWorkAreaJPanel extends javax.swing.JPanel {

    javax.swing.JPanel CardSequencePanel;
    Business business;
    StudentProfile student;
    StudentCourseRegisterationJPanel courseRegJPanel;
    CourseList courselist;
    CourseManagerBean courseManagerBean;
    FacultyManagerBean facultyManagerBean;
    StudentGraduationAuditJPanel auditJPanel;

    StudentCourseWorkJPanel couseWorkJPanel;
    StudentTranscriptJPanel studentTranscriptJPanel;

    /**
     * Creates new form UnitRiskWorkArea
     *
     * @param b
     * @param spp
     * @param clp
     */
    public StudentWorkAreaJPanel(Business business, StudentProfile student, CourseList courselist, CourseManagerBean courseManagerBean, FacultyManagerBean facultyManagerBean, JPanel CardSequencePanel) {
        initComponents();

        this.business = business;
        this.student = student;
        this.courselist = courselist;
        this.courseManagerBean = courseManagerBean;
        this.facultyManagerBean = facultyManagerBean;
        this.CardSequencePanel = CardSequencePanel;
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

        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();

        setForeground(new java.awt.Color(51, 51, 51));

        jButton4.setBackground(new java.awt.Color(102, 153, 255));
        jButton4.setFont(getFont());
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Course Work");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton4.setMinimumSize(new java.awt.Dimension(20, 23));
        jButton4.setPreferredSize(new java.awt.Dimension(240, 30));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4IdentifyResourceAssetsActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(102, 153, 255));
        jButton9.setFont(getFont());
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Manage Profile");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton9.setMinimumSize(new java.awt.Dimension(20, 20));
        jButton9.setPreferredSize(new java.awt.Dimension(240, 25));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(102, 153, 255));
        jButton10.setFont(getFont());
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Graduation Audit");
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton10.setMinimumSize(new java.awt.Dimension(20, 20));
        jButton10.setPreferredSize(new java.awt.Dimension(240, 25));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        btnRegister.setBackground(new java.awt.Color(102, 153, 255));
        btnRegister.setFont(getFont());
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Registration");
        btnRegister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegister.setMaximumSize(new java.awt.Dimension(200, 40));
        btnRegister.setMinimumSize(new java.awt.Dimension(20, 20));
        btnRegister.setPreferredSize(new java.awt.Dimension(240, 25));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("My Student Portal");

        jButton12.setBackground(new java.awt.Color(102, 153, 255));
        jButton12.setFont(getFont());
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Transcript");
        jButton12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton12.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton12.setMinimumSize(new java.awt.Dimension(20, 20));
        jButton12.setPreferredSize(new java.awt.Dimension(240, 25));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(590, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4IdentifyResourceAssetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4IdentifyResourceAssetsActionPerformed

      
        couseWorkJPanel = new StudentCourseWorkJPanel(business, student, courselist, courseManagerBean, facultyManagerBean, CardSequencePanel);
        CardSequencePanel.add("couseWorkPanel", couseWorkJPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_jButton4IdentifyResourceAssetsActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:

//        ManageVulns aos = new  ManageVulns(businessunit, CardSequencePanel);
        // aos.setAgenda(businessunit.getRiskManagementAgenda());
//        CardSequencePanel.add("ManageVulns", aos);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

}//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        // TODO add your handling code here:

        /*       ManageSalesPersonOrders iet = new ManageSalesPersonOrders(business, CardSequencePanel);

            */
         auditJPanel = new StudentGraduationAuditJPanel(business, student, courselist, courseManagerBean, facultyManagerBean, CardSequencePanel);
        CardSequencePanel.add("auditJPanel", auditJPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_jButton10ActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:

        courseRegJPanel = new StudentCourseRegisterationJPanel(business, student, courselist, courseManagerBean, facultyManagerBean, CardSequencePanel);

        CardSequencePanel.add("courseRegistration", courseRegJPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

}//GEN-LAST:event_btnRegisterActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        
         studentTranscriptJPanel = new StudentTranscriptJPanel(business, student, courselist, courseManagerBean, facultyManagerBean, CardSequencePanel);
        CardSequencePanel.add("studentTranscriptJPanel", studentTranscriptJPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_jButton12ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
