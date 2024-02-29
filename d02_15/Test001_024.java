package com.company.d02_15;

import java.util.Scanner;

public class Test001_024 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

////	[SELFTEST001] 출력(1) 
////			Hello 출력
//		System.out.println("[SELFTEST001]");
//		System.out.println("1. Hello\n");
//
////	[SELFTEST002] 출력(2)
////	    System.out.println(10 + 20);  결과 : 10+20 문자열이 나오게 만들기
//		System.out.println("[SELFTEST002]");
//		System.out.println("10+20");
//
////	[SELFTEST003] 입력   Scanner 테스트
////	   	당신의 이름을 입력하세요. __입력받기
////	 	당신의 이름은 __입니다.
//		System.out.println("[SELFTEST003]");
//
//		System.out.print("당신의 이름을 입력하세요. ");
//		String name = sc.next();
//		System.out.println("당신의 이름은 " + name + " 입니다.");
//
////	[SELFTEST004] IF (1형식)
////	 * 1형식은 무조건 IF구문안을 읽는다. 모든과목 체크
////	   	[1]국어점수를입력해주세요 __입력받기
////	 	[2]영어점수를입력해주세요 __입력받기
////	 	[3]수학점수를입력해주세요 __입력받기
////	 	※ 과락인 모든과목을 출력해주세요.
////	 	만약 국어점수가 40점 미만이라면 국어과락 
////	   	만약 영어점수가 40점 미만이라면 영어과락 
////	 	만약 수학점수가 40점 미만이라면 수학과락 
//		System.out.println("[SELFTEST004]");
//		System.out.print("[1]국어점수를입력해주세요 ");
//		int kor4 = sc.nextInt();
//		System.out.print("[2]영어점수를입력해주세요 ");
//		int eng4 = sc.nextInt();
//		System.out.print("[3]수학점수를입력해주세요 ");
//		int math4 = sc.nextInt();
//		String result = "";
//		if (kor4 < 40)
//			result += "국어과락 ";
//		if (eng4 < 40)
//			result += "영어과락 ";
//		if (math4 < 40)
//			result += "수학과락 ";
//		System.out.println(result);
//
////	[SELFTEST005] IF (2형식)
////	 * 맞다 /틀리다
////	   	당신의 나이를 입력하세요. __입력받기
////	 	만약 19세 미만이라면 당신은  미성년자입니다.
////	 	아니라면 성인입니다.
//		System.out.println("[SELFTEST005]");
//		System.out.print("당신의 나이를 입력하세요. ");
//		int age = sc.nextInt();
//		if (age < 19) {
//			System.out.println("미성년자입니다.");
//		} else {
//			System.out.println("성인입니다.");
//		}
//
////	[SELFTEST006] If ~ ELSE (3형식)
////	 * 여러개의 조건
////	   	[1]국어점수를입력해주세요 __입력받기
////	   	90점이상이라면 수	 / 80점 이상이라면 우/ 70점 이상이라면 미 /60점이상이라면 양 / 그 이외 가
//
//		System.out.println("[SELFTEST006]");
//		System.out.print("[1]국어점수를입력해주세요 ");
//		int kor6 = sc.nextInt();
//		String score = "";
//		if (kor6 >= 90) {
//			score = "수";
//		} else if (kor6 >= 80) {
//			score = "우";
//		} else if (kor6 >= 70) {
//			score = "미";
//		} else if (kor6 >= 60) {
//			score = "양";
//		} else {
//			score = "가";
//		}

//	[SELFTEST007] SWITCH
//	 	a,b,c중에 입력해주세요
//	 	a또는 A라면 apple
//	 	b또는 B라면 banana
//	 	c또는 C라면 coconut
//	 	그이외 대소문자 관계없이 a,b,c만 입력가능합니다 
//		System.out.println("[SELFTEST007]");
//		System.out.println("a,b,c 중에 입력해주세요");
//		char ch = sc.next().charAt(0);
//		switch (ch) {
//		case 'a': case 'A':
//			System.out.println("apple"); break;
//		case 'b': case 'B':
//			System.out.println("banana"); break;
//		case 'c': case 'C':
//			System.out.println("coconut"); break;
//		}

//		[SELFTEST008] for
//		1,2,3,4,5,6,7,8,9,10 출력
//		System.out.println("[SELFTEST008]");
//		for (int i = 1; i <= 10; i++) {
//			System.out.print(i + "\t");
//		}

//		[SELFTEST009] while
//		1,2,3,4,5,6,7,8,9,10 출력
//		System.out.println("[SELFTEST009]");
//		int i = 1;
//		while (i <= 10) {
//			System.out.print(i + "\t");
//			i++;
//		}

