package com.carrent.zx;

public class Pickup extends Car implements IBusLoad,ITrunkLoad{
    private int busLoad;
    private int trunkLoad;
    
    public Pickup(String type,int price,int busLoad,int trunkLoad){
    	this.setType(type);
    	this.setPrice(price);
    	this.setBusLoad(busLoad);
    	this.setTrunkLoad(trunkLoad);
    }
	@Override
	public int getTrunkLoad() {
		// TODO Auto-generated method stub
		return trunkLoad;
	}

	@Override
	public void setTrunkLoad(int trunkLoad) {
		// TODO Auto-generated method stub
		this.trunkLoad=trunkLoad;
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
		return super.toString()+"\t\t"+"载人："+this.getBusLoad()+"人"+"\t载货"+this.getTrunkLoad()+"吨";
	}

}
