import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRecords {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver load....");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch136","root","root");
        System.out.println("Connection Done");
		
        Statement st=con.createStatement();
        
        String delete="delete from student where id=103";
        
        st.executeUpdate(delete);
        
        System.out.println("Data Deleted..."+delete);
        
	}
}
