package LoopsAndMethods;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        greet();
        int start = 1;
        while(start == 1){
            System.out.print("\nEnter a number whose palindrome you want to find : ");
            int num = input();

            if(num == reverse(num)){
                System.out.println("\nYour number is Palindrome");
            }
            else{
                System.out.println("\nYour number is not a Palindrome");
            }
            System.out.print("\nYou want to check more numbers, If 'yes' press '1' otherwise '0' : ");
            start = input();
        }

    }

    public static void greet(){
        System.out.println("\n              welcome to Palindrome Checker Code ");
    }

    public static int input(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int reverse(int n){
        int rev = 0;
        int rem;
        while(n > 0){
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }
}
