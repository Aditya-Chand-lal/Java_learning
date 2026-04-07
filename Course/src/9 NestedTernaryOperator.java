import java.util.Scanner;
class nestedTernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score : ");
        int x = sc.nextInt();

        String category = x > 80 ? "High" : (x < 50? "low":"Moderate");    // Direct Nested ternary operation;
//        String category = x > 80 ? "High" : "Moderate";                  // Indirect Nested ternary operation;
//        String secondCat = x < 50? "low":category;
        System.out.print(category);

    }
}
