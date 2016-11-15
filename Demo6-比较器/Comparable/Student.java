package com.z.zx;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double score;
    
    
	public  Student(String name,int age,double score){
    	this.name= name;
    	this.age = age;
    	this.score = score;
    }
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "姓名："+name+" 年龄："+age+" 成绩："+score;
    }

	@Override
	public int compareTo(Student stu) {
		// TODO Auto-generated method stub
		if(this.age>stu.age){
			return 1;
		}else if(this.age<stu.age){
			return -1;
		}else{
			return 0;
		}
	}
}
