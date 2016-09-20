package tw.org.iii.classroom;

import javax.swing.JFrame;

public class XinClock extends JFrame{
	
	
	public XinClock(){
		
	setTitle("時鐘");
	setSize(800,600);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	public static void main(String[] args) {
	new XinClock();
	}

}
