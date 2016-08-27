package tw.org.iii.classroom;

public class Bike {
	private double speed ;
	void upSpeed(){
		speed = speed<1?10:speed*0.12;
	}
	void downSpeed(){
		speed = speed<1?0:speed*0.6;
	}
}
