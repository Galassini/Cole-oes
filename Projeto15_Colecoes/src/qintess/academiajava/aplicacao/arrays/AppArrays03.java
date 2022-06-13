package qintess.academiajava.aplicacao.arrays;

import javax.swing.JOptionPane;

public class AppArrays03 {
	public static void main(String[] args) {
		/*
		 * Neste  exercicio, o programa pede para o usuario informar um mes (1 a 12).
		 * De acordo com o m�s informado, o programa mostra o numero de dias daquele m�s.
		 * Obs.: Vamos tambem perguntar  o ano para determinar a quantidade de dias do m�s de fevereiro.
		 */
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o m�s. "));
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano. "));
		
		int[] meses = { 31,ano % 4 == 0 ? 29:28, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};
		
		String resposta = "O m�s informado  possui " + meses[mes - 1] + "dias";
		JOptionPane.showInputDialog(null, resposta);
	}

}
