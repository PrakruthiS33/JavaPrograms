package com;

public class Basic_Addition {
	
	static void add(int a,int b) 
	{
		System.out.println(a+b);
	}

	static void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	static void add(int a, double b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {

		add(10,10);
		add(10,10,10);
		add(10,10.0);
	}

}
