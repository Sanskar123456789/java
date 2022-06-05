package com.projectfiles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class editQuery {
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
	
	public void editSubject(int id,String name,int c_id,int t_id) throws SQLException {
		String sql = "update subjects set Subject_name=? Class_id=? Teacher_id=? where Subject_id = "+id;
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,name);
		ps.setInt(2, c_id);
		ps.setInt(3, t_id);
		boolean res = ps.execute();
		if(res) {			
			System.out.println(res);
		}else {
			System.out.println(res);
		}
		//System.out.println(res);
		ps.close();
	}
	
	public void editTeacher(int id,String name) throws SQLException {
		String sql ="update teacher set Teacher_name=? where Teacher_id = "+id;
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		boolean res = ps.execute();
		if(res) {			
			System.out.println(res);
		}else {
			System.out.println(res);
		}
		ps.close();
	}
	
	public void editClass(int id,String name) throws SQLException {
		String sql ="update class set Class_name=? where Class_id = "+id;
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		boolean res = ps.execute();
		if(res) {			
			System.out.println(res);
		}else {
			System.out.println(res);
		}
		ps.close();
	}
	
	public void editStudent(int id,String name, int s_id) throws SQLException {
		System.out.println(id + name + s_id);
		String sql = "update student set Stud_name=?, sub_id=? where S_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setInt(2, s_id);
		ps.setInt(3, id);
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
