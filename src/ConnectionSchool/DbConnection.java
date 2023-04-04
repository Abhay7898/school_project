package ConnectionSchool;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school?characterEncoding=utf8","root","root");
		}catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
