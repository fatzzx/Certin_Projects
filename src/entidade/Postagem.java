package entidade;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Postagem {
	
	private ArrayList<Comentarios> comentarios = new ArrayList<>();
	private Date momento = new Date();
	private String titulo;
	private  String conteudo;
	private Integer curtidas;
	
	
	public Postagem(Date momento, String titulo, String conteudo, Integer curtidas) {
		this.momento = momento;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.curtidas = curtidas;
	}
	
	public Postagem() {
		
	}
	
	public ArrayList<Comentarios> getComentarios() {
		return comentarios;
	}
	public void setComentarios(ArrayList<Comentarios> comentarios) {
		this.comentarios = comentarios;
	}
	public Date getMomento() {
		return momento;
	}
	public void setMomento(Date momento) {
		this.momento = momento;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public Integer getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(Integer curtidas) {
		this.curtidas = curtidas;
	}
	
	public void addComentario(Comentarios comentario) {
		comentarios.add(comentario);
	}
	
	public boolean removeComentario(Comentarios comentario) {
		if(comentarios.remove(comentario))return true;
		else return false;
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		str.append("Titulo - " + titulo + "\n" + "Data - " + sdf.format(momento) + " Curtidas - " + curtidas + "\n" + conteudo + "\n" + "Comentarios:\n");
		for(Comentarios c : comentarios) {
			str.append(c + "\n");
		}
		return str.toString();
	}
	
	
}
