package com.projectfiles;

public class sub_structure {
	private String subject_name;
	private int Subid;
	private String Teacher_name;
	private String Class_name;
	
	public String getClass_name() {
		return Class_name;
	}
	public int getStudent_name() {
		return Subid;
	}
	public String getSubject_name() {
		return subject_name;
	}
	public String getTeacher_name() {
		return Teacher_name;
	}
	public void setClass_name(String class_name) {
		Class_name = class_name;
	}
	public void setStudent_name(int student_name) {
		Subid = student_name;
	}
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}
	public void setTeacher_name(String teacher_name) {
		Teacher_name = teacher_name;
	}
}
