package tw.org.iii.javatest;

import java.io.FileReader;
import java.io.IOException;

public class test32 {
    public static void main(String[] args){
        try {
            FileReader reader = new FileReader("dir1/file11");
            int c;
            while ( (c = reader.read()) != -1){
                System.out.print((char)c);
            }
            reader.close();
        }catch (IOException ioe){

        }
    }
}