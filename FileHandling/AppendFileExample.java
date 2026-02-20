import java.io.*;
public class AppendFileExample {
    public static void main(String[] args){
        try{
            // Second parameter true -> append mode.
            FileWriter writer = new FileWriter("sample.txt",true);
            writer.append("File appending.");
            writer.close();
            System.out.println("Successfully Apeended.");
        }catch(IOException e){
            System.out.println("Error occurred.");
        }
    }
}
