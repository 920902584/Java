package com.carrent.zx;

public class Bus extends Car implements IBusLoad{
  private int busLoad;
  
  public Bus(String type,int price,int busLoad){
	  this.setType(type);
	  this.setPrice(price);
	  this.setBusLoad(busLoad);
  }
	@Override
	public int getBusLoad() {
		// TODO Auto-generated method stub
		return busLoad;
	}

	@Override
	public void setBusLoad(int busLoad) {
		// TODO Auto-generated method stub
		this.busLoad=busLoad;
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString()+"\t\t"+"载人："+this.getBusLoad()+"人";
		}
	

}
