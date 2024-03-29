package com.company.day002;

public class A007 {
	public static void main(String[] args) {
//		주석 - 설명
//		1. System.out.print / println / 특수기호
		System.out.print("출력예상(1)");
		System.out.println("A");

		System.out.println();
		System.out.println();
		System.out.println("출력예상(2)");
		System.out.println("B");

		System.out.println("출력예상(3)");
		System.out.println("A\tB\tC");
		/*
		 * 결과는? 출력예상(1)A
		 * 
		 * 출력예상(2) B 출력예상(3) A B C
		 */
//		2. System.out.printf %d 정수 1, %f 실수 1.23 %s 문자열 "abc"
		System.out.println();
		System.out.println();
		System.out.printf("%d\n", 10);
		System.out.printf("%d\n", 1);
		System.out.printf("%f\n", 1.23);
		System.out.printf("%.1f\n", 1.23);
		System.out.printf("%.2f\n", 1.23);
		System.out.printf("%s\n", "abc");
		System.out.printf("%d살 %s\n", 10, "abc");
		
//      3. + 의 의미
		System.out.println(1 + 2); //3
		System.out.println(1 + 2 + "+" +3);
		//3+3 1(숫자)+2(숫자)+"+"(출력)+3
		System.out.println("" + 1 + 2);//12
		//""문자열(출력) + 1(출력) +2(출력)
		/////게시판 연습문제 4개
		//1 + 2 = 3
		System.out.println("1 + 2 "+ "= "+ (1 + 2));//12

	}

}
