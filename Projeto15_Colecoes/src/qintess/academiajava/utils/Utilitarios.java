package qintess.academiajava.utils;

public class Utilitarios {

	// Metodo que recebe dois parâmetros númericos e retorna sua soma

	public static double somar(double x, double y) {
		double resultado = x + y;
		return resultado;

	}
	// Metodo que recebe um valor em dolares e retorna este valor em reais
	// (tomando como base o dolar do dia 14/04/2022: 4.696)

	public static double dolarPraReal(double dolar) {
		return dolar * 4.696;

	}

	// Método que recebe como parâmentro uma quantidade de traços e
	// retorna uma string com todos esses traços
	public static String gerarLinha(int quantidade) {
		return gerarLinha(quantidade, '-');

	}

	public static String gerarLinha(int quantidade, char ch) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < quantidade; i++) {
			sb.append(ch);
		}
		return sb.toString();
	}
	// método que recebe uma quantidade variavel de parametros numericos (double)
	// e retorna a soma destes valores.
	
	//1. Consideraçoes sobre varargs:
	//2. Se o método tiver mais de um parametro, e um deles  for varargs,
	//este deve ser o ultimo.
	public static double calcularSoma(double...numeros) {
		double soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
			
		}
			return soma;
		}
	}
