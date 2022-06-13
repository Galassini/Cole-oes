package qintess.academiajava.aplicacao;
import java.util.LinkedHashSet;
import java.util.Set;

public class AppSet02 {
	public static void main(String[] args) {
		
		//LinkedHashet mantem a ordem das inserçoes 
		Set<String> pessoas = new LinkedHashSet<String>();
		pessoas.add("Priscila");
		pessoas.add("Fernanda");
		pessoas.add("Elizelma");
		pessoas.add("Thais");
		pessoas.add("Marcia");
		pessoas.add("Lorena");
		
		pessoas.forEach(s -> System.out.println(s));
		
	}

}
