package in.varargs;

public class Varargs {
    public static void main(String... args) {

//      Varargs function is used when we want to take multiple inputs
//      at a time for the same variable.


        System.out.println(sum(5,4));
        System.out.println(sum(5,4,6,7));
        System.out.println(sum(5,4,7,8,4,3));
    }

    public static int sum(int... a){
        int Sum = 0;
        for (int i : a) {
           Sum += i;
        }
        return Sum;
    }
}
