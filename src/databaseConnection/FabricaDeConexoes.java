package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexoes {
	
	public Connection getConnection(){
		try{
			return DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.55:1521:gshjava","gsh_web_desenv_new","gsh");
		}catch(SQLException e){
			e.getMessage();
			return null;
		}
	}
}
