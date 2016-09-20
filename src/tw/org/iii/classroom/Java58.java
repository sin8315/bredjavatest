package tw.org.iii.classroom;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Java58 {

	public static void main(String[] args) {
		try {
			InetAddress[] ips = InetAddress.getAllByName("www.microsoft.com");
			for (InetAddress ip : ips)
			System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println("X");
		}
	}
}
