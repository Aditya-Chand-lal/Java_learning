package LoopsAndMethods;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n    Factorial Code");

        System.out.print("\nEnter re baba ek number jiska tere ko factorial chaiye : ");
        int n = sc.nextInt();
        int fact = 1;
        while(n >= 1){
            fact *= n;
            n--;
        }
        System.out.println("\nYelee re baba tera Factorial : " + fact);
    }
}
