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
		
		//PROBAMOS MÉTODO BORRAR ALUMNO. FUNCIONA
		/*Clase c1=claseDao.buscarPorId(1);
		Alumno a1=new Alumno("Manuel","Porras",12,c1);
		alumnoDao.insertar(a1);*/
//		Alumno borrar= alumnoDao.buscarPorId(3);
//		alumnoDao.borrar(borrar);
		
		//PROBAMOS EL MÉTODO BUSCAR POR NOMBRE. FUNCIONA
		Alumno buscarNombre= alumnoDao.buscarPorNombre("Jose");
		System.out.println("Estos son los alumnos que hemos encontrado:\n\t "
		+" Nombre:  "+buscarNombre.getNombre()
		+" \n\tApellido: "+buscarNombre.getApellido()
		+" \n\tEdad: "+buscarNombre.getEdad());
		System.out.println("----------------------------------------------");
		
		
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
		
		//PROBAMOS EL MÉTODO MODIFICAR DE CLASE.FUNCIONA
		Clase buscar = claseDao.buscarPorId(1);
		System.out.println(buscar);
		buscar.setNombre("PSP");
		buscar.setProfesor("Miguel");
		buscar.setAnio(2);
		claseDao.modificar(buscar);
		
		//PROBAMOS EL MÉTODO MODIFICAR DE ALUMNO.FUNCIONA
		Alumno buscarAlumno= alumnoDao.buscarPorId(2);
		buscarAlumno.setNombre("Jose");
		buscarAlumno.setApellido("Ona");
		buscarAlumno.setEdad(29);
		alumnoDao.modificar(buscarAlumno);
		
		
		


	}

}
