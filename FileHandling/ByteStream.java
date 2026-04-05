// A Stream is a flow of data.
// When working with files:File  ↔  Stream  ↔  Program . 
// Data flows through streams.
// There are two main categories:Byte Streams, Character Streams
// 1. Byte Streams
//  Works with binary data (0s and 1s) used for Images, pdf, audio
//  Important Classes: FileInputStream, FileOutputStream
// 2. Character Stream
//  Works with text data. Reading text files
//  Important Classes: FileReader, FileWriter, BufferedReader, BufferedWriter

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("sample.txt");
        int i;
        while((i = fis.read())!=-1){
            System.out.print((char) i);
        }
        fis.close();
    }
}
