package tarjetaPckg;

public class Tarjeta {

	private String categoria;
	private String anverso;
	private String reverso;

	public Tarjeta() {

	}

	public Tarjeta(String categoria, String anverso, String reverso) {
		this.categoria = categoria;
		this.anverso = anverso;
		this.reverso = reverso;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getAnverso() {
		return anverso;
	}

	public void setAnverso(String anverso) {
		this.anverso = anverso;
	}

	public String getReverso() {
		return reverso;
	}

	public void setReverso(String reverso) {
		this.reverso = reverso;
	}

}
