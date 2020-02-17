package com.epam;

import java.util.Scanner;

public class App 
{
	static Scanner input=new Scanner(System.in);
	static float principalAmt, rateOfInterest, time;
	
	public static float calculateSimpleInterest() {

		float simpleInterest;
		
    	System.out.print("Enter the principal amount : ");
    	principalAmt=input.nextFloat();
    	System.out.print("Enetr the Rate of Interest : ");
    	rateOfInterest=input.nextFloat();
    	System.out.print("Enter the Time period(in years) : ");
    	time=input.nextFloat();
    	
    	SimpleInterest simpleInterestObject=new SimpleInterest(principalAmt,rateOfInterest,time);
    	simpleInterest=simpleInterestObject.getSimpleInterest();
    	
    	return simpleInterest;
    	
	}
	
	public static float caluculateCompoundInterest() {

		float compoundInterest;
		int noOfTimes;
		
    	System.out.print("Enter the principal amount : ");
    	principalAmt=input.nextFloat();
    	System.out.print("Enetr the Rate of Interest : ");
    	rateOfInterest=input.nextFloat();
    	System.out.print("Enter the Time period(in years) : ");
    	time=input.nextFloat();
    	System.out.print("Enter the no. of times the interest is compounded per unit time : ");
    	noOfTimes=input.nextInt();
    	
    	CompoundInterest compInterestObject=new CompoundInterest(principalAmt, rateOfInterest, time, noOfTimes);
    	compoundInterest=compInterestObject.getCompoundInterest();
    	
    	return compoundInterest;
    	
	}
	
	public static float findConstructionCost() {
		
		float constCost, area;
		int choice;
		
		System.out.println("Choose a Standard of material to be used for House Construction from the following : ");
		System.out.println("\n1. Standard Materials.\n2. Above Standard Materials\n3. High Standard Materials\n4. High Standard AMterial and Fully Automated House.");
		while(true){
			System.out.print("\nEnter a valid Choice : ");
			choice=input.nextInt();
			if(choice>4 || choice<1)
				System.out.println("\nTry Again!!!!....");
			else
				break;
		}
		System.out.print("Enter the total Area of house in square feet :");
		area=input.nextFloat();
		
		ConstructionCost house=new ConstructionCost(choice,area);
		constCost=house.calculateCost();
		
		return constCost;
	}
	
    public static void main( String[] args )
    {
     
    // Simple Interest
    	float simpleInterest;
    	System.out.println("To find Simple Interest:\n");
    	simpleInterest=calculateSimpleInterest();
    	System.out.println("\nSimple interest is : "+simpleInterest);
    	
    //Compound Interest
    	float compoundInterest;
    	System.out.println("\nTo find Compound Interest:\n");
    	compoundInterest=caluculateCompoundInterest();
    	System.out.println("\nCompound Interest after "+time+" years is : "+compoundInterest+" (without principla amount)");
    	
    //Construction cost of House
    	float constructionCost;
    	System.out.println("\nTo find House Construction Cost : \n");
    	constructionCost=findConstructionCost();
    	System.out.println("\nTotal Construction Cost of House according to given details : "+constructionCost+"INR");
    	
    	
    }

}
