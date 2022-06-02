package com.aspi.logic_program;

public class ArmStrom_no
{
	public static void main(String args[])
	{
		int num =153;
		int t1=num;int len=0;
		  while(t1!=0)
		  {
			t1=t1/10;
			 len =len+1;
		  }
		  System.out.println("length "+len);//harish
		  
		  int t2=num;
		  int arm=0;
			  while(t2!=0)
		  {
				  
				  int multi=1;
				  
				  int rem=t2%10;
		
		 	
		  for(int i=1;i<=len;i++)
		  {
			  multi=multi*rem;
			  
		  }
		  t2=t2/10;
		  arm=arm+multi;
		 System.out.println(arm);
		  }
		  if(num==arm)
			 {
				System.out.println("number "+num+ " arm no."); 
			 }
		  else 
		  {
			  System.out.println("number "+num+" not arm no ");
		  }
}
}
  


