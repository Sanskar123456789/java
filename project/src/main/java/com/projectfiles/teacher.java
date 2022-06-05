package com.projectfiles;
public class teacher {
	String Teacher_name;
	int T_id;
	
	public void set_sid(int id) {
		System.out.println(id);
		T_id=id;
	}
	
	public void set_stud_name(String name) {
		System.out.println(name);
		Teacher_name=name;
	}
	
	public String get_stud_name() {
		return Teacher_name;
	}
	
	public int get_sid() {
		return T_id;
	}
}
