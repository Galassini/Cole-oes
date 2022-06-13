package qintess.academiajava.aplicacao;

import java.util.HashSet;
import java.util.Set;

public class AppSet01 {
	public static void main(String[] args) {
		Set<String> pessoas = new HashSet<String>();
		pessoas.add("Priscila");
		pessoas.add("Fernanda");
		pessoas.add("Elizelma");
		pessoas.add("Thais");
		pessoas.add("Marcia");
		pessoas.add("Lorena");
		
		pessoas.forEach(s -> System.out.println(s));
		
	}

}
