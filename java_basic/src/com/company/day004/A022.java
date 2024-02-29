package com.company.day004;

public class A022 {
	public static void main(String[] args) {
		int in = 10;
		double dou = 1.2;
		
		double result1 = in+dou;
		int result2 = in+(int)dou;
		System.out.println(result1+"\t"+result2);
		
		byte a = 10, b = 20;
		int c1 = a+b;
		byte c2 = (byte)(a+b);
		System.out.println(c1+"\t"+c2);

		
	}

}
