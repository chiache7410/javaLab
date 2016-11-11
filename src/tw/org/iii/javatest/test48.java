package tw.org.iii.javatest;

import java.io.File;

public class test48 {
    public static void main(String[] args){
        try {
            MultipartUtility mu = new MultipartUtility("https://lab-chiache7410.c9users.io/test/test02.php","utf-8");
            mu.addFilePart("upload", new File("dir2/urldownloud.jpg"));
            mu.finish();
            System.out.println("OK");
        }catch (Exception e){

        }
    }
}
