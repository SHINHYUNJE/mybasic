package com.company.day003_value;

import java.util.Scanner; //2. Scanner 사용하기 위해 부품객체 가져다가 사용

public class A010 { 
	public static void main(String[] args) {
		//GIGO
		//변수
		int a=0;  //a [0]
		Scanner scanner = new Scanner(System.in); 
		//1. ctrl + shift + o / Scanner 에 마우스 커서대고 f2 + 지구본(마지막) 
		
		//입력
		System.out.println("좋아하는 숫자를 입력해주세요>");
		// a = 10;  A=B
		a = scanner.nextInt();
		//처리 X
		//출력
		System.out.println("좋아하는 숫자는 " + a + "입니다.");
	}

}
