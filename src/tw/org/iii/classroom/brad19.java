package tw.org.iii.classroom;

public class brad19 {

	public static void main(String[] args) {
		int[] p = new int[6];  //p[0] = 0, p[1]= 0;.........p[5]=0;
		
		for (int i=0; i<100; i++){
			int point = (int)(Math.random() * 6 );	// 0 - 5
			p[point]++;
				}
		for (int i=0; i<p.length; i++){
			System.out.println((i+1) + ":" + p[i] );
		}
		
	}

}
