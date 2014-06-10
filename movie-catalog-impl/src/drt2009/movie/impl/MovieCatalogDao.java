package drt2009.movie.impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class MovieCatalogDao {
	
	public static MovieCatalogDao getInstance(){
		return new MovieCatalogDao();
	}
	
	private MovieCatalogDao(){
		
	}
	
	private Connection getConnection(){
		Connection con = null;
		
		return con;
	}
	
	private Connection properties(){
		 Properties prop=new Properties();
         try(FileInputStream in = new FileInputStream(System.getProperty("WEB-INF/dbConnection.properties"))) {
			prop.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

         String database = prop.getProperty("database");
         String connectionURL = prop.getProperty("url");
         String username = prop.getProperty("username");
         String password = prop.getProperty("password");
         try {
			return DriverManager.getConnection(connectionURL,username,password);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
