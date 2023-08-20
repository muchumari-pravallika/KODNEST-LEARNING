package com.kodnest.constructors;

public class Camera {
	String color;
	String brand;
	int cost;
	
	void captureImage()
	{
		System.out.println("Image Captured....");
	}
	
	void displayImage()
	{
		System.out.println("Camera is displaying Image");
	}
	
	public Camera(String x,String y,int z)
	{
		color=x;
		brand=y;
		cost=z;
	}
}
