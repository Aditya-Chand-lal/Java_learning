package oneD_Array;
import java.util.Scanner;
public class traverseArray {
    public static void main(String[] args) {
        int [] studentCount = new int [5];
        inputArray(studentCount);
        traversal(studentCount);
    }

    public static void traversal(int [] studentCount){
        int i = 0;
        while(i < studentCount.length){
            System.out.println(studentCount[i]);
            i++;
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
