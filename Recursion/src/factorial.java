import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        System.out.println("Your factorial value is : " + factorials(num));
    }
    static long factorials(int num){
        if(num == 1){
            return 1;
        }
        else{
            return num * factorials(num - 1);
        }
    }
}
