package text;

import java.util.Scanner;

public class Menu {
	public int stuID;
	public String stuName;
	public int stuAge;
	public double stuScore;
	private Scanner scanner = new Scanner(System.in);
	public void add(){
		System.out.println("��������ӵ�ѧ����Ϣ");
		System.out.println("����ѧ��");
		stuID = scanner.nextInt();
		System.out.println("��������");
		stuName = scanner.next();
		System.out.println("��������");
		stuAge = scanner.nextInt();
		System.out.println("����ɼ�");
		stuScore = scanner.nextDouble();
	}
	public void delete(){
		System.out.println("��������Ҫɾ����ѧ��");
		stuID = scanner.nextInt();
	}
	public int read(){
		System.out.println("������ѧ��ѧ��");
		stuID = scanner.nextInt();
		return stuID;
	}

}
