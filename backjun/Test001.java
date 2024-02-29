package com.company.backjun;

import java.util.LinkedList;
import java.util.List;

public class Test001 {
	public static void main(String[] args) {
//		List<Integer> list = new LinkedList<>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		
//		System.out.println("1. ");
//		for (int i : list) {
//			System.out.println(i);
//		}
//		System.out.println("\n\n2. ");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}

		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Apple");
		linkedList.add("Banana");
		linkedList.add("Orange");

		// 중간에 요소 추가
		linkedList.add(1, "Grapes");

		// 중간에 요소 삭제
		linkedList.remove(2);

		// 리스트 순회
		for (String fruit : linkedList) {
			System.out.println(fruit);
		}
	}
}
