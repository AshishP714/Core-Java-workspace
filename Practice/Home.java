package Practice;

import java.sql.*;

public class Home {

	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","Ashish@15");
		
		if(con != null) {
			System.out.println("Connection successful");
			PreparedStatement st = con.prepareStatement("select * from student where roll = 1");
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt("roll") +"  "+ rs.getString("name") +"  "+ rs.getString("subject"));
			}
		} else {
			System.out.println("Connection un-successful");
		}
	}
}
