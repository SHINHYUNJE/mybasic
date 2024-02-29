package com.company.day006;

public class A004 {
	public static void main(String [] args) {
		System.out.println(Integer.toBinaryString(5)); //00000101
		System.out.println(Integer.toBinaryString(3)); //00000011
		
		//&  두 값이 모두 1일때 1 (true)
		//!  두 값이 모두 0일때 0 (false)
		//^  두 값이 다를때 1 (true)
		//~  반전 0은 1로, 1은 0으로
		
		System.out.println(5 & 3); // 1
		/*
		 *               0000 0101
		 *               0000 0011
		 *               ---------
		 *               0000 0001
		 */ 
		System.out.println(5 | 3); // 7
		System.out.println(5 ^ 3); // 6
		System.out.println(~5); // -6
        /*
         *               0000 0101
         *           ->  1111 1010  -> 1은 음수 = 2^2 + 2^0 + 1 = 4+1+1 = -6
         */
        /*
         * Q1) 0의 표현방식이 2개
         * 0000 0000  값 얼마? 1. 양수  2. 1계산  3. 계산할게 없으면 0
         * 1111 1111  값 얼마? 1. 음수  2. 0계산  3. 계산할게 없으면 0
         * 
         * Q2) 
         * 11 1111 10        1. 음수 2. 0 계산  3. -(2^0+1) = -2
         * 11 1111 11        1. 음수 2. 0 계산  3. -(0+1) = -1
         */

	}

}
