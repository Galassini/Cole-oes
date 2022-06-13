package qintess.academiajava.aplicacao.arrays;

import javax.swing.JOptionPane;

public class AppArrays04 {
	
	public static void main(String[] args) {
		/*
		 * O usuario fornece como dados de entrada: dia mes e ano
		 * Com base nestas informaçoes o programa apresentaa quantidade 
		 * de dias para terminar o ano.
		 */
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia. "));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês. "));
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano. "));
		
		int[] meses = { 31,ano % 4 == 0 ? 29:28, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};
		
		int diasRestantes = meses [mes - 1] - dia;
	    for (int i = 0; i < meses.length; i++) {
			diasRestantes += meses[i];
		}
		
	    String resposta = "Restam " + diasRestantes + "dias para terminar o ano  informado. ";
	    JOptionPane.showMessageDialog(null, resposta);		
	}

}
