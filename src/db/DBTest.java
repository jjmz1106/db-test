package db;

import java.sql.*;

public class DBTest {
	
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OrcleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522/xe","c##test","test");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
/*
 * 테이블 이름 : user_info
 * 컬럼 정보
 * 1) num number 10자리
 * 2) name verchar2 20byte
 * 3) etc varchar2 2000byte
 * 
 * create table user_info(
 *num number(10),
 *name varchar2(20),
 *etc varchar2(2000)
 *);
 *
 * 스왑
 * 자바의 장점
 * 1.wora
 * 2.wore
 */