package tw.org.iii.classroom;

public class Java32 {

	public static void main(String[] args) {
//		Java321 obj11 = new Java321();
//		Java321 obj12 = new Java321();
	//	Java322 obj2 = new Java322();
//		Java323 obj3 = new Java323();
	}

}
class Java321 {
	int a = 12;
	static{
		System.out.println("Java321:static{}");
	}
	{
		System.out.println("Java321:{}:" + ++a);
	}
	Java321(){System.out.println("Java321()");}
	static void m1(){
		System.out.println("Java321:m1()");
    }
class Java322 extends Java321 {

	Java322(){System.out.println("Java322()");}
}
}
//class Java323 extends Java322 {
//	Java323(){System.out.println("Java323()");}
//}
//}

