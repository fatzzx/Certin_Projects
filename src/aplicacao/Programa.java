package aplicacao;
import entidade.Hotel;
import java.util.Scanner;

public class Programa {

	public static void menu() {
		System.out.println("**************************************");
		System.out.println("Pressione 1 para reserva");
		System.out.println("Pressione 2 para ver as informacoes");
		System.out.println("Pressione 3 para sair");
		System.out.println("**************************************");
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hotel hotel = new Hotel();
		int op, numq;
		String nome, email;
		do {
			menu();
			op = sc.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("Qual o numero do quarto ?");
				numq = sc.nextInt();
				System.out.println("Qual o seu nome ?");
				nome = sc.next();
				System.out.println("Qual o seu email ?");
				email = sc.next();
				if(hotel.reserva(nome, email, numq)) System.out.println("Parabens pegue sua chave !");
				else System.out.println("O quarto ja tem hospede !!!");
				break;
			case 2:
				hotel.printaQuartos();
				break;
			default:
				break;
			}
		}while(op != 3);
		
		
		sc.close();
	}

}

