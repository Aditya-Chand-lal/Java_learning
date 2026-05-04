package In.file.Reader;

import java.io.FileReader;
import java.io.IOException;

public class fileReader {
    public static void main(String[] args) {
        String fileName = "java_course.txt";

        try(FileReader reader = new FileReader(fileName)){
            int read = 0;
            do{
                read = reader.read();
                System.out.print((char)read);
            }while(read != -1);
            System.out.println("\n");
        }catch(IOException e ){
            System.out.printf("Exception occurred %s",e.getMessage());
        }
    }
}
