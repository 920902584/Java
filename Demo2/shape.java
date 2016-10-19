package com.java.zx;

public interface shape {
	public final double PI=3.1415926;
	 void Arer();   //面积
	 void Perimeter();  //周长

}
  //定义一个长方形类
 class Oblong implements shape {
    private int length;   //私有
    private int widgth;
	@Override
	public void Arer() {
		// TODO Auto-generated method stub
     System.out.println("他的长为："+this.length+"  他的宽为："+this.widgth+"  他的面积："+(this.length*this.widgth));
	}

	@Override
	public void Perimeter() {
		// TODO Auto-generated method stub
    System.out.println("他的长为："+this.length+"  他的宽为："+this.widgth+"  他的周长："+((this.length*2)+(this.widgth*2)));
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidgth() {
		return widgth;
	}

	public void setWidgth(int widgth) {
		this.widgth = widgth;
	}
	
	public 	Oblong(int length,int widgth){
		setLength(length);
		setWidgth(widgth);
	}

}
 
      // 定义一个圆形类
 class Cyclo implements shape{
          private double r;
		

		@Override
		public void Arer() {
			System.out.println("他的半径是："+this.r+"  他的面积:"+(PI*this.r*this.r));
			
		}

		@Override
		public void Perimeter() {
			// TODO Auto-generated method stub
			System.out.println("他的半径是："+this.r+"  他的周长:"+(2*PI*this.r));
		}

		public double getR() {
			return r;
		}

		
		public void setR(double r) {
			this.r = r;
		}

		public Cyclo(double r){
			setR(r);
		}
	 
 }
