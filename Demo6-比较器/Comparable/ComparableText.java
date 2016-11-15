package com.z.zx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparableText {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TreeSet<Student> ts = new TreeSet<Student>();
       ts.add(new Student("张三",15,86));
       ts.add(new Student("李四",13,76));
       ts.add(new Student("王五",14,96));
       ts.add(new Student("赵六",12,88));
       System.out.println(ts);
	}
}


