package tw.org.iii.javatest;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
//Client
public class test42 {
    public static void main(String[] args){
        //用for可netstat
            try {
                Socket socket = new Socket(InetAddress.getByName("10.2.24.105"),9999);

                BufferedOutputStream bout = new BufferedOutputStream(socket.getOutputStream());
                bout.write("Hello,\nHello-2".getBytes());
                bout.flush();
                bout.close();

                socket.close();
                System.out.println("OK");
            } catch (IOException e) {
            }

    }
}
