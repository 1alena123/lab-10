package com.company;

public class Main {

	public static void main(String[] args) {

	Method1 met1 = new Method1();
		met1.start();
		met1.start1();

	Method2 met2 = new Method2();
		met2.start3(1);
		met2.start3(2);
		met2.start3(3);

	ExceptoinDemo met3 = new ExceptoinDemo();
		try {
			met3.start3(1);
			met3.start3(20);
		} catch (Method3 e) {
			System.out.println(" исключение: " + e);
		}
	}
}
