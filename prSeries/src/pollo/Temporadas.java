package pollo;

public class Temporadas {

	private int id;
	private int num_temporada;
	private String titulo;
	private Serie serie;
	
	
	public Temporadas(int num_temporada, String titulo, Serie serie) {
		super();
		this.num_temporada = num_temporada;
		this.titulo = titulo;
		this.serie = serie;
	}
	public Temporadas(int id, int num_temporada, String titulo, Serie serie) {
		super();
		this.id = id;
		this.num_temporada = num_temporada;
		this.titulo = titulo;
		this.serie = serie;
	}
	public int getNum_temporada() {
		return num_temporada;
	}
	public void setNum_temporada(int num_temporada) {
		this.num_temporada = num_temporada;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Serie getSerie() {
		return serie;
	}
	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Temporadas [id=" + id + ", num_temporada=" + num_temporada + ", titulo=" + titulo + ", serie=" + serie.getTitulo()
				+ "]";
	}
	
	
}
