package tw.org.iii.classroom;

import javax.swing.JOptionPane;

public class brad11 {
	
	public static void main(String []args ){
		String strYear =
				JOptionPane.showInputDialog("Year");
		String strMonth =
				JOptionPane.showInputDialog("Month");
		int intYear = Integer.parseInt(strYear);
		System.out.println(intYear + "/" + strMonth);
	}
}
