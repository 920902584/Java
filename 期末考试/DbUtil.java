package text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbUtil {
	private static String jdbcName = "com.mysql.jdbc.Driver";   //��������
	private static String dbUrl = "jdbc:mysql://localhost:3306/mybook";  //���ݿ��ַ
	private static String dbUserName = "root";    //�û���
	private static String dbPassWord = "123456";   //����
	
	/**
	 * ��ȡ���ݿ�����
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
