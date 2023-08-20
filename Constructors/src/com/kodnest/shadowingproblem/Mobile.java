package com.kodnest.shadowingproblem;

class Mobile {
	
	String brand;
	String color;
	int cost;
	
	public Mobile(String brand,String color,int cost)
	{
		//shadowing problem
//		brand=brand;
//		color=color;
//		cost=cost;
		
		//solution to shadowing problem
		this.brand=brand;
		this.color=color;
		this.cost=cost;
		
	}

	void allowToCall()
	{
		System.out.println("TRING TRING... Calling");
	}
	
	void allowToPlay()
	{
		System.out.println("Start Playing BGMI");
	}
	

}
