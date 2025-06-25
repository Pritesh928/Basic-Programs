import java.util.*;
public class Course {
    static int maxcapacity = 100;
    String coursename;
    int enrollment;

    String [] enrolledstudents;
    Course(String coursename){
        this.coursename = coursename;
        this.enrollment = 0;
        this.enrolledstudents = new String[maxcapacity];
    }

    static void setmaxcapacity(int maxcapacity){
        Course.maxcapacity = maxcapacity;
    }
    void enrollstudents(String Studentname){
        enrolledstudents[enrollment] = Studentname;
        enrollment++;
    }
    void unenrollstudent(String studentname){
        System.out.println("Student removed");
        enrollment--;
    }

}
