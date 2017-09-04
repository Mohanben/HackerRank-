package com.renault.hackerrank;

import java.util.Scanner;

public class NumberOccurenceCharDemo {

	/**
	 * @param args
	 */
	private static char[] count;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		count = new char[256];
		int length = input.length();
		for (int i = 0; i < length; i++) {
			count[i] = input.charAt(i);
		}
		for (int i = 0; i < length; i++) {
			for (int j = 0; j <= i; j++) {
				if (count[i] == count[j]) {
					System.out.println(" --- " + count[i]++);
				}
			}
		}

		scanner.close();
	}

}
