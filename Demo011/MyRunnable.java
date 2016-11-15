package com.fjsf.zx;

class MyRunnable implements Runnable {
     private int ticket = 5;
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		for ( int i= 0 ; i < 100 ; i++){
			if( ticket>0 )
			System.out.println("票剩："+ ticket--);		
		}
	}
}


