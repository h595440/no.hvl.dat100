package no.hvl.dat100;

import java.text.DecimalFormat;

public class Trinnskatt {

	public static void main(String[] args) {
		
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		int bruttol�nn = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Din brutto l�nn: "));
		int trinn1, trinn2, trinn3, trinn4;
		trinn1 = 164101;
		trinn2 = 230951;
		trinn3 = 580651;
		trinn4 = 934051;
		double trinnskatt;
		
		if (bruttol�nn >= trinn4) {
			trinnskatt = bruttol�nn * 0.1452;
		} else if(bruttol�nn < trinn4 && bruttol�nn >= trinn3) {
			trinnskatt = bruttol�nn * 0.1152;
		} else if (bruttol�nn < trinn3 && bruttol�nn >= trinn2) {
			trinnskatt = bruttol�nn * 0.0241;
		} else if (bruttol�nn < trinn2 && bruttol�nn >= trinn1) {
			trinnskatt = bruttol�nn * 0.0093;
		} else {
			trinnskatt = 0.00;
		}
		
		String output = "Din trinnskatt er: " + numberFormat.format(trinnskatt) + " kroner.";
		javax.swing.JOptionPane.showMessageDialog(null, output);
	}

}
