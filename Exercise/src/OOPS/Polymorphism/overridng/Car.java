package OOPS.Polymorphism.overridng;

public class Car extends Vehicle{
    @Override
    public void service(){
//        super.service();
        System.out.println("I am taking my car for service");

    }
}
