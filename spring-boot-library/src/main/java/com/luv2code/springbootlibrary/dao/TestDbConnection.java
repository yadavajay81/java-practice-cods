package com.luv2code.springbootlibrary.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDbConnection {

	public static void main(String[] args) {
	    String url = "jdbc:mysql://localhost:3306/reactlibrarydatabase"; //pointing to no database.
	    String username = "root";
	    String password = "NewYear@2022";

	    System.out.println("Connecting to server...");

	    try (Connection connection = DriverManager.getConnection(url, username, password)) {
	        System.out.println("Server connected!");
	        Statement stmt = connection.createStatement();
	        ResultSet resultset = stmt.executeQuery("select * from book");
	        
	        int id;
            String title;
            while (resultset.next()) {
                id = resultset.getInt("id");
                title = resultset.getString("title").trim();
                System.out.println("Id : " + id
                                   + " Title : " + title);
            }
	        
	        

	        try {
	            stmt = connection.createStatement();
	            resultset = stmt.executeQuery("SHOW DATABASES;");

	            if (stmt.execute("SHOW DATABASES;")) {
	                resultset = stmt.getResultSet();
	            }

	            while (resultset.next()) {
	                System.out.println(resultset.getString("Database"));
	            }
	        }
	        catch (SQLException ex){
	            // handle any errors
	            ex.printStackTrace();
	        }
	        finally {
	            // release resources
	            if (resultset != null) {
	                try {
	                    resultset.close();
	                } catch (SQLException sqlEx) { }
	                resultset = null;
	            }

	            if (stmt != null) {
	                try {
	                    stmt.close();
	                } catch (SQLException sqlEx) { }
	                stmt = null;
	            }

	            if (connection != null) {
	                connection.close();
	            }
	        }
	    } catch (SQLException e) {
	        throw new IllegalStateException("Cannot connect the server!", e);
	    }
	}

}
