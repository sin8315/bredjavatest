package tw.org.iii.classroom;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Java59 {
	
	public static void main(String[] args) {
		String data = "Hello, World";
		byte[] sendData = data.getBytes();
		try {
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(sendData, sendData.length,
					InetAddress.getByName("10.2.24.106"), 8888);
			socket.send(packet);
			socket.close();
		} catch (SocketException e) {
			
		} catch (UnknownHostException e){
			
		} catch (IOException e) {
	
		}
	}
}
