package com.aspi.logic_program;

public class Rev {

	public static void main(String[] args)
	{
		String ha="my name";
		String[] har = ha.split(" ");
		String rev = " ";
		for( String a:har) 
		{
			String revword="";
			for(int i=a.length()-1;i>=0;i--) 
			{
			 revword=revword+a.charAt(i);
				}
			rev=rev+revword+" ";
			System.out.println(rev);
		}
		

	}

}
