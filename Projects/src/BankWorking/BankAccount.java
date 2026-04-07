package BankWorking;

public class BankAccount {
    final private long accountNumber;
    public String accountHolderName;
    private int balance;

    public BankAccount(long accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0;

    }

    @Override
    public String toString() {
        return "\nBank Account details :\n" +
                "Your Account Number = " + accountNumber +
                "\nAccount Holder Name = " + accountHolderName ;

    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void checkBalance(){
        System.out.printf("\nYour current balance is : %d\n",this.balance);

    }

    public void deposit(long accountNumber,int balance){
        if(this.accountNumber == accountNumber){
            this.balance += balance;
        }
        else{
            System.out.println("\nPlease enter your correct account number.");
        }

    }

    public void withdraw(int balance, long accountNumber,String accountHolderName){
        if(this.accountNumber == accountNumber && this.accountHolderName.equals(accountHolderName)){
            if(this.balance >= balance){
                this.balance -= balance;
            }
            else{
                System.out.println("\nNot enough balance");
                System.out.printf("You have %d balance in your account",this.balance);
            }
        }
        else{
            System.out.println("\nPlease enter your correct account number.");
        }
    }

}
