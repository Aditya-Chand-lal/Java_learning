package In.file.Writer;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args) {
        String fileName = "java_course.txt";

        try(FileWriter writer = new FileWriter(fileName)){
            writer.write("Hello guys this is my text file " +
                    "allocated from Exception file\n");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number for how long you want t create a pyramid : ");
            int x = sc.nextInt();
            for (int i = 0; i < x;i++){
                for(int j = 0 ; j <= i; j++){
                    writer.write("* ");
                }
                writer.write("\n");
            }
            writer.flush();
            System.out.println("your text file is successfully created...");
        }
        catch(IOException e){
            System.out.printf("Exception occurred %s\n",e.getCause());
        }
    }
}
