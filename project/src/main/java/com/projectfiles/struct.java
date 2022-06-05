package com.projectfiles;

public class struct {
	private int Student_id;
	private String subject_name;
	private String Student_name;
	private String Teacher_name;
	private String Class_name;
	
	public int gets_id() {
		return Student_id;
	}
	
	public String getClass_name() {
		return Class_name;
	}
	public String getStudent_name() {
		return Student_name;
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
	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}
	public void setTeacher_name(String teacher_name) {
		Teacher_name = teacher_name;
	}
	
	public void setStudent_id(int id) {
		Student_id=id;
	}
}
