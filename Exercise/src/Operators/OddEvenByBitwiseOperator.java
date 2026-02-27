package Operators;
import java.util.Scanner;
class OddEvenByBitwiseOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n   ODD OR EVEN CODE BY BITWISE OPERATOR");
        System.out.print("\nEnter a number : ");
        int num = sc.nextInt();

        if((num & 1) == 0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");
        }
    }
}
