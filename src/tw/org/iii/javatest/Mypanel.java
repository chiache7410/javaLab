package tw.org.iii.javatest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//import java.awt.event.MouseMotionListener;
import java.util.HashMap;
import java.util.LinkedList;

public class Mypanel extends JPanel {
    private LinkedList<LinkedList<HashMap<String,Integer>>> lines = null;
    private LinkedList<LinkedList<HashMap<String,Integer>>> recycle = null;
    public Mypanel() {
        MyMouseListener myMouseListener = new MyMouseListener();
        addMouseMotionListener(myMouseListener);
        addMouseListener(myMouseListener);
        lines = new LinkedList<>();
        recycle = new LinkedList<>();
        System.out.println("Mypanel()");
    }
    private class MyMouseListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            LinkedList<HashMap<String,Integer>> line = new LinkedList<>();
            int x = e.getX();
            int y = e.getY();
            HashMap<String,Integer> point = new HashMap<>();
            point.put("x",x);
            point.put("y",y);
            line.add(point);
            lines.add(line);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            HashMap<String,Integer> point = new HashMap<>();
            point.put("x",x);
            point.put("y",y);
            lines.getLast().add(point);
            repaint();
            //System.out.println(x + "x" + y);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("paint()");
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        setBackground(Color.BLACK);
        g2d.setColor(Color.YELLOW);
        g2d.setStroke(new BasicStroke(2));
        //g2d.drawOval(100,100,40,40);
        //g2d.fillOval(200,200,40,40);
        //g2d.drawLine(0,0,300,300);
        for (LinkedList<HashMap<String,Integer>> line : lines) {
            for (int i=1; i<line.size(); i++) {
                HashMap<String,Integer> p0 = line.get(i-1);
                HashMap<String,Integer> p1 = line.get(i);
                g2d.drawLine(p0.get("x"),p0.get("y"),p1.get("x"),p1.get("y"));
            }
        }
        System.out.println("paintComponent()");
    }

    void clear(){
        lines.clear();
        repaint();
    }
    void undo(){
        if (lines.size()>0) {
            recycle.push(lines.remove());
            repaint();
        }
    }
    void redo(){
        if (recycle.size()>0) {
            lines.add(recycle.pop());
            repaint();
        }
    }
}
