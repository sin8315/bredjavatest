package tw.org.iii.classroom;

public class Java64 {

	public static void main(String[] args) {
		

	}

}
interface Java641 {
	void m1();
}
interface Java642 {
	void m2();
}
interface Java643 extends Java641, Java642{
	void m3();
}
class Java644 implements Java643 {
	public void m1(){}
	public void m2(){}
	public void m3(){}
}