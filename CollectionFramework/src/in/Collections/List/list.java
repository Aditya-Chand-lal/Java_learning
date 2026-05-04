package in.Collections.List;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List str = new ArrayList();
        str.add("Aditya");
        str.add(" chand");
        str.add(" lal");
        str.add(3,54);   //List can have any datatype but we should only have to add
                                       // same type of data type so we use <> function and inside it
                                       // we put specific datatype.
        str.add(1," Jaiswal");
        for (int i = 0; i < str.size(); i++) {
            System.out.print(str.get(i));
        }
        if(str.contains(" Jaiswal")){
            System.out.println(str.indexOf(" Jaiswal"));
        }
        str.remove(1);
        System.out.println("\n");
        for (int i = 0; i < str.size(); i++) {
            System.out.print(str.get(i));
        }

    }
}
