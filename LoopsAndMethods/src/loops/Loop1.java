package loops;

import java.util.Scanner;
public class Loop1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n     Welcome to Maths table printer ");
        System.out.print("\nWhich number's table you want to find : ");
        int num = sc.nextInt();
        System.out.println("\nYour " + num +"'s table is : \n");
        int table = 1;
        while(table <= 10){
            System.out.println(num + " x " +  table + " = " + (num*table));
            table++;

        }
    }
}
