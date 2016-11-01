package tw.org.iii.javatest;

public class test16_poker {
    public static void main(String[] args){
        //洗牌
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
                System.out.print(poker[i] + "  ");
            }
        }
        System.out.println();
        System.out.println("------------------------------");
        //發牌
        int[][] players = new int[4][13];
        for(int i=0;i<poker.length;i++){
            players[i%4][i/4] = poker[i];
        }
        //攤牌
        for(int[] player:players){
            String[] suits = {"黑桃","紅心","方塊","梅花"};
            String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
            for(int card:player){
                System.out.print(suits[card/13] + values[card%13] + "\t");
            }
            System.out.println();
        }
    }
}
