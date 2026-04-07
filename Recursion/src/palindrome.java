import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input string : ");
        String str = sc.next();
        System.out.println("Your string is " + pelindrome(str,0,str.length()-1));
    }
    static String pelindrome(String str,int left,int right){
        if(left >= right){
            return "palindrome";
        }
        if(str.charAt(left) != str.charAt(right)){
            return "not palindrome";
        }
        return pelindrome(str,left + 1,right -1);
    }
}
