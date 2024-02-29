package com.company.day007;

public class A008 {
	public static void main(String[] args) {
		int a = -2;
//		Q1)삼항연산자로 a가 1이면 1 , 1이 아니면 0 출력
		System.out.println(a==1? "1":"0");
//		Q2)삼항연산자로 a가 양수라면 11 곱한값 아니면 0.9 곱한값 출력
		System.out.println(a>=1? (float)(a*1.1):(float)(a*0.9));
//		Q3) 다음 코드 확인 - 오류나는 이유?
/*		double result23 = (a>0)? a*=1.1:a*=0.9;*/ 
//		대입연산자는 항상 마지막에..
		double result24 = (a>0)? a*=1.1:(a*=0.9);
		System.out.println(result24);
		double result25 = (a>0)? a*1.1:(a*=0.9);
		System.out.println(result25);
		double result26 = (a>0)? a*1:a*1.1;
		System.out.println(result26);



		

		
		
	}

}
