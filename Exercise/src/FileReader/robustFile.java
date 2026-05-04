package FileReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class robustFile {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name which yo want to read : ");
        String fileName = sc.next();

        try(FileReader reader = new FileReader(fileName)){
            int read;

            while((read = reader.read()) != -1){
                System.out.print((char)read);
            }

        }
        catch(FileNotFoundException e){
            System.out.printf("%s not found,Enter a correct file name...",fileName);
        }
        catch(IOException e ){
            System.out.println("Exception occurred...");
        }
    }
}
