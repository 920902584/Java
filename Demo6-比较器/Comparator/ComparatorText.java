package com.z.zx;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorText {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Set<Student> ts = new TreeSet<Student>(new StudentComparator());
           ts.add(new Student("����",15,86));
           ts.add(new Student("����",13,76));
           ts.add(new Student("����",14,96));
           ts.add(new Student("����",12,88));
          System.out.println(ts.toString());
	}

}
