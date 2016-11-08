package tw.org.iii.javatest;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class test39 {
    public static void main(String[] args){
        try {
            InetAddress ip = InetAddress.getByName("www.microsoft.com");
            System.out.println(ip.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("unknowm host" + e);
        }
    }
}
