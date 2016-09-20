package tw.org.iii.classroom;

public class Java35 {

	public static void main(String[] args) {
		Java354 car = new Java354();
		Java352 t1 = new Java352();
		Java353 t2 = new Java353();
		car.m1(t2);
	}

}
interface Java351{
	void m1();
	void m2();
}
class Java352 implements Java351{
	public void m1(){System.out.println("Java352:m1()");}
	public void m2(){System.out.println("Java352:m2()");}
	void m3(){System.out.println("Java352:m3()");}
}
class Java353 implements Java351{
	public void m1(){System.out.println("Java353:m1()");}
	public void m2(){System.out.println("Java353:m2()");}
	void m4(){System.out.println("Java353:m4()");}
}
class Java354 {
	void m1(Java351 obj1){
		obj1.m1();
		obj1.m2();
	}
}



