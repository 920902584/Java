package com.exception.zx;

public class Text {

	/**
	 * @param args
	 * 本次实验主要是了解 try{}catch(Exception e){}finally{}处理异常的用法
	 * 了解到了finally 不管有无异常。接下来的代码块都会被执行。
	 * try里面添加都异常的代码块。
	 * catch可以为多个捕捉到多个异常
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("--------计算开始-------- ");
        int i =10;
        int j=0;
        try {
			 int temp = i/j;
			 System.out.println("两个数字相除为："+temp);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(" 出现了异常"+e);
		}finally{
			System.out.println("不管是否有异常，都运行此代码");
		}
        System.out.println("--------计算结束--------");
	}

}
