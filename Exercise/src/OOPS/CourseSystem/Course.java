package OOPS.CourseSystem;

import java.util.Objects;

class Course {

    static int maxCapacity = 10;
    String CourseName;
    int enrollments;
    String [] enrolledStudents = new String[maxCapacity];
    boolean isEnrolled;

    Course(String CourseName){
        this.CourseName = CourseName;

    }

    public static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }
    void enrollStudent(String studentName){

        enrolledStudents[enrollments] = studentName;
        enrollments++;
        System.out.println(studentName + " is enrolled in " + CourseName);

    }
    public void unenrollStudent(String studentName){

        for(int i = 0 ; i < enrolledStudents.length ; i++) {
            if (enrolledStudents[i].equals(studentName)) {
                enrolledStudents[i] = null;
                enrollments--;
                break;
            }

        }
        System.out.println(studentName + " is Unenrolled from " + CourseName + " course");
    }

    public static void main(String[] args) {
        Course C1 = new Course("MERN");
        Course C2 = new Course("REACT");
//        System.out.println(C1.enrollments);
//        System.out.println("Maximum capacity of courses : " + Course.maxCapacity);
        setMaxCapacity(5);
        System.out.println("Maximum capacity of courses : " + Course.maxCapacity);

        C1.enrollStudent("ADITYA JAISWAL");
        C1.enrollStudent("KALASH SRIVASTAVA");
        System.out.println("Total student in " + C1.CourseName +" course : " +C1.enrollments);
        C1.unenrollStudent("KALASH SRIVASTAVA");
        System.out.println("Total student in " + C1.CourseName +" course : " +C1.enrollments);
        C2.enrollStudent("Prerna Sharma");
        C2.enrollStudent("Abhishek Kumar");
        Course.setMaxCapacity(3);
        System.out.println("Total student in " + C2.CourseName +" course : " +C2.enrollments);
        C2.unenrollStudent("Abhishek Kumar");
        System.out.println("Total student in " + C2.CourseName +" course : " +C2.enrollments);
    }
}
