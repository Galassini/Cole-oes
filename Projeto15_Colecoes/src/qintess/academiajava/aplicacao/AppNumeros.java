package qintess.academiajava.aplicacao;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class AppNumeros {
	public static void main(String[] args) {
		
		// variaveis double, apresentando formataçoes 
		
		double valor = 1234.5;
		
		// Formatação para moeda
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		String s = nf.format(valor);
		System.out.println(s);
		
		//formatação numerica 
			nf = NumberFormat.getNumberInstance();
		System.out.println(nf.format(valor));
		
		//A classse DecimalFormat
		DecimalFormat df = new DecimalFormat("0.##");
		System.out.println(df.format(valor));
		
		df = new DecimalFormat("0.00");
		System.out.println(df.format(valor));
		
		df = new DecimalFormat(",##.00");
		System.out.println(df.format(valor));
		
		
	}

}
