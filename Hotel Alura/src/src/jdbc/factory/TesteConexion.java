package src.jdbc.factory;

import java.sql.*;

public class TesteConexion {
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/hotel_alura?user=root",
				"root",
				"futbol45");
		System.out.println("Conecto con exito");
		
		con.close();
	}

}
