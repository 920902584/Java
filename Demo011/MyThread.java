﻿package com.fjsf.zx;

public class MyThread extends Thread{
	 @Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 10000; i++){
			System.out.println("MyThread: "+i);
		}
	}
}
