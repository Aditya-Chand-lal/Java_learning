package oops;
import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Gender : ");
        String gender = sc.next();
        ThisKeyWord principle = new ThisKeyWord();
        principle.gender = gender;
        principle.name = "Ansh Raj";
        principle.age = 38;

        ThisKeyWord teacher = new ThisKeyWord("Yash Singh", 22);

        System.out.println(principle.name);

        System.out.println(teacher.name + " " + teacher.age);

        System.out.println("School Name  : "+StaticKeyword.schoolName);
        System.out.println("Number of persons : " + StaticKeyword.countPerson);


    }

}
