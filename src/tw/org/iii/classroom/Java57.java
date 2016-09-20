package tw.org.iii.classroom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Java57 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Java573 obj = new Java573();
		try {
			ObjectOutputStream oout =
					new ObjectOutputStream(new FileOutputStream("dir1/Java57.gif"));
			oout.writeObject(obj);
			oout.flush();
			oout.close();
		}catch (Exception e){
		}
		System.out.println("----------");
		ObjectInputStream oin = new ObjectInputStream(new FileInputStream("dir1/Java57.gif"));
		Java573 obj2 = (Java573)(oin.readObject());
		oin.close();
	}

}
class Java571 {
	
}
class Java572 extends Java571 {
	
}
class Java573 extends Java572 implements Serializable{
	
}