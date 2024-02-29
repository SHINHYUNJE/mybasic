package com.company.backjun;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("입력");
//		String a = sc.next();
//
//		char[] array_a = new char[a.length()];
//		for (int i = 0; i < array_a.length; i++) {
//			array_a[i] = a.charAt(i);
//			if (array_a[i] >= 'A' && array_a[i] <= 'Z') {
//				System.out.print((char) (array_a[i] + 32));
//			} else if (array_a[i] >= 'a' && array_a[i] <= 'z') {
//				System.out.print((char) (array_a[i] - 32));
//			}
//		}
//
//		String answer = "";
//
//		// Stack <Character> stack = new Stack <> ();
//
//		for (Character c : a.toCharArray()) {
//			if (Character.isUpperCase(c)) {
//				// stack.push(Character.toLowerCase(c));
//				answer += Character.toLowerCase(c);
//			} else if (Character.isLowerCase(c)) {
//				// stack.push(Character.toUpperCase(c));
//				answer += Character.toUpperCase(c);
//			}
//		}
//		System.out.println(answer);
//		String a = " !@#$%^&*(\\'\"<>?:; ";
//		System.out.println(a);
//		System.out.print(
//				"!" + "@" + "#" + "$" + "%" + "^" + "&" + "*" + "(" + "\\" + "\'" + "\"" + "<" + ">" + "?" + ":" + ";");
//        System.out.println("!@#$%^&*(\\'\"<>?:;");
//        System.out.println("!@#$%^&*(\\'\"<>?:;");

//        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//        for(char c : a.toCharArray()){
//            System.out.println(c);
//        }

		Scanner sc = new Scanner(System.in);
		String my_string = sc.next();
		String overwrite_string = sc.next();
		int s = sc.nextInt();

		String answer = "";
		for (int i = 0; i < my_string.length(); i++) {
			if (i < (s - 1)) {
				answer += my_string.charAt(i);
			} else if (i >= s) {

			}

		}

	}
}