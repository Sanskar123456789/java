package com.projectfiles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class all_data {
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
	
	public ArrayList<struct> getAllStudent() throws SQLException {
		ArrayList<struct> list= new ArrayList<>();
		String sql = "select student.S_id,student.Stud_name,subjects.Subject_name,teacher.Teacher_name,class.Class_name from student join subjects on student.sub_id=subjects.Subject_id join teacher on subjects.Teacher_id=teacher.Teacher_id join class on subjects.Class_id = class.Class_id;";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet res = ps.executeQuery();
		System.out.println(res);
		while(res.next()) {
			struct t = new struct();	
			t.setStudent_id(res.getInt(1));
			t.setStudent_name(res.getString(2));
			t.setSubject_name(res.getString(3));
			t.setTeacher_name(res.getString(4));
			t.setClass_name(res.getString(5));
			list.add(t);
		}
		System.out.println(list);
		ps.close();
		return list;
	}
	
	public ArrayList<teacher_struct> getAllTeacher() throws SQLException {
		ArrayList<teacher_struct> list= new ArrayList<>();
		String sql = "select * from teacher";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet res = ps.executeQuery();
		System.out.println(res);
		while(res.next()) {
			teacher_struct t = new teacher_struct();			
			t.setT_Id(res.getInt(1));
			t.setT_name(res.getString(2));
			list.add(t);
		}
		System.out.println(list);
		ps.close();
		return list;
	}
	
	public ArrayList<Class_struct> getAllClass() throws SQLException {
		ArrayList<Class_struct> list= new ArrayList<>();
		String sql = "select * from class";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet res = ps.executeQuery();
		System.out.println(res);
		while(res.next()) {
			Class_struct t = new Class_struct();			
			t.setT_Id(res.getInt(1));
			t.setT_name(res.getString(2));
			list.add(t);
		}
		System.out.println(list);
		ps.close();
		return list;
	}
	
	public ArrayList<sub_structure> getAllSubject() throws SQLException {
		ArrayList<sub_structure> list= new ArrayList<>();
		String sql = "select subjects.Subject_id, subjects.Subject_name,teacher.Teacher_name,class.Class_name from subjects join teacher on subjects.Teacher_id=teacher.Teacher_id join class on subjects.Class_id = class.Class_id;";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet res = ps.executeQuery();
		System.out.println(res);
		while(res.next()) {
			sub_structure t = new sub_structure();			
			t.setStudent_name(res.getInt(1));
			t.setSubject_name(res.getString(2));
			t.setTeacher_name(res.getString(3));
			t.setClass_name(res.getString(4));
			list.add(t);
		}
		System.out.println(list);
		ps.close();
		return list;
	}
	
	
	public void closeconn() throws SQLException {
		con.close();
	}
	
	
}
