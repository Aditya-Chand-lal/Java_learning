package in.varargs;

public class VarargsPlacement {
    public static void main(String... args) {

//      VarargsPlacement function is used when we want to take multiple inputs
//      at a time for the same variable.But in only Varargs there is a catch, it can
//      also run without any parameter so we have to give two parameter by own
//      so that it is mandatory to give to parameter.and the varargs function(...)
//      must be placed at last.


        System.out.println(sum(5,4));
        System.out.println(sum(5,4,6,7));
        System.out.println(sum(5,4,7,8,4,3));
    }

    public static int sum(int first,int second,int... a){
        int Sum = first + second;
        for (int i : a) {
            Sum += i;
        }
        return Sum;
    }
}
