package com.projectfiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConn {
	final static String DB_URL="jdbc:mysql://localhost:3306/learners_academy";
	final static String USER_NAME="root";
	final static String PASS="123456";
	
	public Connection getconn() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection(DB_URL,USER_NAME,PASS);
		if(con!=null) {
			System.out.println("Connected");
		}else {
			System.out.println("Not Connected");
		}
		return con;
	}
}
