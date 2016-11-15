package com.iterator.zx;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorTest {

	/**
	 * 熟悉一个ArrayList的用法。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> book = new ArrayList<String>();
        book.add("C语言");
        book.add("数据结构");
        book.add("JAVA开发实战经典");
        ListIterator<String> iter =book.listIterator();   //实例化 Listlterator接口
        System.out.print("遍历后输出为：");
        //进行Iterator的遍历
        while(iter.hasNext()){	
        	//取出内容
        String str =iter.next();
        System.out.print(str+"、");
        if(str.equals("数据结构")){
        	iter.remove();
        }
	} 
        System.out.println("");
        System.out.println("删除后的集合为"+book);
	}
}
