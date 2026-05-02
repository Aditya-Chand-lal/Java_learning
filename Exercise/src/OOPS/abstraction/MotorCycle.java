package OOPS.abstraction;

public class MotorCycle {
    public static void main(String[] args) {

        twoWheeler bullet = new twoWheeler(2,4);
        
        bullet.startSound();
        System.out.println("Number of Gears : " + bullet.numberOfGears);
        System.out.println("Number of wheels : " + bullet.numberOfWheels);
    }
}
