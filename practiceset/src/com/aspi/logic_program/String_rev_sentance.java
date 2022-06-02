package com.aspi.logic_program;

public class String_rev_sentance {

	public static void main(String[] args)
	{
		String s="my name is harish";
		String[] word=s.split(" ");
		String reverse="";
		for(String a:word) 
		{
			String revword="";
			for(int i=a.length()-1;i>=0;i--) 
			{
				revword=revword+a.charAt(i);
			}
			reverse=reverse+revword+" ";
		}
		System.out.println(reverse);
		
	}	
}




