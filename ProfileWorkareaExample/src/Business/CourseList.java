/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author manal
 */
public class CourseList {
    
    ArrayList<Course> courseList;

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }
    
    public Course addNewCourse()
    {
        Course course = new Course();
        courseList.add(course);
        return course;
    }
    
    
    
}
