package tw.org.iii.classroom;

import java.io.File;
import java.io.IOException;

public class Java44 {
	public static void main(String[] args) {
		File f1 = new File("dir1/Java02");
		if (f1.isFile()){
			System.out.println("OK");
		}else{
			try {
				if (f1.createNewFile()){
					System.out.println("create OK");
				}else{
					System.out.println("creaete fail");
				}
			} catch (IOException e) {
				System.out.println(e.toString());
			}
		}
		}
	}
