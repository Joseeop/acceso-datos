package pollo;
//TERMINADA
public class Alumno {

	private int id;
	private String nombre;
	private String apellido;
	private int edad;
	private Clase clase;
	
	
	public Alumno(int id,String nombre,String apellido, int edad, Clase clase) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido=apellido;
		this.edad = edad;
		this.clase = clase;
		
	}


	public Alumno( String nombre,String apellido, int edad, Clase clase) {
		super();
		
		this.nombre = nombre;
		this.apellido=apellido;
		this.edad = edad;
		this.clase = clase;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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
	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	@Override
	public String toString() {
		return "Alumno :" + id + 
				"\n\t Nombre: " + nombre + 
				"\n\t Apellido: "+apellido+
				"\n\t Edad: " + edad ;
	}
	
}
