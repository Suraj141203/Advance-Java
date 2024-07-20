package com.in.rays.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestInsert {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
        
	 PreparedStatement pstmt = conn.prepareStatement("insert into marksheet values(9, 1009, 'Ritik', 50, 60, 34)");
		
		int i = pstmt.executeUpdate();	
		
	System.out.println("Insert Sucess "+ i);
	}

}
