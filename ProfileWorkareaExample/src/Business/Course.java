/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author manal
 */

import Business.Profiles.StudentAccount;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseCode;
    private String courseName;
    private String instructor;
    private List<StudentAccount> students;
    private int credit;

    public Course(String courseCode, String courseName, String instructor, List<StudentAccount> students, int credit) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
        this.students = students;
        this.credit = credit;
    }

    Course() {
        
    }
  
    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public List<StudentAccount> getStudents() {
        return students;
    }
}

    