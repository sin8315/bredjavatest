package tw.org.iii.classroom;

public class Java41 {

	public static void main(String[] args) {
		int a = 10 , b = 0;
		int[] c = {1,2,3};
		try{
		System.out.println(a/b);
		System.out.println(c[4]);
		}catch(ArithmeticException ae){
			System.out.println("Java");
		}catch(ArrayIndexOutOfBoundsException e2){
			System.out.println("III");
		}catch(RuntimeException re){
			System.out.println("BIG");
		}
		System.out.println("OK");
	}

}
