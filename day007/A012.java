package com.company.day007;

public class A012 {
	public static void main(String[] args) {
		// int 보다 작은 자료형은 연산시 int 로 자동형변환

		char ch = 'A';
		System.out.println('C' - ch); // 2
		// 1. char-char
		// 2. 'C' - 'A'
		// 3. int = int-int
		// 4. 2 = 'C'(67) - 'A'(65)
		System.out.println('5' + '4'); // 1
		System.out.println((int)'5'); // 1

		System.out.println(ch + 1);// 66
		// 1. 문자는 저장시 숫자로 , 출력 문자로
		System.out.println(++ch);// B
		System.out.println(ch++);// B

	}

}
