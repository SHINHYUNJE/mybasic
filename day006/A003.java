package com.company.day006;

public class A003 {
	public static void main(String[] args) {
		/*
		 * 1. 먼저() 비교조건후 대입! 
		 * 2. 값을 구하고(++,--,*,/,+,-,<<,>>) 
		 * 3. 비교( <, >) 
		 * 4. 조건( &&, ||, ! , ^, ||, |)
		 * 5. 대입(=)
		 */
		//조건연산자
		//#1. 논리연산자 AND && - dead code 존재함
		// A 와 B 가 조건 모두 맞아야 true - true : 1 / false : 0
		System.out.println(false && true);//false 
		System.out.println(true && false); //false
		System.out.println(true && (10<3));//false
		System.out.println((10<=10) && (10>3));//true

		//#2. 논리연산자 OR  ||
		// A 또는 B 가 조건 하나라도 맞으면 true
		System.out.println(true || true); //1
		System.out.println(true || false); //1
		System.out.println(false || 10<3); //0
		System.out.println((10<=10) || (10>3)); //1
		System.out.println((10<10) || (10>3)); //1
		//#3. NOT !
		System.out.println(!true); //0
		System.out.println(!false); //1
		System.out.println(false || !(10<3)); //1
		System.out.println((10<=10) || !(10>3)); //1
		//#4. XOR ^ 서로 다르면 true
		// & (and) 두 값이 모두 true 면 true 
		// | (or) 두 값 중 하나라도 true 면 
		// ^ (xor) 두 값이 서로 다르면 true
		System.out.println(true ^ true); //0
		System.out.println(false ^ false); //0
		System.out.println(true ^ 10<3); //1
		System.out.println(10<=3 ^ !(10>3)); //0
		
		System.out.println(false & true);//false 
		System.out.println(true & false); //false
		System.out.println(true & (10<3));//false
		System.out.println((10<=10) & (10>3));//true


		//#5. || 와 | 의 차이점 (&&, || dead code 발생)
	    int v1 = 3, v2 = 3;
		System.out.println(false && ++v1 > 10);//false 
		System.out.println(false & ++v2 > 10); //false
		System.out.println(v1 + "/" + v2);	// 3 / 4
		                                  //++3  <-----
		 int v3 = 3, v4 = 3; 
		System.out.println(true || ++v3 > 10);//true
		System.out.println(false | ++v4 > 10); //true
		                                  //++3  <-----
		System.out.println(v1 + "/" + v2);	// 3 / 4
		int a=1, b=1, c=1, d=1;
		System.out.println(++a); //2<-- 변수 기준으로 ++a ++1
		System.out.println(b++); //1<-- 변수 기준으로 b++ 1++
		System.out.println(a+"/"+b); //2/2	
		
		System.out.println(--c); //0  	--1
		System.out.println(d--); //1	1--
		System.out.println(c+"/"+d); // 0/0		
	}

}
