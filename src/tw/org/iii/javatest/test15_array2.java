package tw.org.iii.javatest;

public class test15_array2 {
    public static void main(String[] args) {
        int[][] a = new int[3][];
        a[0] =new int[2];
        a[1] =new int[3];
        a[2] =new int[4];

        for (int[] v : a) {
            for (int x : v) {
                System.out.print(x + "   ");
            }
            System.out.println();
        }
    }
}
