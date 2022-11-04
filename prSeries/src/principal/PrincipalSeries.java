package principal;

import java.util.ArrayList;

import dao.SerieDao;
import dao.TemporadaDao;
import pollo.Serie;
import pollo.Temporadas;



public class PrincipalSeries {

	public static void main(String[] args) {
		Serie s= new Serie("Los Simpsons",7,"Disney Plus");
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

	}

}
