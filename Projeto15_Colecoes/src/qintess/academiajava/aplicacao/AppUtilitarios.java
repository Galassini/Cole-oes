package qintess.academiajava.aplicacao;

import qintess.academiajava.utils.Utilitarios;

public class AppUtilitarios {
	public static void main(String[] args) {

		// Metodo GerarLinha: executando as duas versoes.
		System.out.println(Utilitarios.gerarLinha(20));
		System.out.println(Utilitarios.gerarLinha(20, '*'));

		// Método calcularSoma
		double soma1 = Utilitarios.calcularSoma();
		double soma2 = Utilitarios.calcularSoma(12, 14, 6, 7, 9);
		double soma3 = Utilitarios.calcularSoma(1, 6, 8, 7, 6, 4, 2, 5);

		double[] numeros = { 17, 85, 92 };
		double soma4 = Utilitarios.calcularSoma(numeros);

		System.out.println("soma1: " + soma1);
		System.out.println("soma2: " + soma2);
		System.out.println("soma3: " + soma3);
		System.out.println("soma4: " + soma4);

		System.out.printf("soma1: %.2f%n", soma1);
		System.out.printf("soma2: %.2f%n", soma2);
		System.out.printf("soma3: %.2f%n", soma3);
		System.out.printf("soma4: %.2f%n", soma4);
	}
}
