package qintess.academiajava.aplicacao;

import java.util.LinkedHashSet;
import java.util.Set;

import qintess.academiajava.classes.Produto;

public class AppSet04 {
	public static void main(String[] args) {
		// so podemos adicionar elementos a uma coleção TreeSet se a classe destes elementos implementar Comparable
		
		//Set<Produto> produtos = new TreeSet<Produto>();
		Set<Produto> produtos = new LinkedHashSet<Produto>();	
		
		produtos.add(new Produto("Camisa", "Vestuario", 100));
		produtos.add(new Produto("Bicileta", "Esportes", 1000));
		produtos.add(new Produto("Computador","informática", 3000));
		
		produtos.forEach(s -> System.out.println(s));
	}

}
