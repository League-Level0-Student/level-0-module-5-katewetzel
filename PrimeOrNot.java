package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	String number = JOptionPane.showInputDialog("Input a number");
	int n = Integer.parseInt(number);
	for(int i=2;i<n;i++) {
		if(n % i ==0) {
			JOptionPane.showMessageDialog(null, "This is not prime");
			break;
		} else if (i==(n-1)){
			JOptionPane.showMessageDialog(null, "This is prime");
		}
	
	}
}
}
