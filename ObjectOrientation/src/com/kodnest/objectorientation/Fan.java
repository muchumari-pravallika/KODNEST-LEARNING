package com.kodnest.objectorientation;

class Fan {
	int no_Of_Wings;
	int cost;
	String color;
	String brand;
	
	void rotate()
	{
		System.out.println(color+" color "+brand+" brand "+no_Of_Wings+" Winged fan which costs "+cost+" is rotating");
	}
	 void blow_Air()
	 {
		 System.out.println(color+" Color Fan Is Blowing Air...");
	 }

}
