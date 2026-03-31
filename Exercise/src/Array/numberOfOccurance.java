package Array;
import java.util.Scanner;
import Array.sumAndAvg;
public class numberOfOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of elements you want in your array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        sumAndAvg obj = new sumAndAvg();
        obj.inputArray(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
