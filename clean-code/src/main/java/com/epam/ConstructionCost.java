package com.epam;

public class ConstructionCost {
	int choice, cost;
	float area;
	
	public ConstructionCost(int choice, float area) {
		this.choice=choice;
		this.area=area;
	}
	
	public int getCostPerFeet() {
		
		switch(choice) {
			case 1:
				return 1200;
			case 2:
				return 1500;
			case 3:
				return 1800;
			case 4:
				return 2500;
		}
		return 0;
		
	}
	
	public float calculateCost() {
		float totalCost;
		
		cost = getCostPerFeet();
		totalCost = cost * area;
		
		return totalCost;
		
	}
	
}