package tw.org.iii.javatest;

public class test12_array {
    public static void main(String[] args){
        int[] p = new int[6];
        for (int i=0;i<100;i++){
            int point = (int)(Math.random()*6);
            //p[point>=6?point-3:point]++;
            p[point]++;
        }

        for (int v:p) {
            System.out.println(v);
        }
    }
}
