package com.renault.hackerrank;

import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class JavaStdIStdIIDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int integerInput = scanner.nextInt();
		double doubleInput = scanner.nextDouble();
		scanner.nextLine();
		String stringInput = scanner.nextLine();

		TypeTester typeTester = new TypeTester();
		typeTester.printType(stringInput);
		typeTester.printType(doubleInput);
		typeTester.printType(integerInput);

		scanner.close();
	}

}

class TypeTester {
	public void printType(String string) {
		System.out.println("String :" + string);
	}

	public void printType(double doubleInput) {
		System.out.println("Double :" + doubleInput);
	}

	public void printType(int integer) {
		System.out.println("int :" + integer);
	}
}
