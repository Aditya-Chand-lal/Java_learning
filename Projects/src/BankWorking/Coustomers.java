package BankWorking;
import java.util.Scanner;
public class Coustomers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n                 Welcome to CHAND LAL's Bank\n");

        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        BankAccount c1 = new BankAccount((int)((Math.random()) * 10000),name);
        System.out.println(c1);

        int i = 1;
        while(i == 1){
            System.out.print("\nWhat you want from us : \n1.Check balance\n2.Deposit\n3.Withdraw :\n4.Close the programme\n--> ");
            int sel = sc.nextInt();

            if(sel == 1){
                c1.checkBalance();
            }
            else if (sel == 2) {
                System.out.print("\nEnter your account number : ");
                long accNo = sc.nextLong();
                if(accNo == c1.getAccountNumber()){
                    System.out.print("\nEnter the amount : ");
                    int bal = sc.nextInt();
                    c1.deposit(accNo,bal);
                }
                else{
                    System.out.println("\nEntered wrong account number!!!");
                }
            }
            else if (sel == 3) {
                System.out.print("\nEnter your account number : ");
                long accNo = sc.nextLong();
                if(accNo == c1.getAccountNumber()){
                    System.out.print("\nEnter the amount : ");
                    int bal = sc.nextInt();
                    c1.withdraw(bal,accNo,c1.accountHolderName);
                }
                else{
                    System.out.println("\nEntered wrong account number!!!");
                }
            }
            else if(sel == 4){
                i = 0;
            }
            else{
                System.out.println("\nChoose correct option !!!");
            }

        }

        System.out.println("\n       Thank you for using our bank");
    }
}