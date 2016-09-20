package tw.org.iii.classroom;

//Exception Call Stack
public class Java43 {
	public static void main(String[] args) {
		Java433 obj1 = new Java433();
		try{
			obj1.m3();
		}catch (Exception ee){
		}
	}

}
class Java431{
	void m1() throws Exception{
		throw new Exception();
	}
}
class Java432 extends Java431{
	void m2() throws Exception{
		m1();
		}
}
class Java433 extends Java432{
	void m3() throws Exception{
		m2();
		}
}