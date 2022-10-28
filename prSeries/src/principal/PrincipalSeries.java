package principal;

import dao.SerieDao;
import dao.TemporadaDao;
import pollo.Serie;
import pollo.Temporadas;


public class PrincipalSeries {

	public static void main(String[] args) {
		Serie s= new Serie("Los Simpsons",7,"Disney Plus");
		Serie s2= new Serie("Peaky Blinders",18,"Netflix");
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
		

	}

}
