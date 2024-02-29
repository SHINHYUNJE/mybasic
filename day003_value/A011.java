package com.company.day003_value;

import java.util.Scanner;

public class A011 {
	public static void main(String[] args) {
		//GIGO
		//1. ctrl + shift + o / Scanner 에 마우스 커서대고 f2 + 지구본(마지막) 
		Scanner scanner = new Scanner(System.in);
		//변수
		int age = 0;
		//입력
		System.out.print("당신의 나이는? > ");
		age = scanner.nextInt();
		//출력
		System.out.println("당신의 나이는 "+age+"살입니다.");
	}

}
