package com.company.day004;

public class A021 {
	public static void main(String[] args) {
		//#1. 같은 자료형간의 연산
		int v1 = 1+2;  // 실수>정수, 사이즈 int = int + int
		int v2 = 10/3; // int = int / int
		float v3 = 1.2f + 3.4f; //float = float + float
		double v4 = 5.6/2.0;    //double = double / double 
        System.out.println(v1+"\t"+v2+"\t"+v3+"\t"+v4);
        
		//#2. int 보다 작은 자료형
        byte b1 = 1;    // b1[1]
        byte b2 = 2;    // b2[2]
        byte v51 = 1+2; 
        byte v52 = (byte) (b1+b2); // byte = int + int -> X 오류
        int v53 = b1+b2;  // int  = int + int -> O 정상
        System.out.println(v51+"\t"+v52+"\t"+v53);
		
		//#3. 다른 자료형간의 연산
         double v6 = 1+2.3; // double = int + double
         int    v7 = (int)(1+2.9);
         int    v8 = 1+(int)2.9;
         System.out.println(v6+"\t"+v7+"\t"+v8); 
        //#4 ex
        /* byte d3 = 3;    short d4 = 5;
         * byte v9 = d3+d4;   // Q1) error O/X 
         * byte v9 = d3+d4;   // Q2) byte  v9 고정 오류안나게
         * short v10 = d3+d4; // Q3) short v10 고정 오류안나게
         * int v11 = d3+d4;   // Q4) error O/X X
         */
         byte d3 = 3;    short d4 = 5;
         byte v9 = (byte) (d3+d4);
         short v10 = (short) (d3+d4);
         int v11 = d3+d4;
         System.out.println(v9+"\t"+v10+"\t"+v11); 
         
	}

}
