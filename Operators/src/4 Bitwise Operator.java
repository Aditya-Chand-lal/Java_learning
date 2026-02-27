import java.util.Scanner;
class BitwiseOperator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n    BITWISE OPERATOR   \n");
        System.out.print("Enter First number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second number : ");
        int b = sc.nextInt();
        System.out.print("Enter Third number : ");
        int c = sc.nextInt();

        System.out.println("\nAND OPERATOR : " + (a&b));
        System.out.println("OR OPERATOR : " + (a|b));
        System.out.println("XOR OPERATOR : " + (a^b));
        System.out.println("NOT OPERATOR : " + (~c));
        System.out.println("LEFT SHIFT OPERATOR : " + (c<<1));
        System.out.println("RIGTH SHIFT OPERATOR : " + (c>>2));
    }
}
