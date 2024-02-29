package com.company.day006;

public class A005 {
	public static void main(String[] args) {
		/*
		 * 1. 먼저() 비교조건후 대입! 
		 * 2. 값을 구하고(++,--,*,/,+,-,<<,>>) 
		 * 3. 비교( <, >) 
		 * 4. 조건( &&, ||, ! , ^, ||, |)
		 * 5. 대입(=)
		 */
		//#1. << , >>
		// << 곱하기                     나누기 >>
        //    256  128  64  32  16  0  4  2  1	
		System.out.println(16 << 3); //128 = 16*(2^3)
		System.out.println(16 >> 3); //2   = 16/(2^3)
		//Q1) 3<<2 값은 ? 
		 System.out.println(3 << 2); //12
		//Q2) 다음 계산은
		 int x=2;
		 System.out.println(1+x << 33);
		 //1. 1+2
		 //2. 3 * 2^33 -> int 범위(32bit) 넘어가서 3 * 2^1
		 //Q3)
		 //곱하기
		 System.out.println(3<<1); //6
		 System.out.println(-3<<1); //-6
		 System.out.println(3<<2); //12
		 System.out.println(-3<<2); //-12
		 //나누기
		 System.out.println(5>>1); // 5 / 2^1 = 5/2 = 2.5 = 2 (양수-소수점버림)
		 System.out.println(-5>>1); // -5 / 2^1 = -5/2 = -2.5 = -3 (음수-소수점올림)
		 System.out.println(5>>2); // 5 / 2^2 = 5/4 = 1
		 System.out.println(-5>>2); // -5 / 2^2 = -5/4 = -2
		 //Q4)
		 System.out.println(-19>>3); // -19 / 2^3 = -19/8 = -3
		 System.out.println(-19<<3); // -19 * 2^3 = -152
		 //#2 >>>
		 System.out.println(Integer.toBinaryString(3)); 
		 System.out.println(Integer.toBinaryString(-3)); 
		 // 0000 0000 0000 0000 0000 0000 0000 0011 = 3
		 // 1111 1111 1111 1111 1111 1111 1111 1101 = -3
		 System.out.println(3 >>> 1); // 1   -  a >>> b 오른쪽으로 b만큼 shift 
		 // 1-1. 0000 0000 0000 0000 0000 0000 0000 0011 = 3
		 // 1-2.  0000 0000 0000 0000 0000 0000 0000 001 = 1
		 // 1-3.  2^0 = 1
		 System.out.println(-3 >>> 31); // 1
		 // 2.1 1111 1111 1111 1111 1111 1111 1111 1101 = -3
		 // 2.2 0000 0000 0000 0000 0000 0000 0000 0001 = 1
		 System.out.println(-3 >>> 30); // 3
		 // 2.1 1111 1111 1111 1111 1111 1111 1111 1101 = -3
		 // 2.2 0000 0000 0000 0000 0000 0000 0000 0011 = 1
//		 System.out.println(-3 <<< 30); <<< 없는 연산자

     


		 



		 


	}

}
