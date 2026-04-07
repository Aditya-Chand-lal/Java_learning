import java.util.Scanner;
class RotateArray {
    public static int[] rightRotation(int arr[],int k){

        int rot = k % arr.length;
        reverse(arr,0,arr.length - (rot + 1));
        reverse(arr,0,arr.length - 1);
        return arr;
    }
    public static int[] reverse(int []arr,int st, int end){

        int i = st;
        int j = end;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
       return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.print("What is the length of your array : ");
            int len = sc.nextInt();

            int[] nums = new int[len];
//        nums = new int[]{1, 2, 3, 4, 5};
            for (int i = 0; i < len; i++) {
                System.out.print("Enter " + (i + 1) + " number : ");
                nums[i] = sc.nextInt();
            }
            System.out.print("Enter target value : ");
            int k = sc.nextInt();

            rightRotation(nums, k);
            System.out.print("Your rotated array will look like this : ");
            for (int i : nums) {
                System.out.print(i + " ");
            }
            System.out.print("\nWanna run again then press 1, If not then 0 : ");
            int x = sc.nextInt();
            run = (x == 1) ? true : false;
        }
    }
}
