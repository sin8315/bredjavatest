package tw.org.iii.classroom;

public class Java68 {

	public static void main(String[] args) {
		Java681 obj1 = new Java681("A");
		Java681 obj2 = new Java681("B");
		obj1.start();
		obj2.start();
			
	}

}
class Java681 extends Thread {
	private String name;
	private int delay;
	Java681(String name){this.name = name;}
	@Override
	public void run() {
		for (int i=0 ; i<10; i++){
			System.out.println(name + ":"+ i);
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
