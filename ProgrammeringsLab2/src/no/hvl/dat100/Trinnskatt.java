package no.hvl.dat100;

import java.text.DecimalFormat;

public class Trinnskatt {

	public static void main(String[] args) {
		
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		int bruttolønn = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Din brutto lønn: "));
		int trinn1, trinn2, trinn3, trinn4;
		trinn1 = 164101;
		trinn2 = 230951;
		trinn3 = 580651;
		trinn4 = 934051;
		double trinnskatt;
		
		if (bruttolønn >= trinn4) {
			trinnskatt = bruttolønn * 0.1452;
		} else if(bruttolønn < trinn4 && bruttolønn >= trinn3) {
			trinnskatt = bruttolønn * 0.1152;
		} else if (bruttolønn < trinn3 && bruttolønn >= trinn2) {
			trinnskatt = bruttolønn * 0.0241;
		} else if (bruttolønn < trinn2 && bruttolønn >= trinn1) {
			trinnskatt = bruttolønn * 0.0093;
		} else {
			trinnskatt = 0.00;
		}
		
		String output = "Din trinnskatt er: " + numberFormat.format(trinnskatt) + " kroner.";
		javax.swing.JOptionPane.showMessageDialog(null, output);
	}

}
