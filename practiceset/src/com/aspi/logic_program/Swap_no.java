package com.aspi.logic_program;

public class Swap_no {

	public static void main(String[] args) {
		int a=20;
		int b=30;
		int c=0;
		 c=a;//c=20
		 a=b;//a=30
		 b=c;//b=20
		System.out.println(a);		
        System.out.println(b);
        System.out.println("---------Another way--------");
        a=a*b;//20*30=600
        b=a/b;//600/30=20
        a=a/b;//600/20=30
        System.out.println(a);		
        System.out.println(b);
        System.out.println("---------Another way--------");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);		
        System.out.println(b);
//        System.out.println("---------Another way--------");
//        a=a|b;
//        b=a|b;
//        a=a|b;
//        System.out.println(a);		
//        System.out.println(b);
	}

}
