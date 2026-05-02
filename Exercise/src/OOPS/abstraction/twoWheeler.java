package OOPS.abstraction;

public class twoWheeler extends vehicle{

    int numberOfGears;

    public twoWheeler(int numberOfWheels, int numberOfGears) {
        super(numberOfWheels);
        this.numberOfGears = numberOfGears;
    }

    @Override
    public void startSound() {
        System.out.println("Vroooommmmmmm....");
    }

    @Override
    public void letsGo(){
        System.out.println("Chhallooooooooo....");
    }
}
