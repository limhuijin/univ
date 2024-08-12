//import java.sql.*;
//
//public class Ex_20231121 {
//	public static void main(String[] args) {
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			String str = "jdbc:mysql://localhost:3306/student?serverTimezone=Asia/Seoul&useSSL=false";
//			Connection conn = DriverManager.getConnection(str, "root", "1111");
//			System.out.println("DB 연결 완료");
//		} catch(ClassNotFoundException e) {
//			System.out.println("JDBC 드라이버 로드 에러");
//		} catch (SQLException e) {
//			System.out.println("DB 연결 오류");
//		}
//	}
//}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex_20231121 {

	
	
	private static void printData(ResultSet srs, String col1, String col2, String col3) throws SQLException {
		while (srs.next()) {
			if (!col1.equals("")) {
				System.out.print(srs.getString("name"));
			}
			if ((!col2.equals(""))) {
				System.out.print("\t|\t" + srs.getString("id"));
			}
			if ((!col3.equals(""))) {
				System.out.print("\t|\t" + srs.getString("dept"));
			}
			System.out.println();
		}
	}
	
	private static void printTable(Statement stmt) throws SQLException{
		ResultSet srs = stmt.executeQuery("select * from student");
		while(srs.next()) {
			System.out.print(srs.getString("name"));
			System.out.print("\t|" + srs.getString("id"));
			System.out.print("\t|" + srs.getString("dept"));
			System.out.print("\t|" + srs.getString("firstJavaTest"));
			System.out.print("\t|" + srs.getString("lastJavaTest"));
			System.out.print("\t|" + srs.getString("firstXMLTest"));
			System.out.print("\t|" + srs.getString("lastXMLTest"));
			System.out.println();
		}
		
		System.out.println();
	}
	


	   private static void printData(ResultSet srs, String col1, String col2, String col3, String col4, String col5, String col6, String col7) throws SQLException {
	      while (srs.next()) {
	         if (!col1.equals("")) {
	            System.out.print(srs.getString("name"));
	         }
	         if (!col2.equals("")) {
	            System.out.print("\t|\t" + srs.getString("id"));
	         }
	         if (!col3.equals("")) {
	            System.out.print("\t|\t" + srs.getString("dept"));
	         }
	         if (!col4.equals("")) {
	            System.out.print("\t|\t" + srs.getString("javafirst"));
	         }
	         if (!col5.equals("")) {
	            System.out.print("\t|\t" + srs.getString("javalast"));
	         }
	         if (!col6.equals("")) {
	            System.out.print("\t|\t" + srs.getString("xmlfirst"));
	         }
	         if (!col7.equals("")) {
	            System.out.println("\t|\t" + srs.getString("xmllast"));
	         } else {
	            System.out.println();
	         }

	      }
	   }
	
	public static void main(String[] args) {
		Connection conn;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?serverTimezone=Asia/Seoul&useSSL=false", "root", "1111");
			System.out.println("DB 연결 완료");
			stmt = conn.createStatement();

			ResultSet srs = stmt.executeQuery("select * from student");
			//printData(srs, "name", "id", "dept");
			printTable(stmt);
			
			//stmt.executeUpdate("insert into student (name, id, dept) values ('limhuisung', '2260023', 'computer')");
			//stmt.executeUpdate("update student set id='' where name=''");
			//stmt.executeUpdate("delete from student where name=''");
			

		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 에러");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
		
		
	}
}