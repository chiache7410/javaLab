package tw.org.iii.javatest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class test27 extends JFrame implements ActionListener{
    private JButton newFile, openFile, saveFile, saveAsFile, exit;
    private JTextArea editor;
    private File editFile;
    public test27(){
        super("視窗練習");
        setLayout(new BorderLayout());

        newFile = new JButton("新增");
        openFile = new JButton("開啟");
        saveFile = new JButton("存檔");
        saveAsFile = new JButton("另存");
        exit = new JButton("離開");
//----------Listener start----------
        //newFile.addActionListener(new MyListener());
        //newFile.addActionListener(this);
        newFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("C");
                newFile();
            }
        });
        openFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openFile();
            }
        });
        saveFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveFile();
            }
        });
        saveAsFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                savaAsFile();
            }
        });
  //----------Listener end----------
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
    //產生新檔
    private void newFile(){
        editFile = null;
        editor.setText("");
    }
    //開啟檔案
    private void openFile(){
        JFileChooser jfc = new JFileChooser();
        if(jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION ){
            editFile = jfc.getSelectedFile();
            System.out.println(editFile.getAbsolutePath());
        }
    }

    private void loadFile(){
        StringBuffer sb = new StringBuffer();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(editFile));
            String line;
            while ( (line = br.readLine()) != null){
                sb.append(line + "\n");
            }
            br.close();
            editor.setText(sb.toString());
        } catch (Exception e) {
        }
    }
    //存檔
    private void saveFile(){
        if(editFile == null){
            savaAsFile();
        }
        else {
            save2RealFile();
        }
    }
    //另存新檔
    private void savaAsFile(){
        JFileChooser jfc = new JFileChooser();
        if(jfc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION){
            editFile = jfc.getSelectedFile();
            save2RealFile();
        }
    }
    private void save2RealFile(){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(editFile));
            bw.write(editor.getText());
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//自己的Override
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