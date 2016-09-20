
//public class java23 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
//測試看看  ㄏㄏ
package tw.org.iii.classroom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Java47 {

	public static void main(String[] args) {
		File f1 = new File("dir1/Java01");
		long len = f1.length();
		try {
			FileInputStream fin = new FileInputStream(f1);
			int c; byte[] temp = new byte[(int)len];
			fin.read(temp);
			System.out.println(new String(temp));
//			while((c = fin.read(temp)) != -1){
//				System.out.print(new String(temp,0,c));
//			}
			
			fin.close();
//			System.out.println("OK");
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		}catch (IOException e) {
			System.out.println(e.toString());
		}
				
	}

}
