package com.company.day004;

import java.util.Scanner;

public class A020 {
	public static void main(String[] args) {
		int kor = 0, eng = 0, math = 0, total = 0;
		float avg = 0.0f;
		Scanner scanner = new Scanner(System.in);

		System.out.print("국어점수입력 : ");
		kor = scanner.nextInt();
		System.out.print("영어점수입력 : ");
		eng = scanner.nextInt();
		System.out.print("수학점수입력 : ");
		math = scanner.nextInt();
		
		total = kor + eng + math;
		avg = total / (float) 3.0;
		System.out.println(":::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::       GREEN IT SCORE       :::::::");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::");
		System.out.println("국어\t" + "영어\t" + "수학\t" + "총점\t" + "평균");
		System.out.println(kor + "\t" + eng + "\t" + math + "\t" + total + "\t" + avg);

	}

}
