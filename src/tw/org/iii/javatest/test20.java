package tw.org.iii.javatest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test20 extends JFrame{
    private JButton open, save, exit;
    public test20(){
        super("視窗titie");
        setSize(640,480);
        setLayout(new FlowLayout());
        open = new JButton("開啟");
        save = new JButton("儲存");
        exit = new JButton("離開");
        add(open); add(save); add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);
    }
    public static void main(String[] args) {
        test20 t1 = new test20();
    }
}
