package com.aspi.logic_program;

public class Replacing_alph_no
{
	public static void main(String []args)
	{
		String a ="my name is 123456";
		String b ="[0-9]";
		String c="[a-z]";
		String d=a.replaceAll("[a-z]","");
		System.out.println(d);
	}

}
