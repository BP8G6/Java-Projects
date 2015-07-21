package com.advance.spring.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataServiceImpl implements DataService {
	
	private String DATABASE_USER; 
	private String DATABASE_PASSWORD; 
	private String DATABASE_URL; 
	private String DATABASE_DRIVER; 
	
	
	
	public void setDATABASE_USER(String dATABASE_USER) {
		DATABASE_USER = dATABASE_USER;
	}



	public void setDATABASE_PASSWORD(String dATABASE_PASSWORD) {
		DATABASE_PASSWORD = dATABASE_PASSWORD;
	}



	public void setDATABASE_URL(String dATABASE_URL) {
		DATABASE_URL = dATABASE_URL;
	}



	public void setDATABASE_DRIVER(String dATABASE_DRIVER) {
		DATABASE_DRIVER = dATABASE_DRIVER;
	}



	public void printNews()
	{
		
		
		Connection connection =null;
		
		try
		{
			
			Class.forName(DATABASE_DRIVER);
			
			connection=DriverManager.getConnection(DATABASE_URL,DATABASE_USER,DATABASE_PASSWORD);
			Statement  statement = connection.createStatement();
			ResultSet rs=statement.executeQuery("Select * From News");
			while(rs.next())
			{
				System.out.println(rs.getString(3));
				System.out.println("#################################");
			}
		}catch(Exception ex)
		{
			
		}
		finally{
			try{
				
				connection.close();
			}catch(SQLException e)
			{
				
			}
		}
		
	}

}
