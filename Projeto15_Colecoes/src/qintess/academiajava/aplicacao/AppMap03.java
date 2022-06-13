package qintess.academiajava.aplicacao;

import java.util.Map;
import java.util.TreeMap;

public class AppMap03 {
	public static void main(String[] args) {
		Map<String, String> pessoas = new TreeMap<>();

		pessoas.put("61019513080", "Gabriela");
		pessoas.put("61852040025", "Antonio");
		pessoas.put("76148800055", "Leticia");
		pessoas.put("76148800051", "Leticia");
		pessoas.put("61019513080", "Renato");
		
			
		
		System.out.println("------------------------------");
		//Listando os elementos usando expressão Lampda
		pessoas.forEach((K, V) -> System.out.println(K + " - " + V));
	}


}

