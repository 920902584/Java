package com.zx.once;
import java.util.Arrays;
public class Onece {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Student stu[]= {new Student(1,"张三",20),new Student(2,"李四",15),
				new Student(3,"王五",18),new Student(4,"赵六",17)};
          StudentComparator sc=new StudentComparator();
          Arrays.sort(stu,sc);
          for(int i=0;i<stu.length;i++){
        	  System.out.println(stu[i]);
          }
	}
      
}
