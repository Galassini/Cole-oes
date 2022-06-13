package qintess.academiajava.aplicacao;

import java.util.ArrayList;
import java.util.List;

import qintess.academiajava.classes.Aluno;
import qintess.academiajava.classes.Funcionario;
import qintess.academiajava.classes.Pessoa;
import qintess.academiajava.enumeracoes.Sexo;

public class AppList04 {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		try {
			pessoas.add(new Aluno("Miguel", 10, Sexo.MASCULINO, 1234));
			pessoas.add(new Aluno("Mariana", 15, Sexo.FEMININO, 2233));
			pessoas.add(new Funcionario( "Arnaldo", 35, Sexo.MASCULINO, "Motorista", 5000));
			
			for (Pessoa pessoa : pessoas) { 
				System.out.println(pessoa.mostrar());
				System.out.println("------------------------------");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}