package DemoPreparedStatement;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DemoPreparedStatement {
	

	public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");

	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch136","root","root");
   
     PreparedStatement ps=con.prepareStatement("insert into student(id,name) values(?,?)");
       
     ps.setInt(1, 107);
     ps.setString(2, "vimal");
     ps.executeUpdate();
     
     ps.setInt(1, 108);
     ps.setString(2, "hari");
     ps.executeUpdate();
     
     ps.setInt(1, 109);
     ps.setString(2, "prasad");
     ps.executeUpdate();
     
     ps.setInt(1, 110);
     ps.setString(2, "baake");
     ps.executeUpdate();
     System.out.println("Done");
     
 /*    ResultSet rs=ps.executeQuery();
     
     System.out.println("******Student Table*******");
     
     
     while (rs.next()){
     System.out.println(rs.getInt(1)+" "+rs.getString(2));
     */
}
}