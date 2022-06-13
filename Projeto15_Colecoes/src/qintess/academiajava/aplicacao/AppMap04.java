package qintess.academiajava.aplicacao;

import java.util.LinkedHashMap;
import java.util.Map;

import qintess.academiajava.classes.Curso;

public class AppMap04 {
	public static void main(String[] args) {

		try {
			Curso curso1 = new Curso("Java", 100, 1500);
			Curso curso2 = new Curso("SQL", 40, 10);
			Curso curso3 = new Curso("BI", 50, 2000);
			
			Map<Integer, Curso> cursos =new LinkedHashMap<>();
			cursos.put(curso1.getCodigo(), curso1);
			cursos.put(curso2.getCodigo(), curso2);
			cursos.put(curso3.getCodigo(), curso3);
			
			cursos.forEach((K, V) -> System.out.println("\nchave: " + K + "\n" + V.mostrar()));
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}