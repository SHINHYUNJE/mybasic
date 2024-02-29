package com.company.day002_2;

public class A004 {
	public static void main(String[] args) {
		
		int apple = 1;
		int box = 1;
		
		System.out.println(apple);// 1
		System.out.println(box);// 1
		
		box = apple + 10;
		apple = apple - 1;
		
		System.out.println(apple); // 0
		System.out.println(box); // 11

	}

}
