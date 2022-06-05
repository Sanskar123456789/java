package com.projectfiles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class deleteQuery {
	
Connection con;
	
	public void createconnection() throws ClassNotFoundException, SQLException {
		DataConn obj = new DataConn();
		con = obj.getconn();
		if(con!=null) {
			System.out.println("Connected");
		}else {
			System.out.println("Not Connected");
		}
	}
	
	public void deleteSubject(int id) throws SQLException {
		String sql = "delete from subjects where Subject_id = "+id;
		PreparedStatement ps = con.prepareStatement(sql);
		boolean res = ps.execute();
		if(res) {			
			System.out.println(res);
		}else {
			System.out.println(res);
		}
		//System.out.println(res);
		ps.close();
	}
	
	public void deleteTeacher(int id) throws SQLException {
		String sql = "delete from teacher where Teacher_id = "+id;
		PreparedStatement ps = con.prepareStatement(sql);
		boolean res = ps.execute();
		if(res) {			
			System.out.println(res);
		}else {
			System.out.println(res);
		}
		ps.close();
	}
	
	public void deleteClass(int id) throws SQLException {
		String sql = "delete from class where Class_id = "+id;
		PreparedStatement ps = con.prepareStatement(sql);
		boolean res = ps.execute();
		if(res) {			
			System.out.println(res);
		}else {
			System.out.println(res);
		}
		//System.out.println(res);
		ps.close();
	}
	
	public void deleteStudent(int id) throws SQLException {
		String sql = "delete from student where S_id = "+id;
		PreparedStatement ps = con.prepareStatement(sql);
		boolean res = ps.execute();
		if(res) {			
			System.out.println(res);
		}else {
			System.out.println(res);
		}
		//System.out.println(res);
		ps.close();
	}
	public void closeconn() throws SQLException {
		con.close();
	}

}
