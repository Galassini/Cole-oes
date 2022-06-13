package qintess.academiajava.aplicacao.arrays;

public class AppArrays01 {
	public static void main(String[] args) {
		// Arrays de inteiros
		// 1. Forma de criar um Arrays
		int[] numeros1 = new int[5];

		numeros1[0] = 10;
		numeros1[1] = 18;
		numeros1[2] = 25;
		numeros1[3] = 11;
		numeros1[4] = 14;

		// 2. Forma de criar um Arrays
		int[] numeros2 = { 10, 18, 25, 11, 14 };

		// Apresentando os dados do array
		for (int num : numeros1) {
			System.out.println(num);

		}
		System.out.println();

		for (int num2 : numeros2) {
			System.out.println(num2);
		}

	}
}
