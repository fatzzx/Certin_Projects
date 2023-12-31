package entidades;
import java.util.Date;


public class ProdutoUsado extends Produto {

	Date dataFabricacao = new Date();

	public ProdutoUsado(String nome, Double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	@Override
	public String etiqueta() {
		return nome + " (usado) R$ " + preco + "(Data de fabricacao : " + dataFabricacao + ")";
	}
	
	
	
	
	
}
