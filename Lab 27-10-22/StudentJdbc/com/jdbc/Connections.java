package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connections {

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
		}
		catch(Exception e) {
			System.out.println(e);
		}	
	}
	public static Connection conn() throws SQLException{
		return    DriverManager.getConnection( "jdbc:mysql://localhost:3306/arnab","root","root");//creating connection
		 
	}
	
}