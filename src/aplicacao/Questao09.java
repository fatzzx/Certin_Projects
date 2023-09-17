package aplicacao;
import controller.FuncionariosController;
import java.util.Scanner;


public class Questao09 {

	public static void main(String[] args) {
		FuncionariosController lista = new FuncionariosController();
		Scanner sc = new Scanner(System.in);
		int op = 0, n, id;
		float salario, perc;
		String nome;
		do {
			System.out.println("Digite quantas pessoas deseja registrar");
			n = sc.nextInt();
			for(int i = 0; i < n; i ++) {
				do {
					System.out.println("Funcionario #" + (i + 1));
					System.out.print("Id: ");
					id = sc.nextInt();
					System.out.print("Nome: ");
					nome = sc.next();
					System.out.print("Salario: ");
					salario = sc.nextFloat();	
				}while(!lista.registro(nome, salario, id));
			}		
			System.out.println("Digite 1 se quiser listar os funcionarios, 2 se quiser alterar o salario em percentual de um funcionario e 3 se quiser sair");
			op = sc.nextInt();
			if(op == 1) lista.imprimeFuncionarios();
			if(op == 2) {
				do {
					System.out.println("Qual o id do funcionario que quer alterar: ");
					id = sc.nextInt();
					System.out.println("E qual o valor em percentual");
					perc = sc.nextFloat();
				}while(!lista.aumentoSalarial(id, perc));
			}
		}while(op != 3);

		sc.close();
	}
}
