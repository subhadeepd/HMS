package com.hms.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//this class will create a userdao object with the information coming from the web
//and insert the userdao in the user table
public class UserDAO {

	DatabaseConnection db = new DatabaseConnection();
	Connection conn = null;
	Statement stmt = null;

	private String name = "Joe";
	private int age = 32;

	public void select() {

		try {
			conn = db.getConnection();
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT name, age FROM Users";
			ResultSet rs = stmt.executeQuery(sql);

 			// STEP 5: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				String name = rs.getString("name");
				int age = rs.getInt("age");
 
				// Display values
				System.out.print("Name: " + name);
				System.out.println(", Age: " + age);
			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}// nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}// end finally try
		}// end try
 
	}

	// this method will insert into database
	public void insert() {

	}

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

}
