package tw.org.iii.javatest;
public class test25 {
    public static void main(String[] args){
        test251 obj1 = new test251();
        test252 obj2 = new test253();
        test252 obj3 = new test254();
        obj2.m2();
        obj3.m2();
    }
}
class test251{
    int a;
    void m1(){}
    void m2(){}
}
abstract class test252{
    int a;
    void m1(){}
    abstract void m2();
}
class test253 extends test252{
    void m2(){System.out.println("test253");}
}
class test254 extends test252{
    void m2(){System.out.println("test254");}
}