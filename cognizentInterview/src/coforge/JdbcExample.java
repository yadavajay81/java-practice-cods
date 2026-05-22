package coforge;

import java.sql.*;

public class JdbcExample {
	
	public static void main(String args[]) {
		try {
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/spring-boot-curd-repository-demo", 
				"ecommerceapp", 
				"ecommerceapp");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from product");
		
		while(rs.next()) {
			
			System.out.println(rs.getInt("ID"));
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}