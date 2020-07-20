package db;

import java.sql.*;

public class Connector {
	
		private static final String URL = "jdbc:oracle:thin:@localhost:1522/xe";
		private static final String ID = "c##test";
		private static final String PWD = "test";
		private static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";

		static {
			try {
				Class.forName(DRIVER_NAME);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}

		public static Connection open() {
			try {
				Connection con =  DriverManager.getConnection(URL, ID, PWD);
				con.setAutoCommit(false);
				return con;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}
		public static void main(String[] args) {
			System.out.println("잘됨?");
			System.out.println(open());
			
		}
	}

/*테이블 이름 : user_info
* 컬럼 정보
* 1) num number 10자리 primary key
* 2) name verchar2 20byte not null
* 3) etc varchar2 2000byte not null
* 
* create table user_info(
* num number(10,0) not null,
* name varchar2(20) not null,
* etc varchar2(2000)not null,
* primary key (num)
* );
*
* 문자열 숫자로 변환
* String str = "1234";
* int i = Integer.parseInt(str);
*
* wora - 라이트,원스,런,에니웨어 
* wore - 라이트,원스,런,에브리웨어
* 
* 오버로딩
* ojdbc8 다운
*/