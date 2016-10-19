package com.ja.zx;

public class Outer3 {
	 public void print(){
		   class Inner3{
			   public void print() {
				System.out.println("局部内部类运行了");
			}
			   
		   } 
		  Inner3 p3 = new Inner3();
		  p3.print();
	 }
}
