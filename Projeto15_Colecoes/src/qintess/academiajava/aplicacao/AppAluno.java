package qintess.academiajava.aplicacao;

import java.util.ArrayList;
import java.util.List;

import qintess.academiajava.classes.Aluno;
import qintess.academiajava.classes.Curso;
import qintess.academiajava.enumeracoes.Sexo;

public class AppAluno {
	public static void main(String[] args) {
		try {
			//Instância da Classe Aluno
			Aluno aluno = new Aluno("Germinal Jurado", 30, Sexo.MASCULINO, 1234);
			
			//Lista de Cursos
			List<Curso> cursos = new ArrayList<Curso>();
			cursos.add(new Curso("PHP", 40, 1200));
			cursos.add(new Curso("React", 60, 1550));
			
			//Atribuindo a lista de cursos para o Aluno.
			aluno.setCursos(cursos);
			
			//Apresentando a lista de cursos do Aluno
			System.out.println(aluno.listarCursos());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}