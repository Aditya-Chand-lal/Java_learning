package oneD_Array;

public class firstArray {
    public static void main(String[] args) {
        int [] elements = {1,2,3,4,5} ;
        int [] newElements = new int[5];
        newElements[0] = 1;
        newElements[1] = 2;
        newElements[2] = 3;
        newElements[3] = 4;
        newElements[4] = 5;
        int i = 0;
        while(i < 5){
            System.out.println("First array value  : " + elements[i]);
            System.out.println("Second array value : " + newElements[i]);
            i++;
        }
    }
}
