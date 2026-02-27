package If_else;

import java.util.Scanner;
class If_else {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age  = sc.nextInt();

        if(age >= 18){
            System.out.println("\nThe candidate is eligble to Vote");
        }

        else{
            System.out.println("\nUnderage!!!\nNot eligble to vote");
        }
    }
}
