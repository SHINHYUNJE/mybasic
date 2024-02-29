package com.company.day002_2;

public class A007 {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + a * b);
		System.out.println(a + " / " + b + " = " + a / b);
		System.out.println();

		System.out.println("10 + 3 = " + (a + b));
		System.out.println("10 - 3 = " + (a - b));
		System.out.println("10 * 3 = " + (a * b));
		System.out.println("10 / 3 = " + (a / b));
		System.out.println();

		System.out.printf("%d + %d = %d\n",a,b,a+b);
		System.out.printf("%d - %d = %d\n",a,b,a-b);
		System.out.printf("%d * %d = %d\n",a,b,a*b);
		System.out.printf("%d / %d = %d\n",a,b,a/b);

	}

}
