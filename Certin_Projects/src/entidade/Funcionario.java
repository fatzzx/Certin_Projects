package entidade;

public class Funcionario {
	private String nome;
	private float salario;
	private int id;

	public Funcionario() {
		
	}
	public Funcionario(String nome, float salario, int id) {
		this.nome = nome;
		this.salario = salario;
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
    public String toString() {
        return "ID ->  " + id + "\nNOME ->   " + nome + "\nSALARIO ->   " + salario;
    }
	
}
