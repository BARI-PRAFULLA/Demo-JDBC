package DemoStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DemoStatement {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch136", "root", "root");

		Statement statement = con.createStatement();

		String insert1 = "insert into student values(105,'Ads')";
		statement.executeUpdate(insert1);
		System.out.println("Done");
	}
}