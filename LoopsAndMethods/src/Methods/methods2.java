package Methods;
import java.util.Scanner;
public class methods2 {
    public static void main(String[] args) {
        greet();
        int start = 1;
        while(start == 1){
            System.out.print("\nEnter a integer whose reverse you want to find : ");
            int num = input();

            System.out.println("\nYour Reverse number : " + reverse(num));
            System.out.print("\nYou want to reverse more integers, If 'yes' press '1' otherwise '0' : ");
            start = input();
        }
        System.out.println("\n                       Thank you!\n                    Have a great day");

    }

    public static void greet(){
        System.out.println("\n              welcome to Reverse Integer Code ");
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
