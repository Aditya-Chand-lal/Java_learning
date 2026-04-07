import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Your fibonacci number is : " +  fibon(num));

    }
    static long fibon(int num){
        if(num == 1 || num ==2){
            return 1;
        }
        else{
            return fibon(num - 1) + fibon(num - 2);
        }
    }

}
