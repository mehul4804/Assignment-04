package com.acad.inheritance;

public class B extends A 
{
	public void test(int a,int b)
	{
		super.test(a,b);
		System.out.println("Super sub class");
	}

}
