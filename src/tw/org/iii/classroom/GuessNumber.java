package tw.org.iii.classroom;

import javax.swing.JOptionPane;
import java.awt.BorderLayout;

public class GuessNumber {
	public static void main(String[] args) {
		String answer = createAnswer(4);
		boolean isWINNER = false;
		for (int i=0; i<10; i++){
			String guess = JOptionPane.showInputDialog("�q�a!");
			
			// ���
			if (guess.equals(answer)){
				// ��F => ���ߦѷ�,...
				isWINNER = true;
				JOptionPane.showMessageDialog(null, "���ߦѷ�,...");
				break;
			}else{
				// ���F => ���� 1A2b
				String result = checkAB(answer, guess);
				JOptionPane.showMessageDialog(null, guess + ":" + result);
			}
		}
		if (!isWINNER){
			JOptionPane.showMessageDialog(null, "��, �|�D, \n���׬O:" + 
						answer);
		}
			
		
		
	}
	static String checkAB(String a, String g){
		int A, B; A = B = 0;
		for (int i=0; i<g.length();i++){
			if (g.charAt(i) == a.charAt(i)){
				A++;
			}else if (a.indexOf(g.charAt(i)) != -1){
				B++;
			}
		}
		return A + "A" + B + "B";
	}
	
	static String createAnswer(int n){
		// �~�P
		int[] poker = new int[n];	// 0,0,...0
		int rand;
		boolean isOK;
		for (int i=0; i<poker.length; i++){
			
			do {
				rand = (int)(Math.random()*10);
				// �ˬd����
				isOK = true;
				for (int j=0;j<i;j++){
					if (poker[j]==rand){
						isOK = false;
						break;
					}
				}
				
			}while (!isOK);
			
			poker[i] = rand;
			//System.out.println(poker[i]);
		}
		String ret = "";
		for (int v : poker) ret += v;
		
		return ret;
	}
	
}
