package tw.org.iii.javatest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//Server
public class test43f {
    public static void main(String[] agrs){
        try {
            ServerSocket server = new ServerSocket(9999);
            System.out.println("Listening...");
            Socket socket = server.accept();

            String urip = socket.getInetAddress().getHostAddress();
            System.out.print(urip + ":");
            FileOutputStream fout = new FileOutputStream("dir2/" + urip + ".jpg");
            InputStream in = socket.getInputStream();
            int b;
            while ( (b = in.read()) != -1 ){
                fout.write(b);
            }
            in.close();
            fout.flush();
            fout.close();

            server.close();
            System.out.println("Server OK");
        }catch (IOException e){

        }
    }
}
