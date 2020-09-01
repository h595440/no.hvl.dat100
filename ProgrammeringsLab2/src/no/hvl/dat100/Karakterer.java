package no.hvl.dat100;

public class Karakterer {

	public static void main(String[] args) {

		int antallStudenter = 10;
		int poengSum;
		
		for (int i = 1; i <= antallStudenter; i++) {
			poengSum = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Poengsum: "));
			while (poengSum > 100 || poengSum < 0) {
				poengSum = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ugyldig poengsum! Prøv igjen: "));
			}
			
			if (poengSum >= 0 && poengSum < 40) {
				javax.swing.JOptionPane.showMessageDialog(null, "Student nr " + i + " fikk en F");
			} else if (poengSum >= 40 && poengSum < 50) {
				javax.swing.JOptionPane.showMessageDialog(null, "Student nr " + i + " fikk en E");
			} else if (poengSum >= 50 && poengSum < 60) {
				javax.swing.JOptionPane.showMessageDialog(null, "Student nr " + i + " fikk en D");
			} else if (poengSum >= 60 && poengSum < 80) {
				javax.swing.JOptionPane.showMessageDialog(null, "Student nr " + i + " fikk en C");
			} else if (poengSum >= 80 && poengSum < 90) {
				javax.swing.JOptionPane.showMessageDialog(null, "Student nr " + i + " fikk en B");
			} else {
				javax.swing.JOptionPane.showMessageDialog(null, "Student nr " + i + " fikk en A");
			}
		}
	}

}
