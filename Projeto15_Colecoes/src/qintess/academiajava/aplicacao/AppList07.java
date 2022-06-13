package qintess.academiajava.aplicacao;

import java.util.ArrayList;
import java.util.List;

import qintess.academiajava.classes.Produto;

public class AppList07 {
	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add( new Produto("Teclado", "Informatca", 89));
		produtos.add( new Produto("Laptop", "informatica", 5000));
		produtos.add( new Produto("Hamburger", "alimento",20));
		produtos.add( new Produto("Coxinha", "alimento",10));
		
		//ordenando pela descrição 
		produtos.sort((p1, p2) -> p1.getDescricao().compareToIgnoreCase(p2.getDescricao()));
		
		produtos.forEach(s -> System.out.println(s.mostrar() + '\n'));
	}

}
