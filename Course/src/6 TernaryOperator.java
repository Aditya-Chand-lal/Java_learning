import java.util.Scanner;
class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        int greaterNumber = num1 > num2 ? num1 : num2;           //Ternary Operator
//        int greaterNumber = Math.max(num1,num2);
        System.out.println(greaterNumber + " is greatest number");
    }
}
