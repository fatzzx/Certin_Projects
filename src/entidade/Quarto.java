package entidade;

public class Quarto {
	
	private String nome;
	private String email;
	private int numeroQuarto;
	
	public Quarto(String nome, String email, int numeroQuarto){
		this.email = email;
		this.nome = nome;
		this.numeroQuarto = numeroQuarto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}
	
	
	
	
}
