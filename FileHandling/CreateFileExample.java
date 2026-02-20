
import java.io.*;
public class CreateFileExample {
    public static void main(String[] args){
        try{
            File file = new File("sample.txt");
            // createNewFile() return true-> file created, false -> already exists
            if(file.createNewFile()){
                System.out.println("File create: "+file.getName());
            }
            else{
                System.out.println("File already exists.");
            }
        } catch(IOException e){
            System.out.println("An error Occurred.");
        }
    }
}
