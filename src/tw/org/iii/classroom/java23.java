package tw.org.iii.classroom;

public class java23 {
	public static void main(String [] args ){
		int i = 0, sun = 0, n= 1000;//sun�֥[�� , n���[��1000
//		while (i < 10)	{
//			System.out.println(i++);
//		for (;i<10;) {
//			System.out.println(i++);
//		}
//		while (i <= n){   ��while�j��
//			sun += i++;
//		}
		for (;i <= n;){   //��for�j��
			sun += i++;
		}
		System.out.println(sun);
	}

}
