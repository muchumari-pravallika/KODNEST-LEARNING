package com.kodnest.constructoroverloading;

public class MobileApp {

	public static void main(String[] args) {
		Mobile mobile1=new Mobile("Samsung","Purple",125000);
		System.out.println(mobile1.brand+" "+mobile1.color+" "+mobile1.cost);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		Mobile mobile2=new Mobile();
		System.out.println(mobile2.brand+" "+mobile2.color+" "+mobile2.cost);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		Mobile mobile3=new Mobile("MI");
		System.out.println(mobile3.brand+" "+mobile3.color+" "+mobile3.cost);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		Mobile mobile4=new Mobile(50000);
		System.out.println(mobile4.brand+" "+mobile4.color+" "+mobile4.cost);
	}

}
