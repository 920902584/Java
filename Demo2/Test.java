package com.java.zx;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 shape[] Shape =new shape[2];   //����һ��ʵ��������
		 Oblong obl=new Oblong(2,3);    //ʵ���������Σ��������Ϳ�ֵ
		 Cyclo  cyc=new Cyclo(3);     //ʵ����Բ�Σ������뾶��ֵ
		 Shape[0]=obl;          
		 Shape[1]=cyc;
		 //  ������
         for(int i=0;i<2;i++){
        	 Shape[i].Arer();
        	 Shape[i].Perimeter();
         }
}
}