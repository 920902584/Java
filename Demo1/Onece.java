package com.zx.once;
import java.util.Arrays;
public class Onece {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Student stu[]= {new Student(1,"����",20),new Student(2,"����",15),
				new Student(3,"����",18),new Student(4,"����",17)};
          StudentComparator sc=new StudentComparator();
          Arrays.sort(stu,sc);
          for(int i=0;i<stu.length;i++){
        	  System.out.println(stu[i]);
          }
	}
      
}
