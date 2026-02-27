import java.util.Scanner;
class UnaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("\n\n       Arithematic Operator \n");
//        System.out.print("Enter the first value : ");
//        int a = sc.nextInt();
//        System.out.print("Enter the first value : ");
//        int b = sc.nextInt();
//        System.out.println();
//        System.out.println("A + B : " + (a+b));
//        System.out.println("A - B : " + (a-b));
//        System.out.println("A * B : " + (a*b));
//        System.out.println("A / B : " + (a/b));
//        System.out.println("A % B : " + (a%b));
//        System.out.println();
//        System.out.println("      Order of Operator \n");
//        System.out.print("Enter Celcius value  : ");
//        int c = sc.nextInt();
//        System.out.println("Ferhanite value : " + ((c*9/5)+32));
//        System.out.println();
//        System.out.println("      unary Operator \n");
        System.out.print("Enter a value  : ");
        int d = sc.nextInt();
        System.out.println("post++ : " + (d++));
        System.out.println("post-- : " + (d--));
        System.out.println("++post : " + (++d));
        System.out.println("--post : " + (--d));

    }
}
