package java8certification;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;


public class JDBCExample {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:port/dbname";
		String user = "root";
		String password = "pass";
		
		try(Connection con = DriverManager.getConnection(url, user, password)){
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from book");
			while(rs.next()) {
				System.out.println(rs.getString("title"));
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		String url 		= "jdbc:mysql://localhost:3306/reactlibrarydatabase";
		String user 	= "root";
		String password = "NewYear@2022";
		try(Connection con = DriverManager.getConnection(url, user, password)){
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from book");
			
			while(rs.next()) {
				System.out.println("Book Title: "+rs.getString("title"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
