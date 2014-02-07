import java.sql.*;

public class ecodb {

	public ecodb(){
		Connection conn = null;
		Statement stmt = null;
		try{
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:test.db");
			stmt = conn.createStatement();
			String sql = "CREATE TABLE IF NOT EXISTS ITEMS " +
			       "(ID INT PRIMARY KEY     NOT NULL," +
			       " NAME           TEXT    NOT NULL, " + 
			       " STORE          TEXT     NOT NULL, " + 
			       " PRICE          REAL, " + 
			       " QUANTITY       REAL)"; 
			stmt.executeUpdate(sql);
			stmt.close();
			conn.close();
		}catch(Exception e){
			System.err.println(e);
		}
	}
}
