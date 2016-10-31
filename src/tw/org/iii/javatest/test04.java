package tw.org.iii.javatest;

import javax.swing.*;
import java.util.Scanner;

public class test04 {
    public static void main(String[] args){
        /*int intScore = (int)(Math.random() * 101);*/
        /*Scanner scanner = new Scanner(System.in);
        int intScore = scanner.nextInt();*/
        String strScore = JOptionPane.showInputDialog("輸入成績");
        int intScore = Integer.parseInt(strScore);
        System.out.println(intScore);
        char Score = 'X';
        if(intScore <= 100) {Score = 'A';}
        if(intScore <= 89) {Score = 'B';}
        if(intScore <= 79) {Score = 'C';}
        if(intScore <= 69) {Score = 'D';}
        if(intScore <= 59) {Score = 'E';}
        JOptionPane.showMessageDialog(null, Score);
        //System.out.println(Score);
    }
}