package com.company.day012_while_dowhile;

import java.util.Scanner;

public class Repeat {
	public static void main(String[] args) {
		int kor = -1, eng = -1, math = -1;
		int tot = 0;
		float avg = 0.0f;
		String stdid = "", scholar = "", pass = "", level = "";
		String gradek = "", gradee = "", gradem = "";

		Scanner scanner = new Scanner(System.in);
		System.out.print("이름 입력 > ");
		stdid = scanner.next();

		for (;;) {
			if (!(kor >= 0 && kor <= 100)) {
				System.out.print("국어 입력 > ");
				kor = scanner.nextInt();
			} else if (!(eng >= 0 && eng <= 100)) {
				System.out.print("영어 입력 > ");
				eng = scanner.nextInt();
			} else if (!(math >= 0 && math <= 100)) {
				System.out.print("수학 입력 > ");
				math = scanner.nextInt();
			} else {
				break;
			}
		}
		tot = kor + eng + math;
		avg = tot / 3.0f;

		scholar = avg >= 95 ? "장학생O" : "장학생X";

		pass = avg < 70 ? "불합격" : (kor < 40 || eng < 40 || math < 40) ? "재시험" : "합격";

		for (int i = 1; i <= (avg / 10); i++) {
			level += "*";
		}

		if (kor >= 90) {
			gradek = kor + "(수)";
		} else if (kor >= 80) {
			gradek = kor + "(우)";
		} else if (kor >= 70) {
			gradek = kor + "(미)";
		} else if (kor >= 60) {
			gradek = kor + "(양)";
		} else {
			gradek = kor + "(가)";
		}
		if (eng >= 90) {
			gradee = eng + "(수)";
		} else if (eng >= 80) {
			gradee = eng + "(우)";
		} else if (eng >= 70) {
			gradee = eng + "(미)";
		} else if (eng >= 60) {
			gradee = eng + "(양)";
		} else {
			gradee = eng + "(가)";
		}
		if (math >= 90) {
			gradem = math + "(수)";
		} else if (math >= 80) {
			gradem = math + "(우)";
		} else if (math >= 70) {
			gradem = math + "(미)";
		} else if (math >= 60) {
			gradem = math + "(양)";
		} else {
			gradem = math + "(가)";
		}

		String avgS = String.format("%.2f", avg);

		System.out.println("=======================================================================================");
		System.out.println("이름\t" + "국어\t" + "영어\t" + "수학\t" + "총점\t" + "평균\t\t" + "합격여부\t" + "장학생\t" + "레벨");
		System.out.println("=======================================================================================");

		System.out.println(stdid + "\t" + gradek + "\t" + gradee + "\t" + gradem + "\t" + tot + "\t" + avgS + "\t\t"
				+ pass + "\t" + scholar + "\t" + level);

	}

}
