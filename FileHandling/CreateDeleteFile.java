
import java.io.File;
import java.io.IOException;
public class CreateDeleteFile {
    public static void main(String[] args){
        try{
            // create file
            File myObj = new File("File1.txt");
            if (myObj.createNewFile()){
                System.out.println("File created: "+myObj.getName());
            }else{
                System.out.println("File already exist");
            }
            // delete file 
            if(myObj.delete()){
                System.out.println("File deleted.");
            }
        }catch(IOException e){
            System.out.println("An error occured.");
        }
    }
}
