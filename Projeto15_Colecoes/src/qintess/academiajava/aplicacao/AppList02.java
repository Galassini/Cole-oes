package qintess.academiajava.aplicacao;

import java.util.ArrayList;
import java.util.List;

public class AppList02 {
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
		nomes.add("Odair");
		nomes.add("Arthur");
		nomes.add("Bernardo");
		nomes.add("Loly");
		
		//adicionando um item no começo da lista 
		nomes.add(0, "Galassini");
		
		// removendo elementos
		// 1. removendo pelo indece
		nomes.remove(1);
		
		// 2. removendo pelo objeto
		nomes.remove("Elizelma");
		
		// 3. removendo de acordo com uma condição 
		nomes.removeIf( s -> s.contains("e"));
		
		// mostrando na tela o que sobrou............
		nomes.forEach(nome -> System.out.println(nome));
	}

}
