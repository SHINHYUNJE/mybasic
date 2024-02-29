package com.company.d02_15;

class MilkPrint {
	void show(Milk[] milks) {
		for (int i = 0; i < milks.length; i++) {
			System.out.println(milks[i]);
		}
	}
}

public class Test026 {
	public static void main(String[] args) {
//		[SELFTEST026] class(2) ||^
//		1. 메인은 다음과 같다.
//		Milk []milks = new Milk[3];
//		milks[0] = new Milk("white", 1000); milks[1] = new Milk("choco",1200); milks[2] = new Milk("banana",1500);
//		MilkPrint print = new MilkPrint(); print.show(milks
//		// 출력된 결과:
//		* white / 1000
//		* choco / 1200
//		* banana / 1500
//		);
//		2.
//		MilkPrint 클래스를 구현하시오

		Milk[] milks = new Milk[3];
		milks[0] = new Milk("white", 1000);
		milks[1] = new Milk("white", 1200);
		milks[2] = new Milk("white", 1500);

		MilkPrint print = new MilkPrint();
		print.show(milks);

	}
}
