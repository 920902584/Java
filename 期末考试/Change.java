package text;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;





public class Change {
	private static DbUtil dbUtil = new DbUtil();
	public  int addBook(Student student) throws Exception{
		Connection con = dbUtil.getCon();
		String sql = "insert into student values ("+student.getStuID()+",'"+student.getStuName()+"',"+student.getStuAge()+","+student.getStuScore()+")";
		Statement stm = con.createStatement();  //´´½¨Statement
		int result = stm.executeUpdate(sql);
		dbUtil.close(stm, con);
		return result;	
	}
	public int deleteBook(int stuID) throws Exception{
		Connection con = dbUtil.getCon();
		/**
		 * É¾³ý²Ù×÷
		 */
		String sql = "delete from student where stuID=" +stuID;
		Statement stm = con.createStatement();
		int result = stm.executeUpdate(sql);
		dbUtil.close(stm, con);
		return result;
	}
	public

}
