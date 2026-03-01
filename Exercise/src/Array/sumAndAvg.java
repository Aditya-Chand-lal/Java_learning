package Array;
import java.util.Scanner;

public class sumAndAvg {

    public static void main(String[] args) {
        System.out.println("\nWelcome in sum of elements and its average programme\n");
        int x = 1;
        while(x==1){

            int [] elements = new int [5];
            inputArray(elements);
            int sum = 0;
            int i = 0;
            while(i < elements.length){
                sum += elements[i];
                i++;
            }
            System.out.println("\nSum     : " + sum);
            System.out.println("Average : " + (sum/elements.length));
            System.out.print("\nWant to continue again, If yes press '1' otherwise 0 : ");
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();

        }
    }

    public static void inputArray(int [] existingArray){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(i < existingArray.length){
            System.out.print("Enter " + (i+1) + " number : ");
            existingArray[i] = sc.nextInt();
            i++;
        }
    }
}
