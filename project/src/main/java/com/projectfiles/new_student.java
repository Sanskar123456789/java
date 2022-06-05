package com.projectfiles;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class new_student {
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
	
	public boolean newStudent(String St_name,int sub_id) throws SQLException {
		int Subject_id=0;
		String sql = "select max(S_id) from student";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet res = ps.executeQuery();
		while(res.next()) {
			Subject_id=res.getInt(1);
		}
		ps.close();
		Subject_id +=1; 
		String sql1 = "insert into student values(?,?,?)";
		PreparedStatement ps1 = con.prepareStatement(sql1);
		ps1.setInt(1, Subject_id);
		ps1.setString(2, St_name);
		ps1.setInt(3,sub_id);
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
	
	public boolean deleteStudent(int sub_id) throws SQLException {
		String sql = "DELETE FROM student WHERE S_id = ?";
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
