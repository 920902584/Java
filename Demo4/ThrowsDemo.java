package com.exception.zx;

public class ThrowsDemo {

	/**
	 * @param args
	 * 本次实验主要是为了了解Throws，其使用格式为 public 返回值类型  方法名称 (参数列表) throws 异常类{}
	 * 都要使用try{}catch(Exception e){} 进行异常的抓获与处理。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Math m= new Math();
    try{
    	System.out.println("除法操作："+m.div(100, 0));
    }catch(Exception e){
    	e.printStackTrace();
    }
	}

}
