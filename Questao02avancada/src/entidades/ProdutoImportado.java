package entidades;

public class ProdutoImportado extends Produto{
	
	private Double taxa;

	public ProdutoImportado(String nome, Double preco, Double taxa) {
		super(nome, preco);
		this.taxa = taxa;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public Double precoTotal() {
		return preco + taxa;
	}

	@Override
	public String etiqueta() {
		
		return nome + " R$ " + preco + " (Taxa alfandegaria R$ " + taxa + ")";
		
	}
}
