package com.company.day003_value;

import java.util.Scanner;

public class Homework_Day003 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double kor,eng,math,sci,sum,avg = 0;
		
		System.out.print("국어점수 입력 > ");
		kor = scanner.nextDouble();
		System.out.print("영어점수 입력 > ");
		eng = scanner.nextDouble();
		System.out.print("수학점수 입력 > ");
		math = scanner.nextDouble();
		System.out.print("과학점수 입력 > ");
		sci = scanner.nextDouble();

		sum = kor + eng + math + sci;
		avg = sum / 4;
		System.out.printf("총점 : %.0f\n", sum);
		System.out.println("평균 : " + avg);

	}
	

}
