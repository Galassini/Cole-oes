package qintess.academiajava.aplicacao;



import java.util.LinkedHashMap;
import java.util.Map;

public class AppMap02 {

	public static void main(String[] args) {
		Map<String, String> pessoas = new LinkedHashMap<>();

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

