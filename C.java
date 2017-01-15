package com.acad.inheritance;

public class C extends B
{
	public void test(int a,int b)
 {
		super.test(a, b);
		System.out.println("Sub sub class");
	}
public static void main(String[] args)
{
	C c = new C();
	c.test(20, 30);
}
}
