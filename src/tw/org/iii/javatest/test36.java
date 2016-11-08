package tw.org.iii.javatest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class test36 {
    public static void main(String[] args){
        student s1 = new student("brad",70,50,30);
        System.out.println( s1.name + "\n" + s1.calcScore() + "\n" + s1.calcAvg() );

        try {
            ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("dir1/test36.oo"));
            oout.writeObject(s1);
            oout.flush();
            oout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
class student implements Serializable{
    int ch, math, eng;
    String name;
    student(String name, int ch, int math, int eng){
        this.name = name;
        this.ch = ch; this.math = math; this.eng = eng;
    }
    int calcScore(){return ch+math+eng;}
    double calcAvg(){return calcScore()/3.0;}
}