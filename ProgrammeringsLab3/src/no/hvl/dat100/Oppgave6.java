package no.hvl.dat100;

public class Oppgave6 {

	public static void main(String[] args) {

		int n, svar;
		svar = 1;
		String output;
		
		do {
			n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Heltall over null: "));
			
		} while(n<=0);
		
		for (int i=1; i<=n; i++) {
			svar *= i;
		}
		
		output = "n fakultetet(n!) = " + svar;
		javax.swing.JOptionPane.showMessageDialog(null, output);
	}

}
