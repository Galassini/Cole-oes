package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import qintess.academiajava.classes.Funcionario;
import qintess.academiajava.enumeracoes.Sexo;

public class AppFuncionario {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
			//String doc = JOptionPane.showInputDialog("Informe o documento: ");
			String nome = JOptionPane.showInputDialog("Informe o nome: ");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
			Sexo sexo = (Sexo)  JOptionPane.showInputDialog
					(null, "Selecione o sexo: ", "Sexo", JOptionPane.INFORMATION_MESSAGE, null, Sexo.values(), null);
			String cargo = JOptionPane.showInputDialog("Informe o cargo: ");
			double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário: "));
			
			Funcionario funcionario = new Funcionario(nome, idade, sexo, cargo, salario);
			JOptionPane.showMessageDialog(null, funcionario.mostrar());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}