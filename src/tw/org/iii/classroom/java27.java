package tw.org.iii.classroom;

public class java27 {

	public static void main(String[] args) {
		TWid id1 = new TWid(false, 5);
		System.out.println(id1.getId());
		
		if (TWid.isRight(id1.getId())){
			System.out.println("OK");
		}else{
			System.out.println("XX");
		}
	}

}
