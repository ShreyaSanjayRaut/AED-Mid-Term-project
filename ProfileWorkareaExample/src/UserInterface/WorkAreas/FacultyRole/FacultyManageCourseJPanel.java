/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.FacultyRole;

import Business.Business;
import Business.Course;
import Business.CourseList;
import Business.FacultyCourseBean;
import Business.Person.PersonDirectory;
import Business.Profiles.FacultyProfile;
import Business.StudentCourseBean;
import ManagerBean.CourseManagerBean;
import UserInterface.WorkAreas.StudentRole.StudentCourseWorkAreaJPanel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;

/**
 *
 * @author kunal
 */
public class FacultyManageCourseJPanel extends javax.swing.JPanel {

    Business business;
    PersonDirectory list;
    FacultyProfile faculty;
    javax.swing.JPanel CardSequencePanel;
    CourseList courselist;
    CourseManagerBean courseManagerBean;
    String selectedCourse=null;

    /**
     * Creates new form FacultyManageCourseJPanel
     */
    public FacultyManageCourseJPanel() {
        initComponents();
    }

    public FacultyManageCourseJPanel(Business b, FacultyProfile faculty, CourseList courselist, CourseManagerBean courseManagerBean, JPanel clp) {

        business = b;
        this.CardSequencePanel = clp;
        this.faculty = faculty;
        this.courselist = courselist;
        this.courseManagerBean = courseManagerBean;
        initComponents();
        popuateCourse();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblSelSem = new javax.swing.JLabel();
        scrSemSelector = new javax.swing.JScrollPane();
        lisSemSelector = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        scrCourseSelector = new javax.swing.JList<>();
        lblSelCou = new javax.swing.JLabel();
        lblTimings = new javax.swing.JLabel();
        comTimings = new javax.swing.JComboBox<>();
        btnAddCourseDetails = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnNext1 = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Manage Course (Faculty)");

        lblSelSem.setText("Select Semester:");

        lisSemSelector.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Semester-1", "Semester-2", "Semester-3", "Semester-4", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrSemSelector.setViewportView(lisSemSelector);

        scrCourseSelector.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                scrCourseSelectorValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(scrCourseSelector);

        lblSelCou.setText("Select Course:");

        lblTimings.setText("Timings:");

        comTimings.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00 AM - 11:00 AM", "11:30 AM - 1:30 PM", "3:00 PM - 6:00 PM", " " }));

        btnAddCourseDetails.setText("Add Course Details");
        btnAddCourseDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCourseDetailsActionPerformed(evt);
            }
        });

        btnNext.setText("Next >>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnNext1.setText("<< Back");
        btnNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTimings)
                    .addComponent(lblSelSem))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrSemSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSelCou)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comTimings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(324, 324, 324)
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(427, 427, 427)
                .addComponent(btnNext1)
                .addGap(54, 54, 54)
                .addComponent(btnAddCourseDetails)
                .addGap(56, 56, 56)
                .addComponent(btnNext)
                .addGap(0, 319, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSelSem)
                    .addComponent(scrSemSelector)
                    .addComponent(lblSelCou)
                    .addComponent(jScrollPane2))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comTimings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTimings))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCourseDetails)
                    .addComponent(btnNext)
                    .addComponent(btnNext1))
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void scrCourseSelectorValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_scrCourseSelectorValueChanged
        // TODO add your handling code here:
        
        
        Object[] selectedValues = scrCourseSelector.getSelectedValuesList().toArray();

        if (!evt.getValueIsAdjusting()) {
            // Get the selected options

            for (Object selectedValue : selectedValues) {
                // System.out.println("Selected: " + selectedValue);
                 selectedCourse = selectedValue.toString();
            }
        }
    }//GEN-LAST:event_scrCourseSelectorValueChanged

    private void btnAddCourseDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCourseDetailsActionPerformed
        // TODO add your handling code here:
        
        FacultyCourseBean.saveCourse(courseManagerBean.findCourse(selectedCourse),faculty);
    }//GEN-LAST:event_btnAddCourseDetailsActionPerformed

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
        // TODO add your handling code here:
         CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnNext1ActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        if(selectedCourse==null) return;
        
        FacultyAssignmentInfoJPanel faij = new FacultyAssignmentInfoJPanel(business,faculty,courseManagerBean,selectedCourse,CardSequencePanel);
        CardSequencePanel.add(faij);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);  
    }//GEN-LAST:event_btnNextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCourseDetails;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNext1;
    private javax.swing.JComboBox<String> comTimings;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSelCou;
    private javax.swing.JLabel lblSelSem;
    private javax.swing.JLabel lblTimings;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JList<String> lisSemSelector;
    private javax.swing.JList<String> scrCourseSelector;
    private javax.swing.JScrollPane scrSemSelector;
    // End of variables declaration//GEN-END:variables

    private void popuateCourse() {

        ArrayList<Course> courses = courselist.getCourseList();

        // Create a DefaultListModel and add elements from the array
        DefaultListModel<String> listModel2 = new DefaultListModel<>();
        for (Course item : courses) {

            listModel2.addElement(item.toString());

        }

        scrCourseSelector.setModel(listModel2);
    }
}