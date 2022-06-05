package com.projectfiles;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class new_subject {
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
	
	public ArrayList<subject> getAllSubject() throws SQLException {
		ArrayList<subject> list= new ArrayList<>();
		String sql = "select * from subjects";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet res = ps.executeQuery();
		System.out.println(res);
		while(res.next()) {
			subject t = new subject();			
			t.set_sid(res.getInt(1));
			t.set_stud_name(res.getString(2));
			list.add(t);
		}
		System.out.println(list);
		ps.close();
		return list;
	}
	
	
	public boolean newSubject(String Subject_name,int Teacher_id,int Class_id) throws SQLException {
		int Subject_id=0;
		String sql = "select max(Subject_id) from subjects";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet res = ps.executeQuery();
		while(res.next()) {
			Subject_id=res.getInt(1);
		}
		ps.close();
		Subject_id +=1; 
		String sql1 = "insert into subjects values(?,?,?,?)";
		PreparedStatement ps1 = con.prepareStatement(sql1);
		ps1.setInt(1, Subject_id);
		ps1.setString(2, Subject_name);
		ps1.setInt(3,Class_id);
		ps1.setInt(4,Teacher_id);
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
	
	public boolean deleteSubject(int sub_id) throws SQLException {
		String sql = "DELETE FROM subjects WHERE Subject_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(0, sub_id);
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
	
	public void closeconn() throws SQLException {
		con.close();
	}
}
