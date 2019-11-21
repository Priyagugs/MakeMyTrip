package com.mmt.qa.TestCases;

public class LargestNumber {
	
	public static void main(String[] args) {
		
		int a=30,b=40, c=20;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.print("a is largest " +a);
			}
			
			else
			{
				System.out.print("c is largest "+ c );
			}
		}
		
		else if(b>a)
		{
			if(b>c)
				
			{System.out.print("b is largest " +b);
			}
			
			else
			{
				System.out.print("c is largest "+ c );
			}
				
			}
		}
		
		
		
	}

