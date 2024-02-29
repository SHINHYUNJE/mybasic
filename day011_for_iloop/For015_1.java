package com.company.day011_for_iloop;

import java.util.Scanner;

public class For015_1 {
	public static void main(String[] args) {
		int num1 = -1, num2 = -1;
		char oper = ' ';
		String result = " ";

		Scanner scanner = new Scanner(System.in);

		for (;;) {
			if (!(num1 >= 0 && num1 <= 100)) {
				System.out.print("1. 정수 하나  입력 > ");
				num1 = scanner.nextInt();
				continue;
			} 
			if (!(num2 >= 0 && num2 <= 100)) {
				System.out.print("2. 정수 하나  입력 > ");
				num2 = scanner.nextInt();
				continue;
			} 
			if (!(oper == '+' || oper == '-' || oper == '*' || oper == '/')) {
				System.out.print("연산자 입력 > ");
				oper = scanner.next().charAt(0);
				continue;	
			} 
			break;
		}

		switch (oper) {
		case '+':
			result = "" + num1 + oper + num2 + " = " + (num1 + num2);
			break;
		case '-':
			result = "" + num1 + oper + num2 + " = " + (num1 - num2);
			break;
		case '*':
			result = "" + num1 + oper + num2 + " = " + (num1 * num2);
			break;
		case '/':
			result = "" + num1 + oper + num2 + " = " + (num1 / num2);
			break;
		}
		System.out.println(result);
	}
}
