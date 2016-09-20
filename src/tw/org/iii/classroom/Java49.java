package tw.org.iii.classroom;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Java49 {

	public static void main(String[] args) {
		File f1 = new File("dir1/Java03");
		try {
			FileOutputStream fout =
					new FileOutputStream(f1, true);
			fout.write("Hello , Javarfeeed\n".getBytes());
			fout.flush();
			fout.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
