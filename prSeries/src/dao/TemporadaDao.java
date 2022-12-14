package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import pollo.Temporadas;
import util.DatabaseConnection;

public class TemporadaDao extends ObjetoDao implements InterfazDao<Temporadas>  {
	
	private static Connection connection;
	
	
	public TemporadaDao () {
		
	}
	@Override
	public void insertar(Temporadas t) {
		connection = openConnection();
//		int id = t.getId();
//		int num_temporada = t.getNum_temporada();
//		String titulo = t.getTitulo();
//		int serie_id = t.getSerie().getId();
		
		String query ="insert into temporadas (num_temporada, titulo, serie_id) values (?,?,?)";
		try {
			PreparedStatement ps= connection.prepareStatement(query);
			ps.setInt(1, t.getNum_temporada());
			ps.setString(2, t.getTitulo());
			ps.setInt(3, t.getSerie().getId());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		closeConnection();
		
		
	}

	@Override
	public void modificar(Temporadas t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Temporadas t) {
		connection = openConnection();
		
		int id = t.getId();
		String query = "delete from temporadas where id = ?";
		try {
			
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, id);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeConnection();
	}
	
	public void borrarPorSerie(int serie_id) {
		connection=openConnection();
		
		String query="DELETE FROM temporadas where serie_id = ?";
		
		try {
			PreparedStatement ps= connection.prepareStatement(query);
			ps.setInt(1, serie_id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		closeConnection();
	}
	

	@Override
	public ArrayList<Temporadas> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Temporadas bucarPorId(int i) {
		// TODO Auto-generated method stub
		return null;
	}


}
