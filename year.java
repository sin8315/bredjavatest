package tw.org.iii.classroom;

public class year {
	public static void main(String[] args){
		int years = (int)(Math.random()*2999+1); //1 - 3000
		
		if ( years%4==0 ){
			System.out.println( years +  "å¹?,?˜¯å¹³å¹´");
		}else{
			if ( years%100==0 ){
			System.out.println( years + "å¹?,?˜¯å¹³å¹´");
		}else{
			if ( years%400==0 ){
			System.out.println( years +  "å¹?,?˜¯å¹³å¹´");
		}else{
			System.out.println( years +  "å¹?,?˜¯å¹³å¹´");
		}
	}
			
}
}		
}

