package com.company.d02_15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test035 {
//	[SELFTEST035]  stream
//		*1. stream을이용하여 list, arr 을 다음과 같이 출력이 되도록 만드시오.
//	List&lt;Integer&gt; list = Arrays.asList(1,2,3,4,5,2,4);
//	int [] arr = {1,2,3,4,5,2,4};
//	
//	출력결과 : [3, 4, 5] 
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 2, 4);
		int[] arr = { 1, 2, 3, 4, 5, 2, 4 };

		Stream.of(list).forEach(i -> System.out.println(i));
		;
	}
}
