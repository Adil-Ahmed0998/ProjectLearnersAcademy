package com.ecommerce;

public class ClassReport{
	private int ID;
	private String Roll;
	private String student;
	private String classes;
	private String subject;
	private String teacher;
	public ClassReport() {
		//super();
		// TODO Auto-generated constructor stub
	}
	public ClassReport(int iD, String roll, String student, String classes, String subject, String teacher) {
		//super();
		this.ID = iD;
		this.Roll = roll;
		this.student = student;
		this.classes = classes;
		this.subject = subject;
		this.teacher = teacher;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getRoll() {
		return Roll;
	}
	public void setRoll(String roll) {
		Roll = roll;
	}
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	
	
	
	
}
