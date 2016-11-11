package tw.org.iii.javatest;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class test49 {
    public static void main(String[] args){
        //HashSet set = new HashSet();
        TreeSet set = new TreeSet();
        while (set.size()<6){
            set.add( (int)(Math.random()*49+1) );
        }
        System.out.println(set.toString());
        //------------------------------
        System.out.println("------------------------------");
        LinkedList list = new LinkedList();
        list.add("bbb");
        list.add(123);
        list.add(1,true);
        list.add(456);
        list.add("aaa");
        System.out.println(list.toString());
        //------------------------------
        System.out.println("------------------------------");
        TreeSet<Integer> set2 = new TreeSet();
        set2.add(12);
        set2.add(34);    //xxx   "Brad"
    }
}