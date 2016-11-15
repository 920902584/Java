package com.fjsf.zx;

public class Text {
      
	   public static void main(String[] args) {
		   
          Thread  mythread = new Thread(new MyThread());   // 实例化方式一
          //实例化 方式二
         // mythread.setDaemon(true);  //设置守护线程
          MyThreadW  thread  = new MyThreadW();  
          Thread  mythreadw = new  Thread(thread);
          
        // mythread.start();
        // mythreadw.start();
          
          MyRunnable my = new MyRunnable();
          new Thread(my).start();
          new Thread(my).start();
          new Thread(my).start();
     }
}
