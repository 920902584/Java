package com.z.zx;

public class Student {
     private String name;
     private int age;
     private double score;
     
     public Student(String name,int age,double score){
    	 this.name = name;
    	 this.age= age;
    	 this.setScore(score);
     }
     @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return  name + age + "Ëê"+ getScore() + "·Ö" ;
    }
	
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
}
