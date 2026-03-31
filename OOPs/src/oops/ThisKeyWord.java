package oops;

public class ThisKeyWord {
    String name;
    int age;
    String gender;

    public ThisKeyWord(){

    }

    public ThisKeyWord(String name,int age){
        this();                          //This keyword for calling different constructor.
        this.name = name;                //This keyword for assigning argument variable for same as instance variable.
        this.age = age;
    }
}

