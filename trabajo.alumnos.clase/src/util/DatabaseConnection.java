package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//TERMINADO.
public class DatabaseConnection {

	Connection connection;
	
	public Connection getConnection() {
		String dbName = "bd_clases";
		String userName="root";
		String password="admin";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/"+ dbName,userName,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
}
