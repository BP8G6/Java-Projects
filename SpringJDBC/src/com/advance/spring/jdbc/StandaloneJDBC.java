package com.advance.spring.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StandaloneJDBC {
	
	
	private final static String DATABASE_USER="dbuser";
	private final static String DATABASE_PASSWORD="dbpassword";
	private final static String DATABASE_URL="jdbc:postgresql://192.168.1.53:5432/bellinfodevdb";
	private final static String DATABASE_DRIVER_CLASS="org.postgresql.Driver";
	
	
	public static void main(String args[])
	{
		
		Connection connection=null;
		
		try{
			Class.forName(DATABASE_DRIVER_CLASS);
			
			connection=DriverManager.getConnection(DATABASE_URL,DATABASE_USER,DATABASE_PASSWORD);
			Statement statement=connection.createStatement();
			
			String Query="SELECT * FROM NEWS";
			ResultSet result =statement.executeQuery(Query);
			
			while(result.next()){
				System.out.println("#############################################");
				System.out.println("STICKER SYMBOL   "+result.getString(2));
				System.out.println("HeadLines        "+result.getString(3));
				System.out.println("Main Story       "+result.getString(4));
				System.out.println("#############################################");
			}
			
			
		}catch(Exception ex){
			//ex.printStackTrace();
		}
		finally{
			try{
				connection.close();
			}catch(SQLException e){
				//e.printStackTrace();
			}
		}
		
	}

}
