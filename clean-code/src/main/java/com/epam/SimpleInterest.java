package com.epam;

public class SimpleInterest{
	
	float principalAmt, rateOfInterest, time;
	
	public SimpleInterest(float principal, float rate, float time) {
		
		principalAmt=principal;
		rateOfInterest=rate;
		this.time=time;
		
	}
	
	public float getSimpleInterest() {
		
		float sInterest;
		sInterest=(principalAmt * rateOfInterest * time) / 100;
		return sInterest;
		
	}
}