package tw.org.iii.classroom;

import java.awt.AWTException;

public class Java42 {
	public static void main(String[] args) {
		Bird b1 = new Bird() ;
		try{
		b1.setLeg(3);
		System.out.println(b1.leg);
	}catch(RuntimeException re){
		System.out.println("@Q@!!!");
	}
		
	}
}
class Bird {
	int leg;
	void setLeg(int n){
		if(n<0 || n>2){
			throw new RuntimeException();
		}
		leg = n;
	}
}
class Java421 {
	void m1(int n) throws AWTException{
		if (n<0){
			throw new AWTException(null);
		}
		
	}
}
//class Java422 