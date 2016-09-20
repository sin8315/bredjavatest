package tw.org.iii.classroom;

public class Java40 {

	public static void main(String[] args) {
		Java401 obj1 = new Java401 ();
		Java402 obj2 = new Java402 ();
		Java401 obj3 = new Java402 ();
		//Java402 obj4 = new Java401 ();
		obj1.m1();
		obj2.m1();
		obj3.m1();
	}

}
class Java401 {
	int a = 1 ;
	void m1(){System.out.println("Java401:m1():" + a);}
}
class Java402 extends Java401 {
	int a = 2 ;
	void m1(){System.out.println("Java402:m2():" + a);}
	void m2(){System.out.println("Java402:m2()");}
}