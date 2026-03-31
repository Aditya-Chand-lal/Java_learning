package classAndObjects;

public class detailsObject {
    public static void main(String[] args) {
        StudentClass student1 = new StudentClass("Aditya Jaiswal",960);      //Creating an Object;
        StudentClass s2 = new StudentClass("Kalash Srivastava", 840);        // through Constructor;

        System.out.println("Student 1 name : " + student1.studentName);
        System.out.println(student1.rollNo);
        student1.read();                                                                       //behaviour
        System.out.println("Student 2 name : " + s2.studentName);

    }
}
