package text;

import java.util.Scanner;

public class Menu {
	public int stuID;
	public String stuName;
	public int stuAge;
	public double stuScore;
	private Scanner scanner = new Scanner(System.in);
	public void add(){
		System.out.println("请输入添加的学生信息");
		System.out.println("输入学号");
		stuID = scanner.nextInt();
		System.out.println("输入姓名");
		stuName = scanner.next();
		System.out.println("输入年龄");
		stuAge = scanner.nextInt();
		System.out.println("输入成绩");
		stuScore = scanner.nextDouble();
	}
	public void delete(){
		System.out.println("请输入需要删除的学号");
		stuID = scanner.nextInt();
	}
	public int read(){
		System.out.println("请输入学生学号");
		stuID = scanner.nextInt();
		return stuID;
	}

}
