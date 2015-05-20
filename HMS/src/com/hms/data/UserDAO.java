package com.hms.data;


//this class will create a userdao object with the information coming from the web
//and insert the userdao in the user table
public class UserDAO {
	
	private String name = "Joe";
	private int age = 32;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	//this method will insert into database
	public void insert() {

		
	}
	
	

}
