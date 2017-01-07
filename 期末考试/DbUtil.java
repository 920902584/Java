package text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbUtil {
	private static String jdbcName = "com.mysql.jdbc.Driver";   //驱动名称
	private static String dbUrl = "jdbc:mysql://localhost:3306/mybook";  //数据库地址
	private static String dbUserName = "root";    //用户名
	private static String dbPassWord = "123456";   //密码
	
	/**
	 * 获取数据库连接
	 * @return
	 * @throws Exception
	 */
	public Connection getCon() throws Exception{
		Class.forName(jdbcName);
	    Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassWord);
		return conn;
		
	}
	
	public void close(Statement stm,Connection con) throws Exception{
		if(stm !=null ){
			stm.close();
			if(con != null){
				con.close();
			}
		}
	}

}
