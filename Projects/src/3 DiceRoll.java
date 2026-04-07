import java.util.Scanner;
class DiceRoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diceRoll;
        int st = 1;
        while(st == 1){
            diceRoll = (int) ((Math.random() * 10) % 6)+1;
            System.out.println(diceRoll);
            System.out.print("want to continue : ");
            st = sc.nextInt();
        }

    }
}
