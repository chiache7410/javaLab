package tw.org.iii.javatest;

import java.io.*;

public class test38 {
    public static void main(String[] args){
        //序列化
        test383 obj = new test383();
        try {
            ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("dir1/test38.oo"));
            oout.writeObject(obj);
            oout.flush();
            oout.close();
        } catch (Exception eo) { System.out.println(eo.toString()); }
        System.out.println("----------");
        //解序列化
        try {
            ObjectInputStream oin = new ObjectInputStream(new FileInputStream("dir1/test38.oo"));
            test383 obj3 = (test383)oin.readObject();
            oin.close();
            System.out.println("OK");
        } catch (Exception ei) { System.out.println(ei.toString()); }
    }
}
class test381{
    test381(){System.out.println("test381()");}
}
class test382 extends test381{
    test382(){System.out.println("test382()");}
}
class test383 extends test382 implements Serializable{
    test384 obj;
    test383(){
        new test384();
        System.out.println("test383()");
    }
}
class test384{
}