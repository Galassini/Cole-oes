package qintess.academiajava.aplicacao;
import java.util.Set;
import java.util.TreeSet;

public class AppSet03 {
	public static void main(String[] args) {
		
		//LinkedHashet mantem a ordem das inserçoes 
		Set<String> pessoas = new TreeSet<String>();
		pessoas.add("Priscila");
		pessoas.add("Fernanda");
		pessoas.add("Elizelma");
		pessoas.add("Thais");
		pessoas.add("Marcia");
		pessoas.add("Lorena");
		
		pessoas.forEach(s -> System.out.println(s));
		
	}

}
