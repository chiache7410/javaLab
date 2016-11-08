package tw.org.iii.javatest;

import java.io.*;

public class test37 {
    public static void main(String[] args){
        try {
            ObjectInputStream oin = new ObjectInputStream(new FileInputStream("dir1/test36.oo"));
            Object obj = oin.readObject();
            student s2 = (student)obj;
            System.out.println( s2.name + "\n" + s2.calcScore() + "\n" + s2.calcAvg() );
            oin.close();
        }catch(ClassNotFoundException e) {
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
