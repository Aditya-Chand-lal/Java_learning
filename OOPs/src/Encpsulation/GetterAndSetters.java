package Encpsulation;

class GetterAndSetters {

    private String CarModel;
    private String Colour;
    private int fuelLevel;

    GetterAndSetters(String carModel, String colour, int fuelLevel) {
        CarModel = carModel;
        Colour = colour;
        this.fuelLevel = fuelLevel;
    }
    public String getCarModel(){
        return CarModel;
    }
    public String getColour(){
        return Colour;
    }
    void setColour(String colour){
        this.Colour = colour;
    }

}
