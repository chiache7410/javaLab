package tw.org.iii.javatest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

//Client
public class test44 {
    public static void main(String[] args){
            try {
                File source = new File("dir1/p1.jpg");
                byte[] buf = new byte[(int)source.length()];
                FileInputStream fin = new FileInputStream(source);
                fin.read(buf);
                fin.close();
                Socket socket = new Socket(InetAddress.getByName("10.2.24.105"),9999);
                OutputStream out = socket.getOutputStream();
                out.write(buf);
                out.flush();
                out.close();
                socket.close();
                System.out.println("OK");
            } catch (IOException e) {
                System.out.println("Client Exception:" + e.toString());
            }
    }
}
