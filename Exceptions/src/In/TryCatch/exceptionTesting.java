package In.TryCatch;
import java.util.Scanner;
public class exceptionTesting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to divide calculations.......\n");
        System.out.print("Enter your two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            int sum = a/b;
            System.out.println("Your answer must be  : " + sum);
        }
        catch(ArithmeticException e){
            if(e.getMessage().equals("/ by zero")){
                System.out.println("Your are dividing with zero");
            }
            else{
                throw e;
            }

        }
        finally{
            System.out.println("Thank You for using our code");
        }

    }
}
