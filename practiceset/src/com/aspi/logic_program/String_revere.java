package com.aspi.logic_program;

public class String_revere
{

	public static void main(String[] args)
	{
		String a= "madam";
		String rev="";
		
		
		for(int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);		
		}
		System.out.println(rev);
		if(a.equals(rev)) 
		{
			System.out.println("String is palidrome "+rev);
			
		}
		else 
		{
			System.out.println("String is not palidrome");
		}
	}
}
