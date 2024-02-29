package com.company.d02_15;

class TestA2 {
	int a = 10;

	@Override
	public String toString() {
		return "TestA2 [a=" + a + "]";
	}
}

class TestB2 extends TestA2 {
	int b = 20;

	@Override
	public String toString() {
		return "TestB2 [b=" + b + "]";
	}

}

public class Test027 {
	public static void main(String[] args) {
		TestA2 ta = new TestA2();
		TestB2 tb = (TestB2) ta;
		System.out.println(tb);
		// 자식은 부모를 담을 수 없다 
	}
}
