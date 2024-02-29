package com.company.day002_2;

public class A002 {
	public static void main(String[] args) {
//		1. 자료형 변수이름;
//		변수이름=값;
		int v0;
		v0 = 1;

//		2. 자료형 변수이름 = 값;
		int v1 = 1;
		{
			int v2 = 3;
			System.out.println(v1);
			System.out.println(v2);
//          v2 사용범위 끝
		}
		System.out.println(v1);
//		System.out.println(v2); // 오류나는 이유는? v2 cannot be resolved to a variable
//		v1 사용범위 끝
	}

}
