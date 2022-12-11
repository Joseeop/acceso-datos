package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.x.protobuf.MysqlxConnection.Close;

import pollo.Alumno;
import pollo.Clase;
//FALTA POR HACER EL MÉTODO BUSCARPORID.
public class AlumnoDao extends ObjetoDaoCA implements InterfazDaoCA<Alumno> {
	
	private static Connection connection;
	
	@Override
	public ArrayList<Alumno> buscarTodos() {
		connection = openConnection();

		ArrayList<Alumno> alumnos = new ArrayList<>();

		String query = "select * from alumnos";

		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Alumno alumno = new Alumno(rs.getInt("id"), 
						rs.getString("nombre"), 
						rs.getString("apellido"),
						rs.getInt("edad"),
						null);
				alumnos.add(alumno);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		closeConnection();

		return alumnos;
	}

	@Override
	public void insertar(Alumno t) {
		connection = openConnection();
		String query ="insert into alumnos (nombre, apellido ,edad, clase_id) values (?,?,?,?)";
		try {
			PreparedStatement ps= connection.prepareStatement(query);
			ps.setString(1, t.getNombre());
			ps.setString(2,t.getApellido());
			ps.setInt(3, t.getEdad());
			ps.setInt(4, t.getClase().getId());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		closeConnection();
		
		
	}
	

	@Override
	public void modificar(Alumno t) {

		int id = t.getId();
		String nombre=t.getNombre();
		String apellido=t.getApellido();
		int edad=t.getEdad();
		connection = openConnection();
		String query = "UPDATE alumnos set nombre=?, apellido=?, edad=? where id = ?";

		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, nombre);
			ps.setString(2, apellido);
			ps.setInt(3, edad);
			ps.setInt(4, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeConnection();
	}
		
	
	public void borrarPorClase(int clase_id) {
		connection=openConnection();
		
		String query="DELETE FROM alumnos where clase_id = ?";
		
		try {
			PreparedStatement ps= connection.prepareStatement(query);
			ps.setInt(1, clase_id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		closeConnection();
	}

	@Override
	public void borrar(Alumno t) {
		connection = openConnection();
		
		int id = t.getId();
		String query = "delete from alumnos where id = ?";
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

	

	@Override
	public Alumno buscarPorId(int i) {
		connection = openConnection();

		String query = "select * from alumnos where id =?";
		Alumno alumno = null;
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, i);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				alumno = new Alumno(rs.getInt("id"), 
						rs.getString("nombre"), 
						rs.getString("apellido"), 
						rs.getInt("edad"),
						obtenerClase(rs.getInt("clase_id"))
						);
				//FALTA POR HACER
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	closeConnection();

		return alumno;
	}
	public Clase obtenerClase(int clase_id) {
		
	Clase clase=null;
	connection = openConnection();
	String query = "SELECT * FROM clase WHERE id=?";
	
	try {
		PreparedStatement ps= connection.prepareStatement(query);
		ps.setInt(1, clase_id);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			clase= new Clase(rs.getInt("id"),
						rs.getInt("anio"),
						rs.getString("profesor"),
						rs.getString("nombre"),
						null
					);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	closeConnection();
	
	return clase;
			
	}
}
