package com.carrent.zx;

public class Trunk extends Car implements ITrunkLoad{
    private int trunkLoad;
    public Trunk(String type,int price,int trunkLoad){
    	this.setType(type);
    	this.setPrice(price);
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
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\t\t"+"载货："+this.getTrunkLoad()+"吨";
	}

}
