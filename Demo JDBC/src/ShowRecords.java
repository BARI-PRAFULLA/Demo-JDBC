import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowRecords {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver load....");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch136","root","root");
        System.out.println("Connection Done");
		
        Statement st=con.createStatement();
        
        ResultSet rs=st.executeQuery("select * from student");
        while (rs.next()) {
        System.out.println(rs.getInt(1)+" "+rs.getString(2));
	}
}
}