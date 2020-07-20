package db;

import java.sql.*;

public class DBTest3 {
	
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522/xe","c##test","test");
			String sql = "insert into user_info(num, name, etc)";
			sql += " values(?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, 1);
			ps.setString(2, "이름");
			ps.setString(3, "기본");
			ps.executeUpdate();
			sql = "update user_info set name=?, etc=? where num=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, "테스트");
			ps.setString(2, "비고");
			ps.setInt(3, 1);
			ps.executeUpdate();
			sql = "delete from user_info were num=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1,1);
			ps.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
			ps.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

}
