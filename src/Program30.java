import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Program30 {

	static String url = "jdbc:mysql://localhost:3306/test_database";
	static String user = "root";
	static String password = "root";

	public static void main(String[] args) {

		String query = "select * from students";
		/*
		 * Not needed in the latest version of JDBC
		try {//additional try-catch needed because of not AutoCloseable
			Class.forName("com.mysql.cj.jdbc.Driver");		//loads the driver into memory
		} catch (ClassNotFoundException e1) {
			System.out.println("Exception occurred while loading driver:"+e1.getException());
		}
		*/
		try (Connection con = DriverManager.getConnection(url, user, password);
				Statement st = con.createStatement();) { // Connection and statement created using try with multiple resources
			System.out.println("Connection Created....");
			try {
				ResultSet rs = st.executeQuery(query);// ResultSet stores the data fetched from table rows
				while (rs.next()) {
					System.out.println("Name:" + rs.getString("name"));
					System.out.println("Age:" + rs.getString("age"));
				}
			} catch (Exception e) {
				e.getMessage();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
