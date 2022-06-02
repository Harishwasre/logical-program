package com.aspi.logic_program;

public class Palindrom_no
{
	public static void main(String[] args)
	{
		int rev =0;
		int num=121;
		int a = num;
		
		while(num !=0) 
		{
			rev =rev*10+num%10;//2,20+1=21,212,2122 21221
			
			num=num/10;	//1221,122.12,1
			
		}
		System.out.println(rev);
	
	    if (a==rev) 
	      {
		   System.out.println("number\t is palidrom " + rev);
	      }
	    else 
	      {
	    	System.out.println("number "+ rev +" not palindrom" );
	      }
	}

}
