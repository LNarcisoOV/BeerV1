package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexoes {
	
	public Connection getConnectionHOME(){
		try{
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/SistemaLeo","postgres","123465");
		}catch(SQLException e){
			e.getMessage();
			return null;
		}
	}
	
	public Connection getConnectionGSH(){
		try{
			return DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.55:1521:gshjava","gsh_web_desenv_new","gsh");
		}catch(SQLException e){
			e.getMessage();
			return null;
		}
	}
}
