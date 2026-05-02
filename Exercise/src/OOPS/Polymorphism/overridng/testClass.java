package OOPS.Polymorphism.overridng;

public class testClass {
    public static void main(String[] args) {
        Car c1 = new Car();
        Vehicle v1 = new Vehicle();
        v1.service();
        c1.service();
    }
}