//		[SELFTEST010] do while
//		1,2,3,4,5,6,7,8,9,10 출력
//		System.out.println("[SELFTEST010]");
//
//		int i = 1;
//		do {
//			System.out.print(i + "\t");
//			i++;
//		} while (i <= 10);

//		[SELFTEST011] for
//		* 1~100사이를 입력할때까지 무한반복하기 * 만약 1~100사이를 입력하면 빠져나오기
//		System.out.println("[SELFTEST011]");
//		for (;;) {
//			System.out.print("1~100 사이를 입력해주세요 ");
//			int num = sc.nextInt();
//
//			if (num >= 1 && num <= 100) {
//				return;
//			}
//		}

//		[SELFTEST012] while
//		* 1~100사이를 입력할때까지 무한반복하기
//		*만약 1~100사이를 입력하면 빠져나오기
//		System.out.println("[SELFTEST012]");
//		while (true) {
//			System.out.print("1~100 사이를 입력해주세요 ");
//			int num = sc.nextInt();
//
//			if (num >= 1 && num <= 100) {
//				return;
//			}
//		}
//		[SELFTEST013] for 응용
//		원하는 단을 입력하세요 _예) 2단
//		2*1=2
//		2*2=4...
//		System.out.println("[SELFTEST013]");
		System.out.print("원하는 단을 입력하세요 ");
//		int gugu = sc.nextInt();
//
//		for (int i = 1; i < 10; i++) {
//			System.out.println(gugu + "*" + i + "=" + gugu * i);
//		}

//		String input = sc.nextLine(); // 사용자로부터 단을 입력받음, "2단" 등의 문자열 형태
//
//		// 입력받은 문자열에서 숫자만 추출
//		int dan = Integer.parseInt(input.replaceAll("[^0-9]", ""));
//
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(dan + "*" + i + "=" + (dan * i));
//		}

//		[SELFTEST014] 이중for 응용
//		2~4단까지 출력하세요
//		System.out.println("[SELFTEST014]");
//		for(int i=2; i<=4; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.println(i + "*" + j + "=" + i * j);
//			}
//			System.out.println();
//		}

//		[SELFTEST015] 배열(1)
//		1. 문자형공간이 10개인 배열 ch 만들기
//		2. for구문을 이용하여 A~J까지 입력
//		3. for구문을 이용하여 A~J까지 출력
//		System.out.println("[SELFTEST015]");
//		char[] ch = new char[10];
//		char c = 'A';
//		for (int i = 0; i < ('J' - 'A'+1); i++) {
//			ch[i] = c;
//			c++;
//		}
//		
//		for(int i=0; i<ch.length; i++) {
//			System.out.println(ch[i]+"\t");
//		}

//		[SELFTEST016] 배열(2)
//		1.2*3배열만들기
//		2. for구문을 이용하여 다음과 같이 데이터 입력
//		3. for 구문을 이용하여 다음과 같이 데이터 출력
//		100
//		101 102
//		200
//		201 202
//		System.out.println("[SELFTEST016]");
//		int[][] numArray = new int[2][3];
//		for(int i = 0; i<numArray.length; i++) {
//			for(int j = 0; j<numArray[i].length; j++) {
//				numArray[i][j] = 100*(i+1)+j;
//				System.out.print(numArray[i][j]+"\t");
//			}
//			System.out.println();
//		}

//		[SELFTEST017] 이차원배열
//		1.4*5 배열만들기
//		2. 배열에 1~20까지 데이터 입력
//		3. 다음과 같이 출력하기
//		1 2 3 4 5
//		6 7 8 9 10
//		11 12 13 14 15
//		16 17 18 19 20
//		System.out.println("[SELFTEST017]");
//		int[][] numArray = new int[4][5];
//		int start = 1;
//		for(int i = 0; i<numArray.length; i++) {
//			for(int j = 0; j<numArray[i].length; j++) {
//				System.out.print(start+"\t");
//				start++;
//			}
//			System.out.println();
//		}

//		[SELFTEST018] 함수(1) : 함수의 구조
//		1. cat() 함수 정의하시오: 접근(어디에서나), 클래스멤버, 리턴값 void, 파라미터 없음
//		2. cat() 실행시 야옹출력
//		System.out.println("[SELFTEST018]");
//		Test001 test001 = new Test001();
//		test001.cat();

//		[SELFTEST019] 함수(2) : 파라미터
//		1. hap(3.5) 함수를 정의하시오: 접근(어디에서나), 클래스멤버, 리턴값 void, 파라미터 두개의 숫자를 입력받아줌 
//		2. 기능: 3+4+5 를 더한값을 출력해줌.
//		3. hap(3,5); 결과값: 두수 사이의 합: 12

//		System.out.println("[SELFTEST019]");
//		hap(3, 5);

