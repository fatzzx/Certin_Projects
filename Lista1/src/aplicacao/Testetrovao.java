package aplicacao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import entidade.Comentarios;
import entidade.Postagem;

public class Testetrovao {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date momento = sdf.parse("18/09/2023 00:00:00");
		Postagem postagem = new Postagem(momento, "Esse e o titulo da postagem", "E esse e o conteudo", 99);
		Comentarios comentario = new Comentarios("Estacionei no buracao hoje");
		postagem.addComentario(comentario);
		comentario = new Comentarios("Na verdade estacionei no Cimatec 4");
		postagem.addComentario(comentario);
		postagem.removeComentario(comentario);
		System.out.println(postagem);
	}
}
