package qintess.academiajava.aplicacao;

import java.util.ArrayList;
import java.util.List;

public class AppList01 {
	public static void main(String[] args) {
		//Listas de pessoas
		// ou List<String> nomes = new ArrayList<>();
		List<String> nomes = new ArrayList<String>();
		
		//Adicionar elemtos nessa lista
		nomes.add("Priscila");
		nomes.add("Fernanda");
		nomes.add("Elizelma");
		nomes.add("Thais");
		nomes.add("Marcia");
		nomes.add("Lorena");
		
		//Exibindo os dados na tela
		System.out.println(nomes);
	    System.out.println("-------------Usando a estrutura for------------------");
	    
	    for (int i = 0; i < nomes.size(); i++) {
	    	System.out.println(nomes.get(i));
	    }
	    System.out.println("-------------Usando o for aprimorado (for each)------------------");
	    
	    for (String nome : nomes) {
	    	System.out.println(nome);
			
		}
	    System.out.println("-------------Usando o metodo for each------------------");
	    
	    nomes.forEach(s -> System.out.println(s));
	    }
	}


