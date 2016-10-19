package com.carrent.zx;

public abstract class Car {
    private String type;
    public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private int price;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return type+"\t"+price;
	}
    
}
