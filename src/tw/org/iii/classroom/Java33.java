package tw.org.iii.classroom;

public class Java33 {
	public static void main (String []args){
		Java332 obj1 = new Java332();
//		obj1.m1();
		obj1.m1(3);
//		obj1.m2();
	}
}
class Java331 {
	int a;
	void m1(){System.out.println("Java331:m1()");a++;}
	}
class Java332 extends Java331 {
	int a;
//	void m1(){
//		super.m1();
//		System.out.println("Java332:m1()");
//	}
	void m1(int a){
		System.out.println(super.a);
		System.out.println(this.a);
		super.m1();
		System.out.println(super.a);
		System.out.println(this.a);
		a++;
		System.out.println(super.a);
		System.out.println(this.a);
		System.out.println(a);
//		System.out.println("Java332:m1(int):" + this.a++);
	}
	void m2(){System.out.println("Java332:m2()");}
	
}
	

