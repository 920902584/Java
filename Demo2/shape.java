package com.java.zx;

public interface shape {
	public final double PI=3.1415926;
	 void Arer();   //���
	 void Perimeter();  //�ܳ�

}
  //����һ����������
 class Oblong implements shape {
    private int length;   //˽��
    private int widgth;
	@Override
	public void Arer() {
		// TODO Auto-generated method stub
     System.out.println("���ĳ�Ϊ��"+this.length+"  ���Ŀ�Ϊ��"+this.widgth+"  ���������"+(this.length*this.widgth));
	}

	@Override
	public void Perimeter() {
		// TODO Auto-generated method stub
    System.out.println("���ĳ�Ϊ��"+this.length+"  ���Ŀ�Ϊ��"+this.widgth+"  �����ܳ���"+((this.length*2)+(this.widgth*2)));
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
 
      // ����һ��Բ����
 class Cyclo implements shape{
          private double r;
		

		@Override
		public void Arer() {
			System.out.println("���İ뾶�ǣ�"+this.r+"  �������:"+(PI*this.r*this.r));
			
		}

		@Override
		public void Perimeter() {
			// TODO Auto-generated method stub
			System.out.println("���İ뾶�ǣ�"+this.r+"  �����ܳ�:"+(2*PI*this.r));
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
