package com.company.day007;

public class A015 {
	public static void main(String [] args) {
		/* 
		 * 1년 365.2422일인데, 365일 5시간 48분 46초
		 * 
		 * 1초:1             1초      
		 * 1분:1*60          60초
		 * 1시간:1*60*60     3600초
		 * 1일:24*60*60     86400초
		 * */
		double year=365.2422;
		double day,hour,min,second = 0;
		// int 
		day =  (int)year;  //365
		hour = (year - day)*24; //0.2422*24 = 5.8128
		min = (hour - (int)hour)*60; //0.8128*60 = 48.768 
		second = (min - (int)min)*60; //0.768*60 = 46.08

		System.out.println((int)day);
		System.out.println((int)hour);
		System.out.println((int)min);
		System.out.println((int)second);
		
		System.out.printf("공전 주기를 초단위로 : %f \n", year*86400);
		System.out.printf("%d일 %d시간 %d분 %d초", (int)day, (int)hour,(int)min,(int)second);

		
	}//end main

}//end class

