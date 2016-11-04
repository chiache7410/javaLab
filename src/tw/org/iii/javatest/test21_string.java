package tw.org.iii.javatest;
public class test21_string {
    public static void main(String[] args){
        String s1 = "test";
        String s2 = new String();
        byte[] b1 = {97,98,99,100};
        String s3 = new String(b1);
        String s4 = new String(b1,1,2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println("----------");
        //----------
        String s11 = "test";
        String s12 = "test";
        String s13 = new String("test");
        String s14 = new String("test");
        System.out.println(s11 == s12);         //true
        System.out.println(s11 == s13);         //false
        System.out.println(s13 == s14);         //false
        System.out.println(s11.equals(s13));    //true
        System.out.println("----------");
        //----------
        Pen p1 = new Pen();
        Pen p2 = new Pen();
        System.out.println(p1.equals(p2));      //繼承Obj的equals(Obj的equals >> "==")
        System.out.println("----------");
        //----------
        String s5 = s1;         //指標
        //----------
        System.out.println(s5.concat("III"));
        System.out.println(s5);
        System.out.println("----------");
        //----------
        System.out.println(p1);     //印出指標位指值
    }
}
class Pen {
//    @Override
//    public String toString() {
//        return super.toString();
//    }
}