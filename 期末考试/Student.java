package text;

public class Student {
	private  int stuID;
	private String stuName;
	private int stuAge;
	private double stuScore;
	public Student(int stuID,String stuName,int stuAge,double stuScore){
		this.stuID = stuID;
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.stuScore = stuScore;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ѧ�ţ�"+this.stuID+"  ������"+this.stuName+"  ���䣺"+this.stuAge+"  �ɼ�"+this.stuScore;
	}
	public int getStuID() {
		return stuID;
	}
	public void setStuID(int stuID) {
		this.stuID = stuID;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	public double getStuScore() {
		return stuScore;
	}
	public void setStuScore(double stuScore) {
		this.stuScore = stuScore;
	}

}
