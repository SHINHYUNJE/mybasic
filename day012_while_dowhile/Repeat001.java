package com.company.day012_while_dowhile;

public class Repeat001 {
	public static void main(String[] args) {
		// for - 순서,개수를 알고 있을때
		// while - 개수를 모를때
		// do while - 무조건 1번은 실행을 해야할때
		// 1 2 3
		System.out.println("for-ver");
		for (int i = 1; i < 4; i++) {
			System.out.println(i + "\t");
		}
		System.out.println("\n\nwhile-ver");
		int i = 1;
		while (i < 4) {
			System.out.println(i + "\t");
			i++;
		}
		System.out.println("\n\ndo while-ver");
		i=10;
		do {
			System.out.println(i + "\t");
			i++;
		} while (i < 4);
	}

}
