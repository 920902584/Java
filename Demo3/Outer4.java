package com.ja.zx;

public class Outer4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//Person 接口中的匿名内部类
			 Person p4=new Person(){
	       	  public void print(){
	       		  System.out.println("匿名内部类运行了");
	       	  }          
	          };
	          
	          Outer1.Inner1 p1=new Outer1().new Inner1();
	          Outer2.Inner2 p2=new Outer2.Inner2();
	          Outer3 p3 = new Outer3();
	          p1.print();
	          p2.print();
	          p3.print();
	          p4.print();
	          
		}
	}


