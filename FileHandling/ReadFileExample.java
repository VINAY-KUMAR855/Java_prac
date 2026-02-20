import java.io.*;
public class ReadFileExample {
    public static void main(String[] args) {
        // using FileReader
        try{
            FileReader reader = new FileReader("sample.txt");
            int ch;
            while((ch = reader.read())!=-1){
                System.out.print((char) ch);
            }
            reader.close();
        }catch(IOException e){
            System.out.println("Error occurred.");
        }
        System.out.println();

        // using BufferedReader
        try{
            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
        }catch(IOException e){
            System.out.println("Error occurred.");
        }
        
    }
}
