package classAndObjects;

public class StudentClass {
    //class Propeties
    String studentName;
    int rollNo;

    void read(){                                          //method
        System.out.println(studentName + " Reading Books");
    }

    StudentClass(String studentName, int rollNo){
        this.studentName  = studentName;
        this.rollNo = rollNo;
    }

}
