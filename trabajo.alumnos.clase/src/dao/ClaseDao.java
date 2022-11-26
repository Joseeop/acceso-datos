package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import pollo.Alumno;
import pollo.Clase;


public class ClaseDao extends ObjetoDaoCA implements InterfazDaoCA<Clase> {

	private static Connection connection;

	@Override
	public ArrayList<Clase> buscarTodos() {
		connection = openConnection();

		ArrayList<Clase> clases = new ArrayList<>();

		String query = "select * from clase";

		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Clase clase = new Clase(rs.getInt("id"), rs.getInt("anio"), rs.getString("profesor"),
						rs.getString("nombre"), null);
				clases.add(clase);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		closeConnection();

		return clases;

	}

	@Override
	public void insertar(Clase t) {
		connection = openConnection();
		String query = "insert into clase(anio,profesor,nombre) values(?,?,?)";

		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, t.getAnio());
			ps.setString(2, t.getProfesor());
			ps.setString(3, t.getNombre());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		closeConnection();
	}

	@Override
	public void modificar(Clase t) {

		int id = t.getId();
		int anio = t.getAnio();
		String profesor = t.getProfesor();
		String nombre = t.getNombre();
		connection = openConnection();
		String query = "UPDATE clase set anio=?, profesor=?, nombre=? where id = ?";

		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, anio);
			ps.setString(2, profesor);
			ps.setString(3, nombre);
			ps.setInt(4, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeConnection();
	}

	@Override
	public void borrar(Clase t) {
		int clase_id = t.getId();
		AlumnoDao alumnoDao = new AlumnoDao();
		alumnoDao.borrarPorClase(clase_id);

		connection = openConnection();

		String query = "DELETE FROM clase WHERE id=?";

		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, clase_id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		closeConnection();
	}

	@Override
	public Clase buscarPorId(int i) {
		connection = openConnection();

		String query = "select * from clase where id =?";
		Clase clase = null;
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, i);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				clase = new Clase(rs.getInt("id"), rs.getInt("anio"), rs.getString("profesor"), rs.getString("nombre"),
						null);
				clase.setAlumnos(obtenerAlumnos(clase));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeConnection();

		return clase;
	}

	public ArrayList<Alumno> obtenerAlumnos(Clase clase) {

		ArrayList<Alumno> alumno = new ArrayList<Alumno>();

		String query = "SELECT * FROM alumnos WHERE clase_id=?";

		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, clase.getId());
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Alumno alumno1 = new Alumno(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido"),
						rs.getInt("edad"), clase);
				alumno.add(alumno1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// closeConnection();

		return alumno;
	}

}
