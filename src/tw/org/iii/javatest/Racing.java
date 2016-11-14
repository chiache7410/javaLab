package tw.org.iii.javatest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Racing extends JFrame{
    private JButton go;
    private JLabel[] lanes = new JLabel[8];
    private car[] cars = new car[8];
    private int rank;
    public Racing(){
        super("賽馬程式");
        setLayout(new GridLayout(9,1));
        go = new JButton("GO!");
        add(go);
        for (int i = 0;i<lanes.length;i++) {
            lanes[i] = new JLabel((i+1) + ":");
            add(lanes[i]);
        }
        go.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                go();
            }
        });
        setSize(800,480);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    private void go(){
        rank = 0;
        for (int i=0;i<cars.length;i++){
            cars[i] = new car(i);
        }
        for (car car : cars){
            car.start();
        }
    }
    private class car extends Thread {
        private int whichLane;
        car(int i) {whichLane = i;}
        @Override
        public void run() {
            for (int i=0;i<100;i++) {
                lanes[whichLane].setText(lanes[whichLane].getText() + ">");
                if (i==99){
                    lanes[whichLane].setText(lanes[whichLane].getText() + " " + ++rank);
                    killCars();
                    break;
                }
                try {
                    Thread.sleep(50 + (int)(Math.random()*200) );
                }catch (InterruptedException e) {
                    break;
                }
            }
        }
    }
    private void killCars(){
        for (car car : cars) {
            car.interrupt();
        }
    }
    public static void main(String[] args){
        new Racing();
    }
}