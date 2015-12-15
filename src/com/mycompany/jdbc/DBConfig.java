package com.mycompany.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {
	//private constants
	private static final String USERNAME="saleem";
	private static final String PASSWORD="123456";
	private static final String CONN_STRING="jdbc:mysql://localhost:90/moviedb";
	
	//utility method that connect to mysqldatabase
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(USERNAME, PASSWORD, CONN_STRING);
	}

	//utility method to display our errors in more detail
	public static void displayException(SQLException exception){
		System.err.print("Error Message: " + exception.getMessage());
		System.err.print("Error Code: " + exception.getErrorCode());
		System.err.print("SQL State: " + exception.getSQLState());
		
	}
}
