package Switch;
import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {

        System.out.println("\n            WELCOME TO MY CALCULATOR\n");
        int x = 1;
        int y = 1;
        int a = 0;
        int b = 0;
        while(x == 1){
            if (y == 1){
                System.out.print("\nEnter first number : ");
                a = inputInt();
                System.out.print("\nEnter second number : ");
                b = inputInt();
                int num = operationSel();
                switchOperation(num,a,b);
            }
            else if(y == 0){
                int num = operationSel();
                switchOperation(num,a,b);
            }

            System.out.print("\nWANT TO CONTINUE, IF YES PRESS '1' OTHERWISE '0' : ");
            x = inputInt();
            if(x == 1){
                System.out.print("\nWANT TO CHANGE INPUTS, IF YES PRESS '1' OTHERWISE '0' : ");
                y = inputInt();
            }
            else{
                System.out.println("\n                 THANK YOU!!!");
                return;
            }

        }

    }
    public static int operationSel(){
        System.out.println("\nOPERATIONS :\n1.SUM\n2.SUBTRACT\n3.MULTIPLY\n4.DIVISION\n5.MODULO\n6.SHOW INPUTS ");
        System.out.print("\nWHICH OPERATION DO YOU WANT TO PERFORM : ");
        return inputInt();
    }

    public static int inputInt(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static String inputString(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static void switchOperation(int n,int a,int b){
        int calc = 0;
        switch(n){
            case 1 :
               calc +=  a + b;
               System.out.println("\nYour Answer : " + calc);
               break;
            case 2 :
               calc +=  a - b;
               System.out.println("\nYour Answer : " + calc);
               break;
            case 3 :
               calc +=  a * b;
               System.out.println("\nYour Answer : " + calc);
               break;
            case 4 :
               calc +=  a / b;
               System.out.println("\nYour Answer : " + calc);
               break;
            case 5 :
               calc +=  a % b;
               System.out.println("\nYour Answer : " + calc);
               break;
            case 6 :
               System.out.println("\nFIRST INPUT : " + a);
               System.out.println("SECOND INPUT : " + b);
               break;

            default :
                System.out.println("Choose a correct value!!");
        }

    }
}
