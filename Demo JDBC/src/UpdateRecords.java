import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateRecords {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver load....");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch136","root","root");
        System.out.println("Connection Done");
		
        Statement st=con.createStatement();
        
        String update="update student set name='java' where id=103"; 
        
           st.executeUpdate(update);
        
           System.out.println("Data Updated..."+update);
	}
}
