package Maths;

import java.util.Scanner;
class randomGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n          Welcome to guessing game");
        int count = 0;
        boolean st = true;
        while(st){
            int random = (int)(Math.random() * 10);
            System.out.print("\nEnter your guess value between (0 - 9) : ");
            int x = sc.nextInt();
            count++;
            if(x == random){
                System.out.println("hurrreeee!!!\n\nYou won the Game");
                st = false;
            }
            else{
                System.out.println("\nWrong guess!!!\n");
                System.out.println("Random number : "+random);
            }
        }
        System.out.println("\n          You take " + count + " chance.");
    }
}
