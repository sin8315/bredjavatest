
package tw.org.iii.classroom;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Java55 {
		public static void main(String[] args) {
			Student s1 = new Student(null, "abc",90,50,75);
			Student s2 = new Student(null, "efg",80,70,45);
			System.out.println(s1.calTotal());
			System.out.println(s1.calAvg());
			
			try {
				ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("dir1/student.brad"));
				oout.writeObject(s1);
				oout.writeObject(s2);
				oout.flush();
				oout.close();
			} catch (IOException e) {
				System.out.println(e.toString());
			}
			
	}

}


class Student implements Serializable{
	int ch , eng , math ;
	String name;
	PM pm;
	Student(PM pm ,String name,int ch, int eng, int math){
		this.name = name;
		this.ch = ch; this.eng = eng; this.math = math;
		this.pm = pm;
	}
	int calTotal(){ return ch+eng+math;}
	double calAvg(){ return calTotal()/3.0; }
}
class PM {
	
}