package com.kodnest.shadowingproblem;

class MobileApp {

	public static void main(String[] args) {
		Mobile mobile1=new Mobile("Samsung","Purple",125000);
		System.out.println(mobile1.brand+" "+mobile1.color+" "+mobile1.cost);
		
		Mobile mobile2=new Mobile("Apple","Gold",250000);
		System.out.println(mobile2.brand+" "+mobile2.color+" "+mobile2.cost);
		
	}
}
