package tw.org.iii.classroom;

public class Java37 {

	public static void main(String[] args) {
		final int d;
		d=12;
		System.out.println(Java376.a);
	}

}

interface Java371 {void m1();}
interface Java372 {void m2();}

class Java373 implements Java371, Java372 {
	public void m1() {}
	public void m2() {}
}

interface Java374 extends Java371 {
	void m3();
}

interface Java375 extends Java371, Java372 { //¶Z­±¸Ì­±
	int a = 10;  //public final
	void m3();   //public
}

class Java376 implements Java375 {
	int b;
	final int c;
	Java376(){c=12;}
	
	
	public void m1() {
		b++;
		//a=1;
	}
	public void m2(){}
	public void m3(){}
}