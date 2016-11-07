package tw.org.iii.javatest;
import java.io.File;

public class test30 {
    public static void main(String[] args){
        File f1 = new File("./dir2");
        if (f1.exists()){
            System.out.println(f1.getAbsolutePath());
        }
        else {
            if(f1.mkdir()) System.out.println("MK f1");
        }
        File dir5 = new File("dir1/dir2/dir3/dir4/dir5");
        if(dir5.exists()){
            System.out.println(dir5.getAbsolutePath());
        }
        else {
            if(dir5.mkdirs()) System.out.println("MK dir5");
        }
        File dir1 = new File("dir1");
        if(dir1.isDirectory()){
            File[] sub = dir1.listFiles();
            for (File sFile : sub){
                System.out.println(sFile);
            }
        }
        File[] roots = File.listRoots();
        for(File root:roots){
            System.out.println(root);
        }
    }
}