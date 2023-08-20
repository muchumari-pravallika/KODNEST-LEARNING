package com.kodnest.localvarvsinstancevar;

public class Calculator {
	int num1;
	int num2;
	
	void add()
	{
		int res1;
		res1=num1+num2;
		System.out.println("Addition result is "+res1);
	}
	
	void sub()
	{
		int res2=num1-num2;
		System.out.println("Subtraction Result is "+res2);
	}
	
	void mul()
	{
		int res3=num1*num2;
		System.out.println("Multiplication Result is "+res3);
	}
	
	void div()
	{
		int res4=num1/num2;
		System.out.println("Division Result is "+res4);
	}

}
