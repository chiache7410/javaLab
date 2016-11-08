package tw.org.iii.javatest;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class test42 {
    public static void main(String[] args){

            try {
                Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9999);
                socket.close();
                System.out.println("OK");
            } catch (IOException e) {
            }

    }
}
