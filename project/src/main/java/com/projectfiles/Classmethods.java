package com.projectfiles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Classmethods {
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
	
	public ArrayList<classstr> getAllTeacher() throws SQLException,ClassNotFoundException {
		DataConn obj = new DataConn();
		con = obj.getconn();
		ArrayList<classstr> list= new ArrayList<>();
		String sql = "select * from class";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet res = ps.executeQuery();
		while(res.next()) {
			classstr t = new classstr();
			t.set_Classid(res.getInt(1));
			t.set_Class_name(res.getString(2));
			list.add(t);
		}
		ps.close();
		return list;
	}
	
	public boolean newClass(String class_name) throws SQLException {
		int class_id=0;
		String sql = "select max(class_id) from class";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet res = ps.executeQuery();
		while(res.next()) {
			class_id=res.getInt(1);
		}
		ps.close();
		class_id +=1; 
		String sql1 = "insert into class values(?,?)";
		PreparedStatement ps1 = con.prepareStatement(sql1);
		ps1.setInt(1, class_id);
		ps1.setString(2, class_name);
		int re = ps1.executeUpdate();
		ps1.close();
		if(re>0) {
			System.out.println("Inserted");
			return true;
		}else {
			System.out.println("Not Inserted");
			return false;
		}
	}
	
	public boolean deleteClass(int class_id) throws SQLException {
		String sql = "DELETE FROM class WHERE class_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(0, class_id);
		int res = ps.executeUpdate();
		ps.close();
		if(res>0) {
			System.out.println("Deleted");
			return true;
		}else {
			System.out.println("Not Deleted");
			return false;
		}
	}
	
	public boolean updateClass(int class_id,String Class_name) throws SQLException {
		String sql = "update class set class_name=? where class_id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(0, Class_name);
		ps.setInt(1, class_id);
		int res = ps.executeUpdate();
		ps.close();
		if(res<0) {
			System.out.println("Updated");
			return true;
		}else {
			System.out.println("Not Updated");
			return false;
		}
		
	}

}
