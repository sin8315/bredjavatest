package tw.org.iii.classroom;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Java60 {

	public static void main(String[] args) {
		byte[] buf = new byte[1024];
		try {
			DatagramSocket socket = new DatagramSocket(8888);
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			System.out.println("before");
			socket.receive(packet);
			System.out.println("after");
			socket.close();
			InetAddress urip = packet.getAddress();
			System.out.println("REC OK!" + urip.getHostAddress());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
