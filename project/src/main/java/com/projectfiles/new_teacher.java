package com.projectfiles;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class new_teacher {
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
	
	public ArrayList<teacher> getAllTeacher() throws SQLException {
		ArrayList<teacher> list= new ArrayList<>();
		String sql = "select * from teacher";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet res = ps.executeQuery();
		while(res.next()) {
			teacher t = new teacher();
			System.out.println("hello"+res.getInt(1));
			
			t.set_sid(res.getInt(1));
			t.set_stud_name(res.getString(2));
			list.add(t);
		}
		ps.close();
		return list;
	}
	
	public boolean newTeacher(String teacher_name) throws SQLException {
		int teacher_id=0;
		String sql = "select max(Teacher_id) from teacher";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet res = ps.executeQuery();
		while(res.next()) {
			teacher_id=res.getInt(1);
		}
		ps.close();
		teacher_id +=1; 
		String sql1 = "insert into teacher values(?,?)";
		PreparedStatement ps1 = con.prepareStatement(sql1);
		ps1.setInt(1, teacher_id);
		ps1.setString(2, teacher_name);
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
	
	public boolean deleteTeacher(int teacher_id) throws SQLException {
		String sql = "DELETE FROM teacher WHERE Teacher_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(0, teacher_id);
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
	
	public boolean updateTeacher(int teacher_id,String Teacher_name) throws SQLException {
		String sql = "update teacher set Teacher_name=? where Teacher_id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(0, Teacher_name);
		ps.setInt(1, teacher_id);
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

	public void closeconn() throws SQLException {
		con.close();
	}
}
