package src.jdbc.factory;

import java.sql.*;
import javax.sql.*;
import com.mchange.v2.c3p0.*;

public class ConnectionFactory {
	
	public DataSource dataSource;
	
	public ConnectionFactory() {
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/hotel_alura?user=root");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("futbol45");
		comboPooledDataSource.setMaxPoolSize(10);
		
		this.dataSource = comboPooledDataSource;
	}
	public Connection conectar() {
		try {
			return this.dataSource.getConnection();
		}catch (SQLException e) {
			e.getMessage();
			throw new RuntimeException(e);
		}
	}
		
}
