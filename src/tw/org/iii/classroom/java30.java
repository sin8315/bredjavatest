package tw.org.iii.classroom;

public class java30 {
	public static void main (String[] args){
		Java301 obj1 = new Java301((short)1);
	}
}
class Java301{
//	Java301(){
//		System.out.println("A");
//	}
	Java301(int a){
		System.out.println("B");		
	}
//	Java301(byte a){
//		System.out.println("C");		
//	}
}

class Java302 extends Java301 {
	Java302(){
		//super();
		super(1);
		System.out.println("D");
	}
	Java302(int a){
		this();
		System.out.println("E");
	}
	Java302(String b){
		this(1);
		System.out.println("F");
	}
}