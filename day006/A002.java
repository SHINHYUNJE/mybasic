package com.company.day006;

public class A002 {
	public static void main(String[] args) {
		int a = 10;
		//(1) a - 짝수 판별
		System.out.println("a가 짝수라면 " + (a%2==0));
		
		//(2) a - 3의 배수 판별
		System.out.println("a가 3의 배수라면 " + (a%3==0));
	}
}
