package tw.org.iii.javatest;

import java.io.*;

public class test34 {
    public static void main(String[] args){
        try {
//            FileInputStream fin = new FileInputStream("dir1/file11");
//            InputStreamReader irs = new InputStreamReader(fin);
//            BufferedReader br = new BufferedReader(irs);
    //        BufferedReader br = new BufferedReader( new InputStreamReader( new FileInputStream("dir1/file11")));
            BufferedReader br = new BufferedReader( new FileReader("dir1/file11"));
            String line;
            while ( (line = br.readLine()) != null ) {
                System.out.println(line);
            }
            br.close();
        }catch (IOException ioe){

        }
    }
}
