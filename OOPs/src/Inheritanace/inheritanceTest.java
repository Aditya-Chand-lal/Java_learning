package Inheritanace;

public class inheritanceTest {
    public static void main(String[] args) {
        vehicle ob = new vehicle();
        twoWheeler obj = new twoWheeler();
        motorCycle obj2 = new motorCycle(50);
        ob.travel();
        obj.travel();
        obj.balance();
        System.out.println(obj2.noOfTires);
        obj2.maxSpeed = 60;
        System.out.println(obj2.maxSpeed);

    }
}
