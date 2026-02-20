
import java.io.*;
public class WriteFileExample {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("File reading.");
            writer.close();
            System.out.println("Successfully written.");
        } catch (IOException e){
            System.out.println("Error occurred.");
        }
    }
}
