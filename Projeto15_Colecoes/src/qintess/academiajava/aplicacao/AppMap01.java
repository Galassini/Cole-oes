package qintess.academiajava.aplicacao;

import java.util.HashMap;
import java.util.Map;

public class AppMap01 {
	public static void main(String[] args) {
		Map<String, String> pessoas = new HashMap<String, String>();

		pessoas.put("61019513080", "Gabriela");
		pessoas.put("61852040025", "Antonio");
		pessoas.put("76148800055", "Leticia");
		pessoas.put("76148800051", "Leticia");
		pessoas.put("61019513080", "Renato");
		
		//Listandop os elementos usando o foreach
		for (Map.Entry<String, String> item : pessoas.entrySet()) {
			System.out.println(item.getKey() + " - " + item.getValue());
			
		}
		System.out.println("------------------------------");
		//Listando os elementos usando expressão Lampda
		pessoas.forEach((K, V) -> System.out.println(K + " - " + V));
	}

}
