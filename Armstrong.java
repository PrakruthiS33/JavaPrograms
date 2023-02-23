package com;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=sc.nextInt();
		int temp_var1 = no;
		int length = 0;
		
		//Check the length of given number
		while(temp_var1 != 0) 
		{
			
			length = length +1;
			temp_var1 = temp_var1/10;
			
		}
		
		int temp_var2 = no;
		int armstrong = 0;
		int rem;
		
		
		//Reverse a Number  
		while(temp_var2 != 0) 
		{
			int multiple = 1;
			rem = temp_var2%10;
			
			for(int i=1;i<=length;i++)
			{
				multiple = multiple * rem;
			}
		
			armstrong = armstrong + multiple;
			temp_var2 = temp_var2/10;

		}

		//Checking if both number are same are not
		if(armstrong == no)
		{
			System.out.println(no+ " is Armstrong Number");
		}
		else
		{
			System.out.println(no+ " is not Armstrong Number");
		}
	}
}
