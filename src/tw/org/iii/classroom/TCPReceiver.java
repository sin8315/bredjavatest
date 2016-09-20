package tw.org.iii.classroom;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPReceiver {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(7777);
			Socket socket = server.accept();
			
			BufferedInputStream bin = new BufferedInputStream(socket.getInputStream());
			
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("upload/aa.png"));
			
			int b;
			while ((b = bin.read())!=-1){
				
			}
			bin.close();
			
			server.close();
	
		} catch (IOException e) {
			
		}
	}

}
