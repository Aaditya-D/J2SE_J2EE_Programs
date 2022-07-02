import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class Program31 {

	static String query = " INSERT INTO students (Name, Age) VALUES (?, ?) "; // query with placeholder ?

	static void preparedStatement() {
		PreparedStatement ps = null;

		try (Connection con = DriverManager.getConnection(Program30.url, Program30.user, Program30.password)) {
			
			ps = con.prepareStatement(query);// Prepared statement created
			ps.setString(1, "John");// setting string at 1st placeholder
			ps.setInt(2, 20);// setting integer at 2nd placeholder
			int rs1 = ps.executeUpdate();
			if (rs1 > 0) {
				System.out.println("Rows affected: " + rs1);
			} else {
				System.out.println("Rows not affected");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	static void batch() {
		Statement st = null;
		
		try (Connection con = DriverManager.getConnection(Program30.url, Program30.user, Program30.password)) {
			con.setAutoCommit(false);// Groups multiple Statements under the same transaction. This transaction will be committed when connection.commit() is invoked
			
			st = con.createStatement();// statement created
			st.addBatch("INSERT INTO students (Name, Age) VALUES ('Elon Musk', 30)");
			st.addBatch("INSERT INTO students (Name, Age) VALUES ('Bill Gates', 40)");
			st.addBatch("INSERT INTO students (Name, Age) VALUES ('Sundar pichai', 30)");
			st.addBatch("INSERT INTO students (Name, Age) VALUES ('Ratan Tata', 60)");
			int[] updatedrows = st.executeBatch();// executes the batch
			con.commit();// Transactions saved
			System.out.println("Rows Updated: " + Arrays.toString(updatedrows));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		preparedStatement();
		batch();
	}
}
