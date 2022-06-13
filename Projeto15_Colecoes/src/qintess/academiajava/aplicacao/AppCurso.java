package qintess.academiajava.aplicacao;

import qintess.academiajava.classes.Curso;

public class AppCurso {
	public static void main(String[] args) {
		try {
			Curso curso1 = new Curso("PHP", 40, 1200);
			Curso curso2 = new Curso("React", 60, 1550);
			
			System.out.print("Curso 1: " + curso1); //o método toString() é chamado implicitamente. 
			System.out.print("Curso 2: " + curso2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}