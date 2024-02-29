package com.company.day012_while_dowhile;

public class RepeatEx002 {
	public static void main(String[] args) {
		int sum = 0;
		int sub = 0;
		String subResult = "", sumResult = "";

		for (int i = 1; i < 11; i++) {
			sub += i;
			sum += sub;
			subResult += (i == 1 ? "" : "+") + i;
			sumResult += subResult + (i == 1 ? "+(" : i == 10 ? ")=" : ")+(");
		}
		System.out.println(sumResult + sum + "\n");
		sub = 0;sum = 0;int i = 1;subResult = "";sumResult = "";
		while (i < 11) {
			sub += i;
			sum += sub;
			subResult += (i == 1 ? "" : "+") + i;
			sumResult += subResult + (i == 1 ? "+(" : i == 10 ? ")=" : ")+(");
			i++;
		}
		System.out.println(sumResult + sum + "\n");
		sub = 0;sum = 0;i = 1;subResult = "";sumResult = "";
		do {
			sub += i;
			sum += sub;
			subResult += (i == 1 ? "" : "+") + i;
			sumResult += subResult + (i == 1 ? "+(" : i == 10 ? ")=" : ")+(");
			i++;
		} while (i < 11);
		System.out.println(sumResult + sum);

	}

}
