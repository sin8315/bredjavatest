package tw.org.iii.classroom;

public class java23 {
	public static void main(String [] args ){
		int i = 0, sun = 0, n= 1000;//sun累加質 , n為加到1000
//		while (i < 10)	{
//			System.out.println(i++);
//		for (;i<10;) {
//			System.out.println(i++);
//		}
//		while (i <= n){   用while迴圈
//			sun += i++;
//		}
		for (;i <= n;){   //用for迴圈
			sun += i++;
		}
		System.out.println(sun);
	}

}
