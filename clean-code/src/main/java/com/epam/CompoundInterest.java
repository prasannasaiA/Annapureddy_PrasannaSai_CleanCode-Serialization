package com.epam;

public class CompoundInterest{
	
	float principalAmt, rateOfInterest, time;
	int noOfTimes;
	
	public CompoundInterest(float principal, float rate, float time, int noOfTimes) {
		
		principalAmt=principal;
		rateOfInterest=rate;
		this.time=time;
		this.noOfTimes=noOfTimes;
		
	}
	
	public float getCompoundInterest() {
		
		float compInterest, totalAmt;
		
		totalAmt = (float) (principalAmt * Math.pow((1 + (rateOfInterest/noOfTimes)), (noOfTimes * time)));
		compInterest = totalAmt-principalAmt;
		
		return compInterest;
		
	}
}