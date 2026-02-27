package Methods;
import java.util.Scanner;
public class methods3 {
    public static void main(String[] args) {
        greet();
        int start = 1;
        while(start == 1){
            System.out.print("\nEnter a number to check that, it is prime or not : ");
            int num = input();

            isprime(num);

            System.out.print("\nYou want to reverse more integers, If 'yes' press '1' otherwise '0' : ");
            start = input();

        }
        System.out.println("\n                       Thank you!\n                    Have a great day");


    }
    public static void greet(){
        System.out.println("\n           welcome to Prime number Code ");
    }

    public static int input(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static void isprime(int n){

        int temp = n - 1;
        while(temp > 1){
            if(n % temp == 0){
                System.out.println("\nThe number is not prime ");
                break;
            }
            else if (temp != 2){
                temp--;
            }
            else{
                System.out.println("\nThe number is prime");
                break;
            }

        }

    }

}
