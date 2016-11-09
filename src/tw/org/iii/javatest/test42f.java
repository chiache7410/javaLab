package tw.org.iii.javatest;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

//Client
public class test42f {
    public static void main(String[] args){
        //用for可netstat
            try {
                Socket socket = new Socket(InetAddress.getByName("10.2.24.105"),9999);

                OutputStream out = socket.getOutputStream();
                FileInputStream fin = new FileInputStream("dir1/p1.jpg");
                int b;
                while ( (b = fin.read()) != -1 ){
                    out.write(b);
                }


                fin.close();
                out.flush();
                out.close();

                socket.close();
                System.out.println("OK");
            } catch (IOException e) {
                System.out.println("Client Exception:" + e.toString());
            }

    }
}
