import java.util.Scanner;
class MonthPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your months value from 1 - 12 : ");
        int x = sc.nextInt();
        System.out.println("Your month in letter is : " + switchPrint(x));

    }
    public static String switchPrint(int month){
        return switch (month){
            case 1 -> "JANUARY";
            case 2 -> "FEBRUARY";
            case 3 -> "MARCH";
            case 4 -> "APRIL";
            case 5 -> "MAY";
            case 6 -> "JUNE";
            case 7 -> "JULY";
            case 8 -> "AUGUST";
            case 9 -> "SEPTEMBER";
            case 10 -> "OCTOBER";
            case 11 -> "NOVEMBER";
            case 12 -> "DECEMBER";
            default -> "Invalid input!!!";
        };
    }
}
