package com.jdbc;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Students {	//main class
	//declare instances variable
	int studentid;
	String studentName;

	public static void main(String... args) {	//main method
		Scanner sc = new Scanner(System.in);	//creating scanner class object
		System.out.println("Enter Student id : ");
		int studentid = sc.nextInt();	//user input for id
		System.out.println("Enter Student name : ");
		String studentName = sc.next();	//user input for name
		try {
		Connection conn = Connections.conn();  //Creating connection
		PreparedStatement pst; 
		String sql="insert into student values(?,?)";
		pst = conn.prepareStatement(sql);//preparing connection
		pst.setInt(1, studentid );	//set value
		pst.setString(2, studentName);	//set value
        	pst.execute();	//execute the query
		conn.close();	//close connection
		  System.out.println("value inserted successfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}
			
	}
	
	}