package com.renault.hackerrank;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class JavaPrimitiveDataType {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PrintType printTyp = new PrintType();
		int T = scanner.nextInt();
		for (int i = 0; i < T; i++) {
			long input = scanner.nextLong();
			try {
				System.out.println(input + " can be fitted in");
				printTyp.printType(input);
			} catch (Exception e) {

			}
		}
		scanner.close();
	}

}

class PrintType {
	public void printType(long input) throws InputMismatchException {
		try {
			if (input >= Byte.MIN_VALUE && input <= Byte.MAX_VALUE) {
				System.out.println("* byte");
			}
			if (input >= Short.MIN_VALUE && input <= Short.MAX_VALUE) {
				System.out.println("* short");
			}
			if (input >= Integer.MIN_VALUE && input <= Integer.MAX_VALUE) {
				System.out.println("* int");
			}
			if (input >= Long.MIN_VALUE && input <= Integer.MAX_VALUE) {
				System.out.println("* long");
			}
		} catch (Exception e) {
			System.out.println(input + "can't be fitted in");
		}

	}
}
