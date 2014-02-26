package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import databaseConnection.FabricaDeConexoes;

public class BeersDao {
	FabricaDeConexoes fab = new FabricaDeConexoes();
	Connection con = null;
		
		public ResultSet listaCervejas() throws SQLException{
			Connection con = fab.getConnection();			
			String sql = "SELECT * FROM GSH_ATENDIMENTO WHERE 0 = 0 AND ID_ATENDIMENTO = 4";			
			PreparedStatement stm = con.prepareStatement(sql);
			ResultSet result = stm.executeQuery();
			
			con.close();
			stm.close();
			
			return result;
		}
}
