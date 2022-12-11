package principal;

import java.util.ArrayList;

import dao.AlumnoDao;
import dao.ClaseDao;


import pollo.Alumno;
import pollo.Clase;




public class PrincipalCA {

	public static void main(String[] args) {
		

		
		ClaseDao claseDao=new ClaseDao();
		AlumnoDao alumnoDao=new AlumnoDao();
		
		//INSERTAMOS NUEVA CLASE.FUNCIONA
//		Clase c=new Clase(2,"Miguel","PSP");
//		claseDao.insertar(c);
		
		
		
		//PROBAMOS MÉTODO BORRAR CLASE, FUNCIONA
		/*Clase c=new Clase(2,"Alejandra","Acceso a Datos");
		Clase borrar = claseDao.buscarPorId(2);
		claseDao.insertar(c);
		claseDao.borrar(borrar);*/
		
		//INSERTAMOS NUEVO ALUMNO.FUNCIONA
//		Clase c1=claseDao.buscarPorId(1);
//		Alumno a1=new Alumno("José","Oña",32,c1);
//		alumnoDao.insertar(a1);
		
		/*Clase c1=claseDao.buscarPorId(1);
		Alumno a1=new Alumno("Manuel","Porras",12,c1);
		alumnoDao.insertar(a1);*/
		Alumno borrar= alumnoDao.buscarPorId(3);
		alumnoDao.borrar(borrar);
		
		
		//PROBAMOS EL MÉTODO BUSCAR TODO DE CLASE. FUNCIONA.
		ArrayList<Clase> clases = claseDao.buscarTodos();
		for(Clase claseFOR : clases) {
			System.out.println(claseFOR);
		}
		
		//PROBAMOS EL MÉTODO BUSCAR TODO DE ALUMNOS
		ArrayList<Alumno>alumnos=alumnoDao.buscarTodos();
		for(Alumno alumnoFOR : alumnos) {
			System.out.println(alumnoFOR);
		}
		
		//PROBAMOS EL MÉTODO MODIFICAR DE CLASE
		Clase buscar = claseDao.buscarPorId(1);
		System.out.println("Clase 1 "+buscar);
		buscar.setNombre("PSP");
		buscar.setProfesor("Miguel");
		buscar.setAnio(2);
		claseDao.modificar(buscar);
		
		//PROBAMOS EL MÉTODO MODIFICAR DE ALUMNO.
		Alumno buscarAlumno= alumnoDao.buscarPorId(2);
		buscarAlumno.setNombre("Jose");
		buscarAlumno.setApellido("Ona");
		buscarAlumno.setEdad(29);
		alumnoDao.modificar(buscarAlumno);
		
		
		
//		serieDao.borrarPorSerie(1);
		
		/*Serie s=serieDao.bucarPorId(1);
		
		Temporadas t1=new Temporadas(1,"The simpsons Season1",s);
		Temporadas t2=new Temporadas(1,"The simpsons Season2",s);
		Temporadas t3=new Temporadas(1,"The simpsons Season3",s);
		
		temporadaDao.insertar(t3);
		temporadaDao.insertar(t2);
		temporadaDao.insertar(t1);
		*/
		
	/*	Serie s= new Serie("Los Simpsons",7,"Disney Plus");
		Serie s2= new Serie("Peaky Blinders",18,"Netflix");
		
		
		//Creamos esta SerieDao para tener acceso a las funciones de la clase SerieDao
		SerieDao serie= new SerieDao();
//		serie.insertar(s);
//		serie.insertar(s2);
		Serie b = serie.bucarPorId(3);
		
		System.out.println(b);
		
		
		Temporadas t=new Temporadas(1,"Primera temporada",b);
		Temporadas t2=new Temporadas(2,"Segunda temporada",b);
		
		TemporadaDao temporadaDao=new TemporadaDao();
		temporadaDao.insertar(t2);
		temporadaDao.insertar(t);
		
	ArrayList<Serie> series = serie.buscarTodos();
		
		Serie peaky= serie.bucarPorId(3);
		peaky.setPlataforma("HBO");
		serie.modificar(peaky);
		
		for(int i=0;i<series.size();i++) {
			System.out.println(series.get(i));
		}
		
		//BUCLE FOR EACH. PARA CADA OBJETO SERIE QUE ESTE EN EL ARRAYLIST DE SERIE LO IMPRIMIMOS
		for(Serie serieFOR : series) {
			System.out.println(serieFOR);
		}
		
		ArrayList<Temporadas> temporadas= serie.obtenerTemporadas(peaky);
		
		for (Temporadas temporada : temporadas) {
			System.out.println(temporada);
		}
*/
	}

}
