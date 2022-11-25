package pollo;

import java.util.ArrayList;

public class Clase {

	private int id;
	private int anio;
	private String profesor;
	private String nombre;
	private ArrayList <Alumnos> alumnos;
	
	//TERMINADA
	public Clase(int anio,String profesor,String nombre) {
		
		super();
		this.anio=anio;
		this.nombre=nombre;
		this.profesor=profesor;
	}
	
	
	public Clase(int id, int anio, String profesor, String nombre, ArrayList<Alumnos> alumnos) {
		super();
		this.id = id;
		this.anio = anio;
		this.profesor = profesor;
		this.nombre = nombre;
		this.alumnos = alumnos;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAnio() {
		return anio;
	}


	public void setAnio(int anio) {
		this.anio = anio;
	}


	public String getProfesor() {
		return profesor;
	}


	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public ArrayList<Alumnos> getAlumnos() {
		return alumnos;
	}


	public void setAlumnos(ArrayList<Alumnos> alumnos) {
		this.alumnos = alumnos;
	}
	
	
	@Override
	public String toString() {
		return "Clase :" + id + 
				"\n\t nombre: " + nombre + 
				"\n\t anio: " + anio + 
				"\n\t profesor: " + profesor;
	}

	
	
}
