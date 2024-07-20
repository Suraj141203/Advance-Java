package com.in.rays.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestJdbc {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");

		Statement stmt = conn.createStatement();

		//int i = stmt.executeUpdate("insert into marksheet values (7, 1007 , 'Aryan', 80,70,60)");
        int i = stmt.executeUpdate("update marksheet set name = 'Madhu' where id = 4");
	    //int i = stmt.executeUpdate("delete from marksheet where name = 'Priyanka'");
		//int i = stmt.executeUpdate("create table members(no int primary key, name varchar(50))");
		System.out.println("table created" + i);
	}
}