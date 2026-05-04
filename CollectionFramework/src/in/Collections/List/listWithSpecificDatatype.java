package in.Collections.List;

import java.util.ArrayList;

public class listWithSpecificDatatype {
    public static void main(String[] args) {
        ArrayList<String>  str = new ArrayList<>();
        str.add("Aditya");
        str.add("Chand");
        str.add("Lal");
//        str.add(70);

        for (int i = 0; i < str.size(); i++) {
            System.out.print(str.get(i));
        }

    }
}
