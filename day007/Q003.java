package com.company.day007;

public class Q003 {
	public static void main(String [] args) {
		int a = 10, b = 10;
		System.out.println(++a); // 11    a [11] 
		System.out.println(b++); // 10  / b [11]
		System.out.println(a++ + --b); //21  11 - (11-1) = 21 a[12],b[10]
		System.out.println(a+b); //22 12+10 = 22
 
	}

}
