package java8certification;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

	public static void main(String[] args) {
		
		Properties properties = new Properties();
		String filePath = "config.properties";
		
		try(FileInputStream fis = new FileInputStream(filePath) ){
			properties.load(fis);
			
			String url = properties.getProperty("database.url");
			String username = properties.getProperty("database.username");
			String password = properties.getProperty("database.password");
			
			System.out.println("url: "+url);
			System.out.println("username: "+username);
			System.out.println("password: "+password);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
