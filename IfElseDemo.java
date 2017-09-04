/**
 * 
 */
package com.renault.hackerrank;

import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class IfElseDemo {
	private static final int LIMIT = 100;
	private static final int NOT_WEIRD_RANGE_TWO = 2;
	private static final int NOT_WEIRD_RANGE_FIVE = 5;
	private static final int WEIRD_RANGE_SIX = 6;
	private static final int WEIRD_RANGE_TWENTY = 20;
	private static final String WEIRD = "Weird";
	private static final String NOT_WEIRD = "Not Weird";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if (input <= LIMIT) {
			if (input % 2 == 0) {
				if (input >= NOT_WEIRD_RANGE_TWO && input <= NOT_WEIRD_RANGE_FIVE) {
					System.out.println(NOT_WEIRD);
				} else if (input >= WEIRD_RANGE_SIX
						&& input <= WEIRD_RANGE_TWENTY) {
					System.out.println(WEIRD);
				} else if (input >= WEIRD_RANGE_TWENTY) {
					System.out.println(NOT_WEIRD);
				}
			} else {
				System.out.println(WEIRD);
			}
		}
		scanner.close();
	}

}
