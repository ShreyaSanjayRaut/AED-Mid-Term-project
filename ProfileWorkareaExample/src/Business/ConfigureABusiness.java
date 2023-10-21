/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package Business;

import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Profiles.EmployeeDirectory;
import Business.Profiles.EmployeeProfile;
import Business.Profiles.FacultyDirectory;
import Business.Profiles.FacultyProfile;
import Business.Profiles.StudentDirectory;
import Business.Profiles.StudentProfile;

import Business.UserAccounts.UserAccount;
import Business.UserAccounts.UserAccountDirectory;
import ManagerBean.CourseManagerBean;
import java.util.Date;

/**
 *
 * @author kal bugrara
 */
class ConfigureABusiness {
    static PersonDirectory persondirectory=null;
    static Business business = null;

    static Business initialize() {
      business = new Business("Information Systems");

// Create Persons
         persondirectory = business.getPersonDirectory();
// person representing sales organization        
        /*  Person xeroxsalesperson001 = persondirectory.newPerson("Xerox sales");
        Person xeroxmarketingperson001 = persondirectory.newPerson("Xerox marketing");
        Person xeroxadminperson001 = persondirectory.newPerson("Xerox admin");

// Create person objects to represent customer organizations. 
        Person person005 = persondirectory.newPerson("Dell");
        Person person006 = persondirectory.newPerson("Microsoft");
        Person person007 = persondirectory.newPerson("Google");
        Person person008 = persondirectory.newPerson("JP Morgan");
        Person person009 = persondirectory.newPerson("State street"); //we use this as customer 

// Create Customers*/

// Create Admins to manage the business
        Person xeroxadminperson001 = persondirectory.newPerson("Xerox admin");
        EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
        EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(xeroxadminperson001);

// Create User accounts that link to specific profiles
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        UserAccount ua3 = uadirectory.newUserAccount(employeeprofile0, "admin", "XXXX"); /// order products for one of the customers and performed by a sales person

        Person student01 = persondirectory.newPerson("S01");
        StudentDirectory studentdirectory = business.getStudentDirectory();
        //    EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(xeroxadminperson001);

        StudentProfile studentProfile = studentdirectory.newStudentProfile(student01);

        UserAccount ua2 = uadirectory.newUserAccount(studentProfile, "s", "s"); /// order products for one of the customers and performed by a sales person

        
         Person student02 = persondirectory.newPerson("S02");
      //  StudentDirectory studentdirectory = business.getStudentDirectory();
        //    EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(xeroxadminperson001);

        StudentProfile studentProfile02 = studentdirectory.newStudentProfile(student02);

        UserAccount su2 = uadirectory.newUserAccount(studentProfile02, "m", "m"); /// order products for one of the customers and performed by a sales person

        
               Person faculty01 = persondirectory.newPerson("F01");
        FacultyDirectory facultydirectory = business.getFacultyDirectory();
        //    EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(xeroxadminperson001);

        FacultyProfile facultyProfile = facultydirectory.newFacultyProfile(faculty01);
        UserAccount ua1 = uadirectory.newUserAccount(facultyProfile, "f", "f"); 
        
         
        FacultyDirectory directory=business.getFacultyDirectory();
        FacultyProfile profile =directory.newFacultyProfile(new Person("KAL"));
       
        
        
        FacultyProfile profile2 =directory.newFacultyProfile(new Person("AMUTHAN"));
        //System.out.println("UserInterface.WorkAreas.StudentRole.StudentCourseRegisterationJPanel.temp()");
        //System.out.println("UserInterface.WorkAreas.StudentRole.StudentCourseRegisterationJPanel.temp()");
       
            
        return business;

    }
    
    static CourseList getCourse()
    {
         CourseList courseList = new CourseList();
        // Convert ArrayList to an array
        Course course = courseList.addNewCourse();
        course.setCourseCode("5100");
        course.setCredit(4);
        course.setCourseName("AED");
       
        Course course2 = courseList.addNewCourse();
        course2.setCourseCode("6100");
        course2.setCredit(4);
        course2.setCourseName("web");

        Course course3 = courseList.addNewCourse();
        course3.setCourseCode("7100");
        course3.setCredit(4);
        course3.setCourseName("cloud");

        Assignment assignment = new Assignment(0, "assignmemt-1",business.getFacultyDirectory().findFaculty("KAL").getPerson().getId(), course,100, new Date("11/10/2023"));
        
        course.addAssignment(assignment);
        
         Assignment assignment2 = new Assignment(0, "assignmemt-1",business.getFacultyDirectory().findFaculty("AMUTHAN").getPerson().getId(), course,100,new Date("11/10/2023"));
        course2.addAssignment(assignment2);
        
        
         return courseList;

    }

}
