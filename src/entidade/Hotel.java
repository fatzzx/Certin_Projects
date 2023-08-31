package entidade;
import java.util.ArrayList;


public class Hotel {
	
	private ArrayList<Quarto> quartos = new ArrayList<Quarto>();
	
	public Hotel() {
		for(int i = 0; i < 10; i++) {
			quartos.add(null);
		}
	}

	public boolean reserva(String nome, String email, int numeroquarto) {
		if(quartos.get(numeroquarto) != null) return false;
		else {
			Quarto quarto = new Quarto(nome, email, numeroquarto);
			quartos.set(numeroquarto, quarto);
		}
		return true;
	}
	
	public void printaQuartos() {
		
		for(Quarto elemento :  quartos) {
			if(elemento != null) {
				System.out.println("Quarto: " + elemento.getNumeroQuarto());
				System.out.println("Nome: " + elemento.getNome());
				System.out.println("Email: " + elemento.getEmail());				
			}
		}		
	}	
}
