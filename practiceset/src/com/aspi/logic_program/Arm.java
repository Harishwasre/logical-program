package com.aspi.logic_program;

public class Arm {

	public static void main(String[] args) {
		int nm=153;
		int t1=nm;
		int t2=nm; int arm=0;int len=0;
		while(t1!=0) 
		{
			t1=t1/10;
			len=len+1;
		}
		while(t2!=0) 
		{
			int rem=t2%10;
			int multi=1;
			for(int i=1;i<=len;i++) 
			{
				multi=rem*multi;
			}
			t2=t2/10;
			arm=arm+multi;
			
		}
		if(nm==arm) 
		{
			System.out.println("arm no");
		}
		else 
		{
			System.out.println("not arm no. ");
		}

	}

}
