package com.renault.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class InstanceOfDemo {
	private static ArrayList arrayList;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		arrayList = new ArrayList();
		try {
			int T = scanner.nextInt();
			for (int i = 0; i < T; i++) {
				String inputString = scanner.next();
				if (inputString.equalsIgnoreCase("Student")) {
					arrayList.add(new Student());
				}
				if (inputString.equalsIgnoreCase("Hacker")) {
					arrayList.add(new Hacker());
				}
				if (inputString.equalsIgnoreCase("RockStar")) {
					arrayList.add(new RockStar());
				}
			}
			System.out.println(count(arrayList));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		scanner.close();
	}

	private static String count(ArrayList<Number> list) {
		int a = 0, b = 0, c = 0;
		for (int i = 0; i < list.size(); i++) {
			Object elemets = list.get(i);
			if (elemets instanceof Student) {
				a++;
			}
			if (elemets instanceof RockStar) {
				b++;
			}
			if (elemets instanceof Hacker) {
				c++;
			}
		}

		String string = Integer.valueOf(a) + " " + Integer.valueOf(b) + " "
				+ Integer.valueOf(c);
		return string;
	}

}

class Student {

}

class Hacker {

}

class RockStar {

}
