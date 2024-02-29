package com.company.day012_while_dowhile;

public class Repeat004 {
	public static void main(String[] args) {
		int sum1 = 0, sum2 = 0, sum3 = 0;
		int count1 = 0, count2 = 0, count3 = 0;
		String result1 = "", result2 = "", result3 = "";
		for (int i = 1; i < 11; i++) {
			if (i % 3 == 0) {
				
				result1 += (sum1==0 ? "" : "+") + i;
				sum1 += i;
			}
		}
		System.out.println("1~10까지 3의 배수의 합 : " + result1 + "=" + sum1);
		int i1 = 1;
		while (i1 < 11) {
			if (i1 % 3 == 0) {
				count2++;
				sum2 += i1;
				result2 += (count2==1 ? "" : "+") + i1;
			}
			i1++;
		}
		System.out.println("1~10까지 3의 배수의 합 : " + result2 + "=" + sum2);
		int i2 = 1;
		do {
			if (i2 % 3 == 0) {
				count3++;
				sum3 += i2;
				result3 += (count3==1 ? "" : "+") + i2;
			}
			i2++;
		} while (i2 < 11);
		System.out.println("1~10까지 3의 배수의 합 : " + result3 + "=" + sum3);
	}

}
