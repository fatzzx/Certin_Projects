package controller;
import entidade.Funcionario;
import java.util.Comparator;
import java.util.TreeSet;

public class FuncionariosController {

	private TreeSet<Funcionario> funcionariosList = new TreeSet<>(Comparator.comparingInt(Funcionario::getId));
	
	public boolean registro(String nome, float salario, int id) {
		Funcionario funcionario = new Funcionario(nome, salario, id);
		if(funcionariosList.add(funcionario)) return true;
		else return false;
	}
	
	public void imprimeFuncionarios() {
		int c = 0;
		for(Funcionario f : funcionariosList) {
			System.out.println("-------------------");
			System.out.println("Funcionario " + c);
			System.out.println(f.toString());
			System.out.println("-------------------");
			System.out.println();
			c++;
		}
	}
	
	public boolean aumentoSalarial(int id, float valor) {
		Funcionario aux = new Funcionario();
		aux.setId(id);
		if(!funcionariosList.contains(aux) || valor < 0) return false;
		else {
			for(Funcionario f : funcionariosList) {
				if(f.getId() == id) {
					f.setSalario(f.getSalario() + (f.getSalario() * valor/100));
					break;
				}
			}
		}
		return true;
	}

}
