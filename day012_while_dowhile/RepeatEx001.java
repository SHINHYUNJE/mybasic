package com.company.day012_while_dowhile;

public class RepeatEx001 {
	public static void main(String[] args) {
		int sum = 0;
		String result = "";
		for(int i = 1; i<21; i++) {
			if(!(i%2==0||i%3==0)) {
				sum += i;
				result += ((i==1)? "":"+")+i;
			}
		}
		System.out.println("ㅁ for : 1~20까지의 정수중에서 2또는 3의 배수가아닌 수의 총합");
		System.out.println(result+"="+sum+"\n\n");
		sum = 0;int i = 1; result = "";
		while(i<21) {
			if(!(i%2==0||i%3==0)) {
				sum += i;
				result += ((i==1)? "":"+")+i;
			}
			i++;
		}
		System.out.println("ㅁ while : 1~20까지의 정수중에서 2또는 3의 배수가아닌 수의 총합");
		System.out.println(result+"="+sum+"\n\n");
		sum = 0;i = 1; result = "";
		do {
			if(!(i%2==0||i%3==0)) {
				sum += i;
				result += ((i==1)? "":"+")+i;
			}
			i++;
		}while(i<21);
		System.out.println("ㅁ do while : 1~20까지의 정수중에서 2또는 3의 배수가아닌 수의 총합");
		System.out.println(result+"="+sum+"\n\n");
	}

}
