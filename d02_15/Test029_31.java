package com.company.d02_15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Test029_31 {
	public static void main(String[] args) {
//		[SELFTEST029] ArrayList
//		dto 를 이용하여 ArrayList + Iterator 이용해서 만들기 
		Milk[] milks = new Milk[3];
		milks[0] = new Milk("white", 1000);
		milks[1] = new Milk("choco", 1200);
		milks[2] = new Milk("banana", 1300);

		List<Milk> list = new ArrayList<>();
		for (Milk m : milks) {
			list.add(m);
		}

		Iterator<Milk> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
//		[SELFTEST030] HashSet
//		* dto를 이용하여 HashSet + Iterator 이용해서 만들기 
		Set<Milk> set = new HashSet<>();
		for (Milk m : milks) {
			set.add(m);
		}

		Iterator<Milk> iterSet = set.iterator();
		while (iterSet.hasNext()) {
			System.out.println(iterSet.next());
		}

//		[SELFTEST031] HashMap
//		* dto를 이용하여 HashMap + Iterator 이용해서 만들기
		Map<String, Integer> map = new HashMap<>();
		for (Milk m : milks) {
			map.put(m.getName(), m.getPrice());
		}
		Iterator<Entry<String, Integer>> elter = map.entrySet().iterator();
		while (elter.hasNext()) {
			Entry<String, Integer> entry = elter.next();
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}

	}
}
