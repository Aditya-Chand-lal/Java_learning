package Inheritanace;

public class twoWheeler extends vehicle{

    protected twoWheeler(){
        noOfTires = 2;
    }
    protected void balance(){
        System.out.println("I can balance in two tires.");
    }

}
