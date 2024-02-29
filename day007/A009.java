package com.company.day007;

public class A009 {
	public static void main(String [] args) {
		int a=1,b=7,c=10, max;
		// (조건) ? 참 : 거짓
		// 1. (a 와 b 를 비교해서 a 가 크다면) ? a:b 값을 max 에 대입
		// 2. (max 와 c 사이에 c가 크다면) ? c : max 값을 max 에 대입
		// 3. max = (a>b)? a:b
		// 4. max = (max>c)? max:c
		
		max = (a > b) ? a:b;
		System.out.println(max);
		max = (max > c) ? max:c;
		System.out.println(max);
		System.out.println("1,5,3 중에 큰값 " + max);
	}

}
