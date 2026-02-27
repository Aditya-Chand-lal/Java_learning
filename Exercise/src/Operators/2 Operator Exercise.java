package Operators;

import java.util.Scanner;
class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n   \"Swap Exercise\"\n");
        System.out.print("Enter the value of a = ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b = ");
        int b = sc.nextInt();
        int c = b;
        b = a;
        a = c;
        System.out.println("\nAfter Swap");
        System.out.println("a = " + a + "\nb = " + b);
    }
}
