package tw.org.iii.classroom;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {
		//1. read from local filesystem
		try {
			File sendFile = new File("dir1/cc.png");
			byte[] sendBuf = new byte[(int)sendFile.length()];
			BufferedInputStream bin = new BufferedInputStream(new FileInputStream(sendFile));
			
			bin.read(sendBuf);
			bin.close();
			
			//2. send by tcp
			Socket client = new Socket(InetAddress.getByName("127.0.0.1"),6666);
			BufferedOutputStream bout = new BufferedOutputStream(client.getOutputStream());
			bout.write(sendBuf);
			bout.flush();
			bout.close();
			client.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
