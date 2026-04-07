class FinalKeyword {
    int houseNumber;
    final String address;

    public FinalKeyword(int houseNumber,String address){
        this.houseNumber = houseNumber;
        this.address = address;
    }

    @Override
    public String toString() {
        return "FinalKeyword{" +
                "houseNumber=" + houseNumber +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        FinalKeyword street = new FinalKeyword(211,"Alpha II");
        System.out.println(street);
        FinalKeyword street2 = new FinalKeyword(211,"Alpha I");
        System.out.println(street2);
    }
}