//		[SELFTEST020] 함수(3): return
//		1. 메인은 다음과 같다.
//		System.out.println("[BASICO02] 윤년인지, 평년인지 판단해서 윤년이면 true, 평년이면 false리턴");
//		if(leap (2018)){
//		System.out.println("윤년");
//		}else{
//		System.out.println("평년"); 출력
//		}
//		2. 윤년인지, 평년인지 판단해서 윤년이면 true, 평년이면 false리턴하는 함수를 정의하시오.
//		※ 윤년구하는공식 : 4의 배수이고 100으로 나뉘지 않음. 또한 400으로 나뉘면 윤년
//		※어디서든지 접근가능 클레스멤버 리턴값 boolean 함수이름 leap
//		파라미터 정수형인자 1(int n) : 년도를 입력함.

//		System.out.println("[SELFTEST020]");
//		System.out.println("[BASICO02] 윤년인지, 평년인지 판단해서 윤년이면 true, 평년이면 false리턴");
//		if (leap(2018)) {
//			System.out.println("윤년");
//		} else {
//			System.out.println("평년");
//		}

//		[SELFTEST021] 함수(4) : 메서드오버로딩
//		1. 다음의 결과가 나오게 메서드를 구현하시오
//		print(3,5);
//		결과값: 8출력
//		print(1.2,3.4);
//		결과값: 4.6출력
//		print('3','5');
//		결과값: 104
//		print("3","5");
//		결과값: 35 출력

//		System.out.println("[SELFTEST021]");
//		print(3, 5);
//		print(1.2,3.4);
//		print('3','5');
//		print("3","5");

//		[SELFTEST022] 함수(5) :
//		1. 메인이 다음과 같다.
//		String[] name={"아이언맨","헐크","캡틴"};
//		disp(name); 결과값: 아이언맨,헐크,캡틴
//		2. 위의 결과 처럼 결과값이 나오게 메서드를 구현하시오.
//		System.out.println("[SELFTEST022]");
//		String[] name={"아이언맨","헐크","캡틴"};
//		disp(name); //결과값: 아이언맨,헐크,캡틴

//		[SELFTEST023] 함수(6):
//		1. 메인이 다음과 같다.
//		even(10); 2,4,6,8,10
//		2. 위의 결과 처럼 결과값이 나오게 메서드를 구현하시오.

//		System.out.println("[SELFTEST023]");
//		even(10); // 2,4,6,8,10

//		[SELFTEST024] 함수(7) :
//		1. 메인이 다음과 같다. (피보나치)
//		for(int i=1; i<5; i++) { System.out.println(fibonacci(i) + " "); }
//		결과: 1 1 2 3
//		f(x) = f(x-1) + f(x-2)

//		2. 위의 결과 처럼 결과값이 나오게 메서드를 구현하시오.
//		System.out.println("[SELFTEST024]");
//		for (int i = 1; i < 10; i++) {
//			System.out.print(fibonacci(i) + " ");
//		}

	}

	// 18번
	public static void cat() {
		System.out.println("야옹");
	}

	// 19번
	public static void hap(int start, int end) {
		if (start > end) {
			System.out.println("시작하는 숫자가 끝나는 숫자보다 크면 안됩니다.");
			return;
		}
		int sum = 0;

		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}
		System.out.println("결과 : " + sum);
	}

	// 20번
	public static boolean leap(int year) {
		boolean result = false;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			result = true;
		}
		return result;
	}

//	1. 다음의 결과가 나오게 메서드를 구현하시오
//	print(3,5);
//	결과값: 8출력
//	print(1.2,3.4);
//	print('3','5');
//	print("3","5");
	// 21번
	public static void print(int a, int b) {
		System.out.println(a + b);
	}

	public static void print(double a, double b) {
		System.out.println(a + b);
	}

	public static void print(char a, char b) {
		System.out.println(a + b);
	}

	public static void print(String a, String b) {
		System.out.println(a + b);
	}

	// 22번
	public static void disp(String[] name) {
		String result = "";
		for (int i = 0; i < name.length; i++) {
			if (i == name.length - 1) {
				result += name[i];
			} else {
				result += name[i] + ", ";
			}
		}
		System.out.println(result);
	}

	// 23번
	public static void even(int num) {
		String result = "";
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				result += (i == 2) ? "" : ", " + i;
			}
		}
		System.out.println(result);
	}

	// 24번
	public static int fibonacci(int i) {
		int result = 0;
		if (i == 1 || i == 2) {
			result = 1;
		} else if (i <= 0) {
			System.out.println("1보다 큰 값을 입력해주세요");
			result = 0;
		} else {
			result = fibonacci(i - 1) + fibonacci(i - 2);
		}
		return result;
	}

}
