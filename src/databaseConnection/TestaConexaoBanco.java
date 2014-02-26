package databaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestaConexaoBanco {

	public static void main(String args[]) throws SQLException{
		FabricaDeConexoes fab = new FabricaDeConexoes();
		Connection con = null;
		PreparedStatement statement = null;
		try {
			con = fab.getConnectionGSH();
			statement = con.prepareStatement("SELECT * FROM GSH_ATENDIMENTO WHERE 0 = 0 AND ID_ATENDIMENTO = 4");
			ResultSet result = statement.executeQuery();
			
			while(result.next()){
				System.out.println(result.getString("ID_ATENDIMENTO")+" - "+ result.getString("DATA_SOLICITACAO"));
			}
			
			System.out.println("conectou!");			
		} catch (Exception e) {
		    e.getMessage();
			e.printStackTrace();
		}finally{
			statement.close();
			con.close();
		}
				
	}
}
