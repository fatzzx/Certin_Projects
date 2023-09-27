package aplicacao;
import entidade.Pedido;
import entidade.Cliente;
import entidade.StatusPedido;
import entidade.Produto;
import entidade.ItensPedido;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.ZoneId;

public class Questao01avancada {
	
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        Instant instant = dataHoraAtual.atZone(ZoneId.systemDefault()).toInstant();
        Date dataAtual = Date.from(instant);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Informe os dados do cliente:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Data de nascimento (DD/MM/YYYY)");
		String nascimento = sc.next();
		Cliente cliente = new Cliente(nome, email, sdf.parse(nascimento));
		System.out.println("\nInforme os dados do pedido");
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.next().toUpperCase());
		System.out.print("Quantos itens para o seu pedido ? ");
		int q = sc.nextInt();
		Produto produto = new Produto();
		ItensPedido item = new ItensPedido();
		Pedido pedido = new Pedido(dataAtual, status, cliente);
		for(int i = 1; i <= q; i++) {
			System.out.println("Informe os dados do item " + i + ":");
			System.out.print("Nome do produto :");
			nome = sc.next();
			System.out.print("Preco do produto: ");
			Double preco = sc.nextDouble();
			System.out.print("Quantidade :");
			int quantidade = sc.nextInt();
			produto = new Produto(nome, preco);
			item = new ItensPedido(quantidade, preco, produto);
			pedido.addItem(item);
			System.out.println();
		}
		
		System.out.println(pedido);
		
		sc.close();
	}

}
