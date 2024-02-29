package com.company.day007;

public class A015_1 {
	public static void main(String[] args) {
		/*
		 * 1년 365.2422일인데, 365일 5시간 48분 46초 힌트1) 1초:1 1초 1분:1*60 60초 1시간:1*60*60 3600초
		 * 1일:24*60*60 86400초 힌트2) 일 : 초단위의시간 / 86400 시 : 일단위 남은값 / 3600 분 : 시단위 남은값 /
		 * 60 초 : 분단위 남은값
		 */
		double year = 365.2422; // 365일 0.2422일
		year = 365.2422 * 86400; // 초단위
		double remain = 0.0;
		int day, hour, min, second = 0;
		day = (int) (year / 86400);
		remain = year % 86400;

		hour = (int) (remain / 3600);
		remain = remain % 3600;

		min = (int) (remain / 60);
		remain = remain % 60;

		second = (int) remain;
		System.out.println((int) day);
		System.out.println((int) hour);
		System.out.println((int) min);
		System.out.println((int) second);

		System.out.printf("공전 주기를 초단위로 : %f \n", year);
		System.out.printf("%d일 %d시간 %d분 %d초", day, hour, min, second);

	}

}
