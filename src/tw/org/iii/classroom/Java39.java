package tw.org.iii.classroom;

public class Java39 {

	public static void main(String[] args) {
		Java391 obj1 = new Java391();
		Java392 obj2 = new Java393();
		Java393 obj3 = new Java393();
		Java393 obj4 = (Java393)obj2;
		obj4.m3();
	}
}
class Java391{
	void m1(){}
	void m2(){}
}
abstract class Java392{
	Java392(){System.out.println("Java392()");}
	void m1(){System.out.println("Java392:m1()");}
	abstract void m2();
}
class Java393 extends Java392{
	void m2 (){System.out.println("Java392:m2()");}
	void m3 (){System.out.println("Java392:m3()");}
}
final class Java394 {
	
}

