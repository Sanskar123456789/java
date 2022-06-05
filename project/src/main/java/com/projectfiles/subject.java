package com.projectfiles;

public class subject {
	String sub_name;
	int S_id;
	
	public void set_sid(int id) {
		System.out.println(id);
		S_id=id;
	}
	
	public void set_stud_name(String name) {
		System.out.println(name);
		sub_name=name;
	}
	
	public String get_stud_name() {
		return sub_name;
	}
	
	public int get_sid() {
		return S_id;
	}
}
