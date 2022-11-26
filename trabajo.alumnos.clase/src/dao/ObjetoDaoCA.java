package dao;

import java.sql.Connection;
import java.sql.SQLException;

import util.DatabaseConnection;
// OBJETO TERMINADO.
public class ObjetoDaoCA {

	private static Connection connection;

	// Abrimos conexión.
	protected static Connection openConnection() {

		DatabaseConnection dbConnection = new DatabaseConnection();
		connection = dbConnection.getConnection();
		return connection;
	}
	// Cerramos conexión.
	protected static void closeConnection() {
		
		try {
			connection.close();
			connection = null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
