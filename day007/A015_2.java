package com.company.day007;

public class A015_2 {
	public static void main(String[] args) {
		double year = 365.2422*(60*60*24);
		double remain=0.0;
		int day,hour,min,sec=0;
		
		day = (int) (year/(60*60*24));
		remain = year%(60*60*24);
		
		hour = (int) (remain / (60*60));
		remain = remain % (60*60);

		min = (int) (remain / 60);
		remain = remain % 60;

		sec = (int) remain;
		System.out.printf("공전 주기를 초단위로 : %f \n", year);
		System.out.printf("%d일 %d시간 %d분 %d초", day, hour, min, sec);
		
	}

}
