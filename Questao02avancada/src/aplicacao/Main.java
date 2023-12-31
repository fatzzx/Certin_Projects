package aplicacao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import entidades.*;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.print("Digite o numero de produtos: ");
		int n = sc.nextInt();
		for(int i = 1; i <=n; i++) {
			System.out.println("Dados do produto #" + i);
			System.out.println("Comum, usado, ou importado(c/u/i)?");
			char op = sc.next().charAt(0);
			if(op == 'i') {
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Preco: ");
				Double preco = sc.nextDouble();
				System.out.print("Taxa Alfandegaria: ");
				Double taxa = sc.nextDouble();
				ProdutoImportado pi = new ProdutoImportado(nome, preco, taxa);
				sb.append(pi.etiqueta() + "\n");
			}
			
			else if(op == 'c') {
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Preco: ");
				Double preco = sc.nextDouble();
				Produto p = new Produto(nome, preco);
				sb.append(p.etiqueta() + "\n");
				
			}
			
			else if (op == 'u') {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Preco: ");
				Double preco = sc.nextDouble();	
				System.out.print("Digite a data do produto (dd/mm/yyyy):");
				String data = sc.next();
				ProdutoUsado pu = new ProdutoUsado(nome, preco, sdf.parse(data));
				sb.append(pu.etiqueta() + "\n");	
			}
		
		}
		
		System.out.println(sb.toString());
		
		sc.close();
	}

}
