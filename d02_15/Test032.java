package com.company.d02_15;

public class Test032 {
	public static void main(String[] args) {
		Thread dan = new Thread() {
			@Override
			public void run() {
				for (int i = 2; i <= 9; i++) {
					for (int j = 1; j <= 9; j++) {
						System.out.print(i + "*" + j + "=" + i * j + "\t");
					}
					System.out.println();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		dan.start();
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			System.out.print((sum += i) + "\t");
			if (i % 9 == 0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println();
			}
		}

	}
}
