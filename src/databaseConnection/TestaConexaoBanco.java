package databaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestaConexaoBanco {

	public static void main(String args[]) throws SQLException{
		FabricaDeConexoes fab = new FabricaDeConexoes();
		Connection con = null;
		try {
			con = fab.getConnection();
			PreparedStatement statement = con.prepareStatement("SELECT * FROM GSH_ATENDIMENTO WHERE 0 = 0 AND ID_ATENDIMENTO = 4");
			ResultSet result = statement.executeQuery();
			
			while(result.next()){
				System.out.println(result.getString("ID_ATENDIMENTO"));
			}
			
			System.out.println("conectou!");			
		} catch (Exception e) {
		    e.getMessage();
			e.printStackTrace();
		}finally{
			con.close();
		}
				
	}
}
