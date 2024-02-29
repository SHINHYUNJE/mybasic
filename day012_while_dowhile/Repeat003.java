package com.company.day012_while_dowhile;

public class Repeat003 {
	public static void main(String[] args) {
		int count1 = 0, count2 = 0, count3 = 0;
		// ver1
		for (int i = 1; i < 11; i++) {
			if (i % 3 == 0) {
				count1++;
			}
		}
		System.out.println("1~10까지 3의 배수 : " + count1);
		int i = 1;
		while (i < 11) {
			if (i % 3 == 0) {
				count2++;
			}
			i++;
		}
		System.out.println("\n1~10까지 3의 배수 : " + count2);
		i = 1;
		do {
			if (i % 3 == 0) {
				count3++;
			}
			i++;
		} while (i < 11);
		System.out.println("\n1~10까지 3의 배수 : " + count3);
	}

}
