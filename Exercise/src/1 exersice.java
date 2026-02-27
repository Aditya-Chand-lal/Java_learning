import java.util.Scanner;

class exersice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter N (0 to stop): ");
            int n = sc.nextInt();

            if (n == 0) {
                System.out.println("Program stopped.");
                break;
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
