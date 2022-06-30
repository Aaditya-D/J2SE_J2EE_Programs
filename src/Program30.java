import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Program30 {

	static String url = "";
	static String user = "root";
	static String password = "root";

	public static void main(String[] args) {

		String query = "select * from students";

		try (Connection con = DriverManager.getConnection(url, user, password);
				Statement st = con.createStatement();) { // Connection created using try with multiple resources
			try {
				ResultSet rs = st.executeQuery(query);// ResultSet handles the rows
				while (rs.next()) {
					System.out.println("Name:" + rs.getString("name"));
					System.out.println("Age:" + rs.getString("age"));
				}
			} catch (Exception e) {
				e.getMessage();
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
