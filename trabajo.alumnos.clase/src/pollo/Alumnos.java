package pollo;

public class Alumnos {

	private int id;
	private int num_alumnos;
	private String nombre;
	private int edad;
	private Clase clase;
	
	
	public Alumnos(int id, int num_alumnos, String nombre, int edad, Clase clase) {
		super();
		this.id = id;
		this.num_alumnos = num_alumnos;
		this.nombre = nombre;
		this.edad = edad;
		this.clase = clase;
	}


	public Alumnos(int num_alumnos, String nombre, int edad, Clase clase) {
		super();
		this.num_alumnos = num_alumnos;
		this.nombre = nombre;
		this.edad = edad;
		this.clase = clase;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getNum_alumnos() {
		return num_alumnos;
	}


	public void setNum_alumnos(int num_alumnos) {
		this.num_alumnos = num_alumnos;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public Clase getClase() {
		return clase;
	}


	public void setClase(Clase clase) {
		this.clase = clase;
	}
	
	
}
