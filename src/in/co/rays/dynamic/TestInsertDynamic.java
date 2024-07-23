package in.co.rays.dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestInsertDynamic {
	
	public static void main(String[] args) throws Exception {	
	
		//testInsert();
		//testInsert1();
		//testInsert2(13, 1013, "vikas", 78, 90, 87);
		
		MarksheetBean bean = new MarksheetBean();
		
		bean.setId(14);
		bean.setRollNo(1014);
		bean.setName("Ansh");
		bean.setPhysics(35);
		bean.setChemistry(56);
		bean.setMaths(78);
		
		testInsert3(bean);
}

	public static void testInsert() throws Exception {
		
	Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		
		PreparedStatement pstmt =  conn.prepareStatement("insert into marksheet values(11, 1011, 'Is', 56, 67, 87)");
		
		int i = pstmt.executeUpdate();
		
		System.out.println("Data Inserted => " + i);
	}
	
	public static void testInsert1() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			
			PreparedStatement pstmt =  conn.prepareStatement("insert into marksheet values(?, ?, ?, ?, ?, ?)");
			
			pstmt.setInt(1, 12);
			pstmt.setInt(2, 1012);
			pstmt.setString(3, "Hritik");
			pstmt.setInt(4, 57);
			pstmt.setInt(5 , 67);
			pstmt.setInt(6, 78);
			
			int i = pstmt.executeUpdate();
			
			System.out.println("Data Inserted => " + i);
	
			}
	
	public static void testInsert2(int id, int rollNo , String name , int physics, int chemistry , int maths) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			
			PreparedStatement pstmt =  conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");
			
			pstmt.setInt(1, id);
            pstmt.setInt(2, rollNo);
            pstmt.setString(3, name);
            pstmt.setInt(4, physics);
            pstmt.setInt(5, chemistry);
            pstmt.setInt(6 , maths);
            
			int i = pstmt.executeUpdate();
			
			System.out.println("Data Inserted => " + i);
	
}
	
	public static void testInsert3(MarksheetBean bean) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			
			PreparedStatement pstmt =  conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");
			
			pstmt.setInt(1, bean.getId());
            pstmt.setInt(2, bean.getRollNo());
            pstmt.setString(3, bean.getName());
            pstmt.setInt(4, bean.getPhysics());
            pstmt.setInt(5, bean.getChemistry());
            pstmt.setInt(6 , bean.getMaths());
            
			int i = pstmt.executeUpdate();
			
			System.out.println("Data Inserted => " + i);
	}
	}