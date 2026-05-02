package OOPS.Polymorphism.overLoading;

public class calculatorTest {
    public static void main(String[] args) {
        calculator c1 = new calculator();

        System.out.println(c1.add(2,3));
        System.out.println(c1.add(2,3,4));
        System.out.println(c1.add(2.3,3.0));
    }
}
