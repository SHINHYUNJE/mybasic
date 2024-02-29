package com.company.day003_value;

import java.util.Scanner;

public class A014 {
	public static void main(String[] args) {
		//GIGO
		//변수
		float f=0.0f;
		double d=0.0; //# 처리기본단위
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.print("실수입력1 > "); //f = scanner.nextInt();
		f = scanner.nextFloat(); // 7
		System.out.print("실수입력2 > ");
		d = scanner.nextDouble(); // 15
		
		//처리
		//출력
		System.out.println(f +" / "+ d);
		
	}

}
