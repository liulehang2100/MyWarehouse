package utils;
/**
 *	获得数据库连接和关闭资源
 * @author 12584
 *
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class DBUtils {
	private static Connection conn;
	/**
	 * 获得数据库连接
	 * @throws Exception 
	 */
	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "1234");
		return conn;
	}
	
	public void closeAll(Connection conn,PreparedStatement pst,ResultSet rs) throws Exception{
		if(rs!=null) {
			rs.close();
		}
		if(pst!=null) {
			pst.close();
		}
		if(conn!=null) {
			conn.close();
		}
	}

}
