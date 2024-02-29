package com.company.day007;

import java.util.Scanner;

public class A013 {
	public static void main(String[] args) {
		String number = "", scholar = "", pass = "",level = "";
		int kor, eng, math, tot = 0;
		float avg = 0f;
		

		Scanner scanner = new Scanner(System.in);
		System.out.print("학번입력 : ");
		number = scanner.next();
		System.out.print("국어점수입력 : ");
		kor = scanner.nextInt();
		System.out.print("영어점수입력 : ");
		eng = scanner.nextInt();
		System.out.print("수학점수입력 : ");
		math = scanner.nextInt();
		tot = kor + eng + math;
		avg = tot / 3.0f;
		level = ((int)(avg/10) >= 9)? "수(Lv9)": 
			    ((int)(avg/10) >= 8)? "우(Lv8)": 
				((int)(avg/10) >= 7)? "미(Lv7)": 
				((int)(avg/10) >= 6)? "양(Lv6)":"가";
		pass = (avg>=60)? "합격":"불합격";
		scholar = (avg>=95)? "장학생 O":"장학생 X";
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::   GET IN SCORE   ::::::::");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("학번\t" + "국어\t" + "영어\t" + "수학\t" + "총점\t" + "평균\t\t"+"합격여부\t"+"레벨\t"+"장학생");
		System.out.println(number + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + avg +"\t\t"
				+ pass +"\t"+level+"\t"+ scholar);

	}

}
