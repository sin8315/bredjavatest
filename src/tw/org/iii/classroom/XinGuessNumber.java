package tw.org.iii.classroom;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class XinGuessNumber extends JFrame implements ActionListener {
	private JButton guess;
	private JTextArea edit;
	private JTextField edit2;

	public XinGuessNumber(){
		super("²q¼Æ¦r¹CÀ¸");
		
		guess = new JButton("£~£~ §A²qªü");
		
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new XinGuessNumber();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
