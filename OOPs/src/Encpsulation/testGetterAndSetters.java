package Encpsulation;

public class testGetterAndSetters {
    public static void main(String[] args) {
        GetterAndSetters car1 = new GetterAndSetters("Swift",
                "black",6);
        System.out.println(car1.getColour());

        car1.setColour("Red");
        System.out.println(car1.getColour());
    }
}
