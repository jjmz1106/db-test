package db;

import java.sql.*;

public class DBTest2 {
	
	public static void main(String[] args) {
		Connection con = null;	
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522/xe","c##test","test");
			String sql = "select num, name, etc from user_info";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt("num") + ","+ rs.getString("name")+","+ rs.getString("etc"));
			}
		}catch (Exception e) {
			e.printStackTrace();			
		}finally {
			try {
				rs.close();
				stmt.close();
				rs.close();				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
