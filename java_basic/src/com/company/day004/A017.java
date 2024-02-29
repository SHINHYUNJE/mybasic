package com.company.day004;

public class A017 {
	public static void main(String[] args) {
//		#1. 캐스팅방법 - 오류나는 이유 체크
		int v1 = (int) 1.2; // 4byte [ | | | ] <= 1.2 (double : 8byte ) [|||||||]
		long v2 = 10;       // 8byte [|||||||] <= 10  4byte [ | | | ]
		float v3 = (float) 3.14;  // 4byte [ | | | ] <= 3.14 (double : 8byte ) [|||||||]
		double v4 = 3.14f;  // 8byte [|||||||] <= 3.14f 4byte [ | | | ]
		
//		#2. 자동타입변환 byte < short, char < int < long < float < double
		double v21 = 3.14f; // long  (8byte) = float(4byte)  
		float v22 = 3L;     // float (8byte) = long(4byte)    ▶ 실수 > 정수
		long v23 = 10;      // long  (8byte) = 10 int(4byte)  
		short v24 = 10;     // short (2byte) = 10 int(4byte)  ▶ short범위에 포함
		byte v25 = 10;      // byte  (1byte) = 10 int(4byte)  ▶ byte범위에 포함 (-128~127)
		//1bit (0,1) - 1byte(8bit)
		// 2^0(1) 2^1(2) 2^2(4) 2^3(8) .... 2^8(256)
		// 0,1
		
//		#3. 강제타입변환 
		byte   v31 = 1;
		double v32 = v31;            // ▶ 실수 > 정수
		       v31 = (byte) v32;     // 정수(1byte) = 실수(8byte)
	    System.out.println(10/3);    // 3  정수/정수의 결과물은 정수
	    System.out.println(10/3.0);  // 3.3333333333333335 정수/실수
	    System.out.println(10.0/3);  // 3.3333333333333335 실수/정수

//		#4. ex1 다음의 결과가 나오게 코드를 수정하세요.
	    int ca = 10, cb = 3;
	    System.out.println(10f/3);  // 결과 : 3.3333333
	    System.out.println(ca/3f);  // 결과 : 3.3333333
	    System.out.println(10/(float)cb); // 결과 : 3.3333333
	    System.out.println((float)ca/cb); // 결과 : 3.3333333

//		#5. ex2
	}// end main

}// end class