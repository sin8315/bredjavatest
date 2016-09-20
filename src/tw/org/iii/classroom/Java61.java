package tw.org.iii.classroom;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Java61 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://pdfmyurl.com/?url=http://yahoo.com.tw");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();
//			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//			
//			String line;
//			while ((line = reader.readLine()) != null){
//				System.out.println(line);
//			}
//			reader.close();
			
			InputStream in = conn.getInputStream();
			FileOutputStream fout = new FileOutputStream("upload/Java3.pdf");
			int b;
			while ( ( b = in.read())!=-1);{
				
			}
			fout.flush();
			fout.close();
			in.close();
			
			
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

}
