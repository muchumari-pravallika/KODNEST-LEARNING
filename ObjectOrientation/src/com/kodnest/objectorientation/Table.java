package com.kodnest.objectorientation;

public class Table {
	int seatingCapacity;
	int cost;
	String color;
	String brand;
	
	void allowToSit()
	{
		System.out.println("User can sit on the table which is "+color+" in color");
	}
	
	void allowToWrite()
	{
		System.out.println("User can write in the book by keeping it on the table which cost "+cost);
	}

}
