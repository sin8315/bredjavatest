package tw.org.iii.classroom;

public class brad17 {
	public static void main(String[] args) {
		int p1, p2, p3, p4, p5, p6;
		p1 = p2 = p3 = p4 = p5 = p6 = 0;
		
		for (int i=0; i<100; i++){
		int point = (int)(Math.random()*6+1); //1~6�I
		switch (point){
		case 1:
			p1++;
			break;
		case 2:
			p2++;
			break;
		case 3:
			p3++;
			break;
		case 4:
			p4++;
			break;
		case 5:
			p5++;
			break;
		case 6:
			p6++;
			break;
		}		
		}
	}
	}

