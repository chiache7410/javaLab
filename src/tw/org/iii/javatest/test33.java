package tw.org.iii.javatest;

import java.io.FileOutputStream;
import java.io.IOException;

public class test33 {
    public static void main(String[] args){
        try {
            FileOutputStream fout = new FileOutputStream("dir1/file3", true);
            fout.write("Hello, 中文\n".getBytes());
            fout.flush();
            fout.close();
        }catch (IOException ioe){

        }

    }
}
