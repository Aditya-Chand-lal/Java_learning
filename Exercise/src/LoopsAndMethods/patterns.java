package LoopsAndMethods;
import java.util.Scanner;
class patterns {    public static void main(String[] args) {
        System.out.println("\n              Welcome to patterns viewer");
        int x = 1;
        while(x == 1){
            System.out.print("\nOPTIONS :-\n1.RIGHT HAND PATTERN\n2.REVERSE RIGHT HAND PATTERN\n");
            System.out.print("\nEnter your options : ");
            int  sel = input();
            System.out.print("\nEnter the number of row you want : ");
            int  num = input();
            System.out.println("\nYour Pattern : ");
            choose(sel,num);
            System.out.print("\nWant to continue, If yes press '1' otherwise 0 : ");
            x = input();
        }

    }
    public static int input(){
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        return inp;
    }
    public static void RHP(int n){
        for(int  i = 0; i < n ; i++){
            System.out.print("*");
            for (int j = 0 ; j < i ; j++){
                System.out.print(" *");
            }
            System.out.println("");
        }

    }
    public static void reverseRHP(int n){
        for (int i = n ; i > 0 ; i--){
            System.out.print("*");
            for(int j = i-1 ; j > 0 ; j--){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
    public static void choose(int sel,int num){
        switch(sel){
            case 1:
                RHP(num);
                break;
            case 2:
                reverseRHP(num);
                break;
        }
    }
}
