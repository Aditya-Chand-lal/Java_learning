package OOPS.abstraction;

public abstract class vehicle implements Transport{
    int numberOfWheels;

    public vehicle(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public abstract void startSound();

}
