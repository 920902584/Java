package com.zx.once;

public class Student {
      private int studentID;
      private String name;
      int age;
     //���캯��
      public Student(int studentID, String name, int age) {
    	  this.studentID=studentID;
    	  this.name=name;
    	  this.setAge(age);
	}
	
	 public String toString(){
		return "������������  ѧ�ţ�"+this.studentID+"  ������"+this.name+"  ���䣺"+this.getAge();	 
	 }
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 
     
}
