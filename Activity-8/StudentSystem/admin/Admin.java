package admin;

import student.Student;
import course.Course;

public class Admin {
    public void manage() {
        Student s = new Student();
        Course c = new Course();

        s.showStudent();
        c.showCourse();

        System.out.println("Admin managing system");
    }
}