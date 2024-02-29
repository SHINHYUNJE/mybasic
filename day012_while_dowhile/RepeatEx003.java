package com.company.day012_while_dowhile;

public class RepeatEx003 {
	public static void main(String[] args) {

		int sum = 0, i = 1;
		String result = "";

		for (;;) {
			if (sum >= 100) {
				break;
			}
			if (i % 2 == 0) {
				sum += -i;
				result += "+("+-i;
			} else {
				sum += i;
				result += (i==1 ? "":")+")+i;
			}
			i++;
		}
		System.out.println("1+(-2)+3+(-4)+.. 의 합이 100 이상이 되는 순간은 : " + (i-1));
		System.out.println(result+" >>>> " + (i-1));
		i = 1;sum = 0; result = "";
		while (true) {
			if (sum >= 100) {
				break;
			}
			if (i % 2 == 0) {
				sum += -i;
				result += "+("+-i;
			} else {
				sum += i;
				result += (i==1 ? "":")+")+i;
			}
			i++;
		}
		System.out.println("1+(-2)+3+(-4)+.. 의 합이 100 이상이 되는 순간은 : " + (i-1));
		System.out.println(result+" >>>> " + (i-1));
		i = 1;sum = 0;result = "";
		do {
			if (sum >= 100) {
				break;
			}
			if (i % 2 == 0) {
				sum += -i;
				
				result += "+("+-i;
			} else {
				sum += i;
				
				result += (i==1 ? "":")+")+i;
			}
			i++;
		} while (true);
		System.out.println("1+(-2)+3+(-4)+.. 의 합이 100 이상이 되는 순간은 : " + (i-1));
		System.out.println(result+" >>>> " + (i-1));

	}
}
