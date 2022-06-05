package com.projectfiles;
public class student {
	String stud_name;
	int S_id;
	
	public void set_sid(int id) {
		S_id=id;
	}
	
	public void set_stud_name(String name) {
		stud_name=name;
	}
	
	public String get_stud_name() {
		return stud_name;
	}
	
	public int get_sid() {
		return S_id;
	}
}
