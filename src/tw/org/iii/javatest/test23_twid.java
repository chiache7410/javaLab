package tw.org.iii.javatest;

public class test23_twid {
    public static void main(String[] args){
        TWID id1 = new TWID("B120863158");
        if( id1.isCheckOK() ){
            System.out.println("OK");
        }
        else {
            System.out.println("xxx");
        }
    }
}
