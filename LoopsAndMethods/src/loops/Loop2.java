package loops;
import java.util.Scanner;
public class Loop2 {
    public static void main(String[] args) {
        System.out.println("\n    Welcome to odd sum");
        Scanner sc = new Scanner(System.in);
        System.out.print("\nTill where you want to calculate : ");
        int num = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i <= num){
            sum = sum + i;
            i += 2;
        }
        System.out.println(sum);
    }
}
