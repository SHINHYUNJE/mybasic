package com.company.d02_15;

import java.util.Objects;

class Milk {
	private String name;
	private int price;

	public Milk() {
		super();
		this.name = "white";
		this.price = 1300;
	}

	public Milk(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Milk other = (Milk) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}

	@Override
	public String toString() {
		return "Milk [name=" + name + ", price=" + price + "]";
	}

}

public class Test025 {
	public static void main(String[] args) {
//		[SELFTEST025] class(1) Xt5o 98.
//		1. 메인은 다음과 같다.
//		2.
		Milk m1 = new Milk("choco", 1500);
		System.out.println(m1); // choco/1500
		Milk m2 = new Milk();
		System.out.println(m2); // :white/1300
//		Milk 클래스를 구현하시오
//		클래스의 기능: 데이터를 받아서 전달하는 기능 (DTO)
//		1) 멤버변수 private name, private price
//		2) 생성자
//		기본생성자:
//		필드생성자: 이름,, 가격을 입력받아 처리해주는 생성자
//		3) 멤버함수 ---

	}
}
