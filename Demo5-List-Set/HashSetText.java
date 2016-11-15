package com.hashset.zx;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetText {

	/**
	 * @param args
	 * HashSet：哈希表是通过使用称为散列法的机制来存储信息的，元素并没有以某种特定顺序来存放；  
     * LinkedHashSet：以元素插入的顺序来维护集合的链接表，允许以插入的顺序在集合中迭代；  
     * TreeSet：提供一个使用树结构存储Set接口的实现，对象以升序顺序存储，访问和遍历的时间很快。 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashSet<String> hs = new HashSet<String>();
        hs.add("B");
        hs.add("C");
        hs.add("F");
        hs.add("A");
        hs.add("D");
        hs.add("G");
        hs.add("E");
        System.out.println("HashSet输出顺序\n"+hs);      //输出顺序随机，与添加顺序无关
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("B");
        lhs.add("C");
        lhs.add("F");
        lhs.add("A");
        lhs.add("D");
        lhs.add("G");
        lhs.add("E");
        System.out.println("LinkedHashSet输出顺序\n"+lhs);  //添加的顺序与输出的顺序不改变
        TreeSet<String> ts =new TreeSet<String>();
        ts.add("B");
        ts.add("C");
        ts.add("F");
        ts.add("A");
        ts.add("D");
        ts.add("G");
        ts.add("E");
        System.out.println("TreeSet输出顺序\n"+ts);     //会按对象的升序顺序储存输出
        
	}

}
