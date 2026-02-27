package Methods;
import java.util.Scanner;
public class methods1 {

    public static void main(String[] args) {
        greet();
        int start = 1;
        while(start == 1){
            System.out.print("\nEnter the number : ");
            int number = input();
            int sum = digits(number);
            System.out.println("Sum of digits of integer : " + sum);
            System.out.print("\nwhould to like to continue, If 'yes' press 1 otherwise 0 : ");
            start = input();
        }

    }

    public static int input(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void greet(){
        System.out.println("\n    welcome to Sum of Digits of number ");
    }

    public static int digits(int n){
//        System.out.println("Insid method" + n);
        int sum = 0;
        while( n > 0){
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

}
