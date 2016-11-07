package tw.org.iii.javatest;


public class test29 {
    public static void main(String[] args){
        bird b1 = new bird();
        try {
            b1.setLeg(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class bird{
    private int leg;
    void setLeg(int n) throws Exception{
        if (n<0 || n>2) {
            throw new Exception();
        }
        leg = n;
    }
}