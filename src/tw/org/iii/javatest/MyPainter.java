package tw.org.iii.javatest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPainter extends JFrame {
    private JButton clear, undo, redo;
    private Mypanel mypanel;

    public MyPainter() {
        super("簽名版");
        setLayout(new BorderLayout());
        JPanel top = new JPanel(new FlowLayout());
        clear = new JButton("Clear");
        undo = new JButton("Undo");
        redo = new JButton("Redo");
        top.add(clear);
        top.add(undo);
        top.add(redo);
        add(top, BorderLayout.NORTH);

        mypanel = new Mypanel();
        add(mypanel, BorderLayout.CENTER);

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mypanel.clear();
            }
        });

        undo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mypanel.undo();
            }
        });

        redo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mypanel.redo();
            }
        });

        setSize(800, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyPainter painter = new MyPainter();
    }
}
