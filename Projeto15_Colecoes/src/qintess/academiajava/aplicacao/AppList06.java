package qintess.academiajava.aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import qintess.academiajava.classes.OrdenadorCategoria;
import qintess.academiajava.classes.OrdenadorDescricao;
import qintess.academiajava.classes.Produto;

public class AppList06 {
	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add( new Produto("Teclado", "Informatca", 89));
		produtos.add( new Produto("Laptop", "Informatica", 5000));
		produtos.add( new Produto("Hamburger", "Alimento",20));
		produtos.add( new Produto("Coxinha", "Alimento",10));
		
		//Ordenando pela descrição 
		Collections.sort(produtos, new OrdenadorDescricao());
		
		//Ordenando pela categoria 
		Collections.sort(produtos, new OrdenadorCategoria());
		
		produtos.forEach(s -> System.out.println(s.mostrar()+ '\n'));
	}

}
