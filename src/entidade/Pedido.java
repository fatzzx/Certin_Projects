package entidade;
import java.util.Date;
import java.util.ArrayList;

public class Pedido {

	private Date momento = new Date();
	private StatusPedido status;
	private ArrayList<ItensPedido> itens = new ArrayList<>();
	private Cliente cliente = new Cliente();
	
	public Pedido() {
		
	}
	public Pedido(Date momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Date getMomento() {
		return momento;
	}
	public void setMomento(Date momento) {
		this.momento = momento;
	}
	public StatusPedido getStatus() {
		return status;
	}
	public void setStatus(StatusPedido status) {
		this.status = status;
	}
	public ArrayList<ItensPedido> getItens() {
		return itens;
	}
	public void setItens(ArrayList<ItensPedido> itens) {
		this.itens = itens;
	}
	
	public void addItem(ItensPedido item) {
		itens.add(item);
	}
	
	public void removeItem(ItensPedido item) {
		itens.remove(item);
	}
	
	public Double total() {
		Double contador = 0.0;
		for(ItensPedido item : itens) {
			contador += item.subtotal();
		}
		return contador;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("RESUMO DO PEDIDO:\n");
		sb.append("Momento do pedido: " + momento + "\n");
		sb.append("Status do pedido: " + status + "\n");
		sb.append("Cliente: " + cliente + "\n");
		sb.append("Itens do pedido:\n");
		for(ItensPedido item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Valor Total : R$ " + total());
		return sb.toString();
	}
	
	
	
}
