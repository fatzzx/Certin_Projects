package entidade;
import java.util.Date;

public class Cliente {

	private String nome;
	private String email;
	private Date DataNascimento = new Date();
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, String email, Date dataNascimento) {
		this.nome = nome;
		this.email = email;
		DataNascimento = dataNascimento;
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
	public Date getDataNascimento() {
		return DataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		DataNascimento = dataNascimento;
	}
	
	public String toString() {
		return nome + " " +  DataNascimento + " - " + email;
	}
	
	
}
