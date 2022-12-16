package pollo;
//TERMINADA
public class Alumno {

	/**
	 * variable id de alumno
	 */
	private int id;
	/**
	 * Variable nombre de alumno
	 */
	private String nombre;
	/**
	 * Variable apellido de alumno
	 */
	private String apellido;
	/**
	 * Variable edad de alumno
	 */
	private int edad;
	/**
	 * Variable clase de la clase Clase
	 */
	private Clase clase;
	
	/**
	 * Constructor de clase alumno
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param clase
	 */
	public Alumno(int id,String nombre,String apellido, int edad, Clase clase) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido=apellido;
		this.edad = edad;
		this.clase = clase;
		
	}

	/**
	 * Constructor de clase Alumno, sin id.
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param clase
	 */

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
