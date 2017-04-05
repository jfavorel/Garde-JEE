package MODEL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class modelConnectionBDD {
	private  static Connection connexion;
	
	public static Connection loadDataBase() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		}

		try {
			connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/garde_alterne", "root", "gouverol");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connexion;
	}
}
