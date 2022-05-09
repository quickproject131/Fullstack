package com.backend.entites;

public class Student {

	int regno;
	String name;
	String branch;
	String email;
	int number;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int regno, String name, String branch, String email, int number) {
		super();
		this.regno = regno;
		this.name = name;
		this.branch = branch;
		this.email = email;
		this.number = number;
	}
	
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	
}
