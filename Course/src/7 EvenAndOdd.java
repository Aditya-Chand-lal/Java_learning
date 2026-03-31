import java.util.Scanner;
class evenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int x = sc.nextInt();

        String determine = (x % 2) == 0 ? "even" : "odd";
        System.out.println("Number is " + determine);
    }
}
