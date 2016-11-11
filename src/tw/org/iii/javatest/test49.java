package tw.org.iii.javatest;

import java.util.HashSet;
import java.util.TreeSet;

public class test49 {
    public static void main(String[] args){
        //HashSet set = new HashSet();
        TreeSet set = new TreeSet();
        while (set.size()<6){
            set.add( (int)(Math.random()*49+1) );
        }
        System.out.println(set.toString());
    }
}