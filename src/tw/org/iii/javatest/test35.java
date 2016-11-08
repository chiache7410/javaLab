package tw.org.iii.javatest;

public class test35 {
    public static void main(String[] args){
        test353 obj1 = new test353();
    }
}
class test351{
    int a;
    static {System.out.println("test351:static{...}");}
    {
        System.out.println("test351:{...}:a=" + a);
    }
    test351(){System.out.println("test351()");}
    void m1(){System.out.println("test351:m1()");}
    static void m2(){System.out.println("test351:m2()");}
}
class test352 extends test351{
    static {System.out.println("test352:static{...}");}
    {
        System.out.println("test352:{...}");
    }
    test352(){System.out.println("test352()");}
    void m1(){System.out.println("test352:m1()");}
    static void m2(){System.out.println("test352:m2()");}
}
class test353 extends test352{
    static {System.out.println("test353:static{...}");}
    {
        System.out.println("test353:{...}");
    }
    test353(){System.out.println("test353()");}
    void m1(){System.out.println("test353:m1()");}
    static void m2(){System.out.println("test353:m2()");}
}