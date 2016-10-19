package com.zx.once;

public class Student {
      private int studentID;
      private String name;
      int age;
     //构造函数
      public Student(int studentID, String name, int age) {
    	  this.studentID=studentID;
    	  this.name=name;
    	  this.setAge(age);
	}
	
	 public String toString(){
		return "根据年龄排序：  学号："+this.studentID+"  姓名："+this.name+"  年龄："+this.getAge();	 
	 }
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 
     
}
