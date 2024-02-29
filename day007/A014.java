package com.company.day007;

public class A014 {
	public static void main(String [] args) {
		// 1. 단위 - 원 54320원
		/* 2. 
		 *    만원짜리 몇개? 5  54320 을 10000 으로 나누고 
		 *                   money/10000
		 *    천원짜리 몇개? 4  4320 을 1000으로 나누고
		 *                   (money%10000)/1000
		 *    백원짜리 몇개? 3  320을 100으로 나누고 
		 *    십원짜리 먗개? 2  30을 10으로 나누고
		 */
		
		int money = 54320;
		int man, cheon, back, sip,remain = 0;
		
		man = money/10000;// 5
		remain = money%10000;// 4320
		
		cheon = remain/1000;//4
		remain = remain%1000;//320
		
		back = remain/100;//3
		remain = remain%100;//20
		
		sip = remain/10;
		
		System.out.println(man);
		System.out.println(cheon);
		System.out.println(back);
		System.out.println(sip);
		System.out.printf("만원 %d장, 천원 %d장, 백원 %d장, 십원 %d장",man,cheon,back,sip);

	}

}
