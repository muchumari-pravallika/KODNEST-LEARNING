package com.kodnest.constructors;

public class CameraApp {

	public static void main(String[] args) {
		Camera c1=new Camera("Black","Sony",45000);
		c1.captureImage();
		c1.displayImage();
		System.out.println(c1.color+" "+c1.brand+" "+c1.cost);
	}

}
