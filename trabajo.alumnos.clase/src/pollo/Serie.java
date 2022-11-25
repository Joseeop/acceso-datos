package pollo;

import java.util.ArrayList;

public class Serie {

	private int id;
	private String titulo;
	private int edad;
	private String plataforma;
	private ArrayList<Temporadas>temporadas;
	
	
	public Serie(String titulo, int edad, String plataforma) {
		super();
		this.titulo = titulo;
		this.edad = edad;
		this.plataforma = plataforma;
	}


	public Serie(int id, String titulo, int edad, String plataforma, ArrayList<Temporadas> temporadas) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.edad = edad;
		this.plataforma = plataforma;
		this.temporadas = temporadas;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getPlataforma() {
		return plataforma;
	}


	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}


	public ArrayList<Temporadas> getTemporadas() {
		return temporadas;
	}


	public void setTemporadas(ArrayList<Temporadas> temporadas) {
		this.temporadas = temporadas;
	}


	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Serie :" + id + 
				"\n\t titulo: " + titulo + 
				"\n\t edad: " + edad + 
				"\n\t plataforma: " + plataforma;
	}

	
	
}
