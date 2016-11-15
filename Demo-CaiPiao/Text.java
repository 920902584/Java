package com.fjsfdx.zx;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Text {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rand[] = new int[5];        //定义一个可以储存5个数字的数组
		Random random = new Random();   //实例化随机数
		System.out.print("随机数为：");
		for (int i = 0; i < 5; i++) {
			rand[i] = random.nextInt(10);   //生成随机数，并赋值给  rand[i] 数组
			System.out.print(+rand[i]);     //输出随机数
		}
		Scanner scanner = new Scanner(System.in);    //界面输入
		System.out.println();
		System.out.println("——————请输入竞猜五个数字（一位数）——————");
		int num[] = new int[5];     //定义一个用户输入的可以储存5个数字的数字
		for (int i = 0; i < 5; i++) {
			num[i] = scanner.nextInt();     //将用户输入的数字，赋值给num[i]数组
		}
       
		//判断两个数组有几组相同的数字。用count来计量相同的组数
		int count = 0;
		for (int i = 0; i < 5; i++) {
			if (rand[i] == num[i]) {
				count++;
			}
		}
       //用一个swich(){}case: 的语法，来将得到相同count的个数，进行输出。
			switch (count) {
			case 0:
				System.out.println("没有中奖");
				break;
			case 1:
				System.out.println("中奖20元");
				break;
			case 2:
				System.out.println("中奖100元");
				break;
			case 3:
				System.out.println("中奖200元");
				break;
			case 4:
				System.out.println("中奖500元");
				break;
			case 5:
				System.out.println("中奖1000元");
				break;
			
		}

	}
}
