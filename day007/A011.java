package com.company.day007;

public class A011 {
	public static void main(String[] args) {
		//먼저  값  비교 조건 대입
		//()  ++  < > & |  +=
 		int a = 3, b = 10;
		System.out.println(b += 10 - a--); // 17
		//1. a-- (--처리후 맨마지막에)
		//2. 10-a = 10-3 = 7
		//3. b+=7 = 10+=7 = 17
		//4. 17 출력 (b=17 / a=2)
		System.out.println(a += 5); // 7
		//1. a+=5 2+=5 = 7
		System.out.println(b > 10 || a < 0 && a > 3); // true
		//1. b>=10   || a<0 && a>3
		//2. 17>=10  || a<0 && a>3
		//3. true    || false && true - 우선순위 && > ||
		//4. true    || false  - true
	}

}
