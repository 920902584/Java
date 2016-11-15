package com.z.zx;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student stu1, Student stu2) {
		// TODO Auto-generated method stub
		if(stu1==stu2){
		 return 0;
		}
		if(stu1.getScore()>stu2.getScore()){
		return 1;
		}else if(stu1.getScore()<stu2.getScore()){
		return -1;
		}else{
		return 0;
		}
	}

}
