package text;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Text {
	
	private static Scanner in = new Scanner(System.in);
	private static DbUtil dbUtil = new DbUtil();
	/**
	 * @param args
	 * @throws Exception 
	 */
	public  static List<Student> listbook() throws Exception{
		List<Student> booklist = new ArrayList<Student>();
		Connection con = dbUtil.getCon();
		String sql = "select * from student";
		PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(sql);
		ResultSet rs =  pstmt.executeQuery();
		while(rs.next()){
			int stuID = rs.getInt("stuID");
			String stuName = rs.getString("stuName");
			int stuAge = rs.getInt("stuAge");
			double stuScore = rs.getDouble("stuScore");
			Student student = new Student(stuID,stuName,stuAge,stuScore);
			booklist.add(student);
		}
		return booklist;
	}

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		 Change change = new Change();
		 Menu menu = new Menu();
         System.out.println("请选择功能： 1.添加学生  2.删除学生  3.浏览学生  4.查询学生  5.退出");
         while (in.hasNext()) {
 			int sOption = in.nextInt();
 			switch (sOption) {
 			case 1:
 				menu.add();
 				Student student = new Student(menu.stuID, menu.stuName, menu.stuAge, menu.stuScore);
 				int result=change.addBook(student);
 				if(result == 1){
 					System.out.println("添加成功");
 				}else{
 					System.out.println("添加失败");
 				}
 				break;
 			case 2:
 				menu.delete();
 			    change.deleteBook(menu.stuID);
 			    System.out.println("删除成功");
 				break;
 			case 3:
 				List<Student> bookList =listbook();
 			    for (Student student2 : bookList) {
				System.out.println(student2);
			    }
 			    break;
 			case 4:
 				List<Student> bookList1 =listbook();
 				menu.read();
 				Student student2 = new Student(menu.stuID, menu.stuName, menu.stuAge, menu.stuScore);
 			    for (Student student3 : bookList1) {
				if(student2.getStuID()==menu.stuID){
					System.out.println(student3);
				}
				break;
			    }
 			case 5:
 				return;
			default:
				break;
 				}
 			System.out.println("请选择功能： 1.添加学生  2.删除学生  3.浏览学生  4.查询学生  5.退出");
}}

}
