package com.java.zx;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 shape[] Shape =new shape[2];   //创建一个实例化数组
		 Oblong obl=new Oblong(2,3);    //实例化长方形，并给长和宽赋值
		 Cyclo  cyc=new Cyclo(3);     //实例化圆形，并给半径赋值
		 Shape[0]=obl;          
		 Shape[1]=cyc;
		 //  输出结果
         for(int i=0;i<2;i++){
        	 Shape[i].Arer();
        	 Shape[i].Perimeter();
         }
}
}