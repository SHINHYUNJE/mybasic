package com.company.day004;

public class A018 {
	public static void main(String[] args) {
//		q1)
		System.out.println((int) 1.5 + (int) 2.7);
//	    q2)
		byte b = 1;
		int i = 2;
		long l = 3L;
		boolean bl = true;
		float f = 1.1f;
		double d = 1.1;

//		bl = b;//boolean 형변환 X
		i = b; // 1.실수 > 정수 2.사이즈 4 = 1 (byte)
		i = (int) l; // 1.실수 > 정수 2.사이즈 4 = 8
		l = i; // 1/실수 > 정수 2/사이즈 8 = 4
		f = (float) d; // 1.실수 > 정수 2.사이즈 4 = 8
		d = f; // 1.실수 > 정수 2.사이즈 8 = 4
		f = l; // 1.실수 > 정수 2.사이즈 4 = 8
	}

}
