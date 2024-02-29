package com.company.day005;

import java.util.Scanner;

public class A025 {
	public static void main(String[] args) {
		//문자는 저장시 숫자로 출력시 문자
		char B = 'B', a = 'a', nul = ' ', A = 'A';
		Scanner scanner = new Scanner(System.in);
		System.out.println("q1) 대문자 B는 숫자로 변환시 얼마 > " + (int) B);
		System.out.println("q1) 대문자 B는 숫자로 변환시 얼마 > " + (int) 'B');
		
		System.out.println("q2) 소문자 a는 숫자로 변환시 얼마 > " + (int) a);
		System.out.println("q2) 소문자 a는 숫자로 변환시 얼마 > " + (int) 'a');

		
		System.out.println("q3) 소문자 ' '는 숫자로 변환시 얼마 > " + (int) nul);
		System.out.println("q3) 소문자 ' '는 숫자로 변환시 얼마 > " + (int) ' ');

		
		System.out.println("q4) System.out.println('A'-'a'); 얼마 > " + ((int) A - (int) a));
        System.out.println("q4) System.out.println('A'-'a'); 얼마 > " + ('A'-'a'));
		//1. int -> byte, short, char
		//2. int 보다 작은애들은 연산시 자동처리는 int
		//3. 'A' - 'a' char - char -> int - int
		//4. 65 - 97 char - char -> int - int
		System.out.println("q5) 대문자 A를 소문자 a로 변환하기 ");
		System.out.println((char)((int)A+32));
		System.out.println("q5) 대문자 A를 소문자 a로 변환하기 " + (char)('A'+32));
		//1. 'A' + 32 = 98
		//2. char + int 결과물 int
		//3. int + int  결과물 int
		//4. int + int  결과물 (char)int
		System.out.println("q6) 10 + 3 = 13 을 출력하시오 ");
		int a1=10; int b1=3; char op='+';
		System.out.println(""+ a1 + op + b1+"="+(a1+b1));
		//+의 두가지 의미 1) 연산 2) 출력

	}

}
