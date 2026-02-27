package LoopsAndMethods;
import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args) {
        greet();
        int start = 1;
        while(start == 1){
            System.out.print("\nEnter a number whose Armstrong you want to find : ");
            int num = input();

//            if(num == reverse(num)){
//                System.out.println("\nYour number is Palindrome");
//            }
//            else{
//                System.out.println("\nYour number is not a Palindrome");
//            }
            int count = digits(num);
            int value = armstrong(num , count);
            if(num == value){
                System.out.println("\nYour number is Armstrong");
            }
            else{
                System.out.println("\nIt is not an Armstrong number");
            }

            System.out.print("\nYou want to check more numbers, If 'yes' press '1' otherwise '0' : ");
            start = input();
        }

    }

    public static void greet(){
        System.out.println("\n              welcome to Armstrong Checker Code ");
    }

    public static int input(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static int digits(int num){
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }

    public static int armstrong(int n,int c){
        int sum = 0;
        int rem;
        while(n > 0){
            int rep = c;
            rem = n % 10;
            int calc = rem;
            while(rep > 1){
                rem = calc * rem ;
                rep--;
            }
            sum += rem;
            n = n/10;
        }
        return sum;
    }
}

