package com.company.day012_while_dowhile;

public class RepeatEx004 {
	public static void main(String[] args) {
		int sum = 0;
		int a = 12345;
		for(int i = 0; i<5; i++) {
			sum += (a/Math.pow(10, i))%10; 
		}
		System.out.println("ver-1 for");
		System.out.println(sum);
		
		sum = 0; int i = 0;
		while(i<5) {
			sum += (a/Math.pow(10, i))%10; 
			i++;
		}
		System.out.println("ver-2 while");
		System.out.println(sum);
		sum = 0; i = 0;
		do {
			sum += (a/Math.pow(10, i))%10; 
			i++;	
		}while(i<5);
		System.out.println("ver-3 do while");
		System.out.println(sum);
		sum = 0; 
		
		//other version
		for(;a>0;) {
			sum += a%10; a/=10;
		}
		System.out.println(sum);
	}

}
