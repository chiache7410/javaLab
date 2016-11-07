package tw.org.iii.javatest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test27 extends JFrame implements ActionListener{
    private JButton newFile, openFile, saveFile, saveAsFile, exit;
    private JTextArea editor;
    public test27(){
        super("視窗練習");
        setLayout(new BorderLayout());

        newFile = new JButton("新增");
        openFile = new JButton("開啟");
        saveFile = new JButton("存檔");
        saveAsFile = new JButton("另存");
        exit = new JButton("離開");

        newFile.addActionListener(new MyListener());
        newFile.addActionListener(this);
        newFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("C");
            }
        });

        JPanel top = new JPanel(new FlowLayout());
        top.add(newFile); top.add(openFile); top.add(saveFile); top.add(saveAsFile); top.add(exit);
        add(top,BorderLayout.NORTH);
        editor = new JTextArea();
        add(editor,BorderLayout.CENTER);

        setSize(640,480);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new test27();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("B");
    }
}
class MyListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("A");
    }
}