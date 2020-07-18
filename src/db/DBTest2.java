package db;

import java.sql.*;

public class DBTest2 {
	
	public static void main(String[] args) {
			
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522/xe","c##test","test");
			String sql = "select num, name, etc from user_info";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt("num") + ","+ rs.getString("name")+","+ rs.getString("etc"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}	
	}
}
/*테이블 이름 : user_info
* 컬럼 정보
* 1) num number 10자리
* 2) name verchar2 20byte
* 3) etc varchar2 2000byte
* 
* create table user_info(
* num number(10),
* name varchar2(20),
* etc varchar2(2000)
* );
*
* wora - 라이트,원스,런,에니웨어 
* wore - 라이트,원스,런,에브리웨어
* 
* 오버라이딩
* 1) 접근제어자를 상위 클래스보다 더 작은 범위로 만들수 있다.		
* 2) 리턴타입이 달라야 한다.		
* 3) 파라메터의 갯수가 달라야 한다.		
* 4) 오버라이딩은 상속에서만 가능한 개념이다.
* 
* 오버로딩
* 1) 접근제어자자가 달라도 상관이 없다.	
* 2) 리턴타입은 상관이 없다.		
* 3) 파라메터의 갯수가 달라야 한다.		
* 4) 오버로딩은 한  클래스 내에서 가능한 개념이다.
*/