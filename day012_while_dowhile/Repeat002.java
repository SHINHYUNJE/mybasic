package com.company.day012_while_dowhile;

public class Repeat002 {
	public static void main(String[] args) {
		System.out.println("Q1) 1  2  3  4  5");
		for(int i=1; i<6; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		int i = 1;
		while(i<6) {
			System.out.print(i+"\t");
			i++;
		}
		System.out.println();
		i = 1;
		do {
			System.out.print(i+"\t");
			i++;
		}while(i<6);
		System.out.println(); 
		
		System.out.println("Q2) 5  4  3  2  1");
		for(i=5; i>0; i--) {
			System.out.print(i+"\t");
		}
		System.out.println();
		i = 5;
		while(i>0) {
			System.out.print(i+"\t");
			i--;
		}
		System.out.println();
		i = 5;
		do {
			System.out.print(i+"\t");
			i--;
		}while(i>0);
		System.out.println();
		
		System.out.println("Q3) JAVA1  JAVA2  JAVA3");
		for(i=1; i<4; i++) {
			System.out.print("JAVA"+i+"\t");
		}
		System.out.println();
		i = 1;
		while(i<4) {
			System.out.print("JAVA"+i+"\t");
			i++;
		}
		System.out.println();
		i = 1;
		do {
			System.out.print("JAVA"+i+"\t");
			i++;
		}while(i<4);
		
	}

}
