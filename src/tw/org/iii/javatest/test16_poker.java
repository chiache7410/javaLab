package tw.org.iii.javatest;

public class test16_poker {
    public static void main(String[] args){
        int[] poker = new int[52];
        for(int i=0;i<poker.length;i++) {
            int temp = (int)(Math.random()*poker.length);
            //檢查機制可應dowhlie
            boolean isRepeat = false;
            for(int j=0;j<i;j++){
                if(poker[j] == temp){
                    isRepeat = true;
                    break;
                }
            }
            if(isRepeat){
                i--;
            }else {
                poker[i] = temp;
                System.out.println(poker[i]);
            }

        }
    }
}
