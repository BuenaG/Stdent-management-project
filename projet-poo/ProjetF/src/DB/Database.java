package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
public class Database {

	Connection conn = null;
	Statement stmt;
	PreparedStatement ps= null;
	
	public Database () {

		try{
			String url = "jdbc:mysql://localhost/proekt?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			String username = "root";
			String password = "Grc251089.";

			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.createStatement();
		
			
		}    	
		catch(Exception ex) {
			System.out.println("Connection failed...");
			System.out.println(ex);

		}
	}
	public Statement getStatement()
	{

		return stmt;
	}
	public Connection getConnection ()
	{
		return conn;
	}
}

