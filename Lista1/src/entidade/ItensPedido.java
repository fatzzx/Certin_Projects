package entidade;

public class ItensPedido {

	private Integer quantidade;
	private Double preco;
	private Produto produto;
	
	public ItensPedido() {
		
	}
	public ItensPedido(Integer quantidade, Double preco) {
		this.quantidade = quantidade;
		this.preco = preco;
	}
	public ItensPedido(Integer quantidade, Double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Double subtotal() {
		return preco * quantidade;
	}
	
	public String toString() {
		return produto + ", R$ "+ preco + ", Quantidade: " + quantidade +", Subtotal: R$" + subtotal();
	}
	
	
}
