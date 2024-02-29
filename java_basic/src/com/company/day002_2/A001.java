package com.company.day002_2;

public class A001 {
	public static void main(String[] args) {
//		자료향 변수이름
//		정수형 (1,2,3...) 박스이름 wallet

		int wallet;
		System.out.println("지갑에 있는돈 (1) " + 100000);

//		(2) A = B 대입
		wallet = 100000;
		System.out.println("지갑에 있는돈 (1) " + wallet);// 100000

//		(3) 변수 - 변하는 수
		wallet = 30000;
		System.out.println("지갑에 있는돈 (2) " + wallet);// 30000

//      (4) A = B
		wallet = 30000 - 12000;
		System.out.println("지갑에 있는돈 (3) " + wallet);// 18000

	}

}
