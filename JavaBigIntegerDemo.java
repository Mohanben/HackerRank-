package com.renault.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author z017954
 * 
 */

/*
 * In this problem, you have to add and multiply huge numbers! These numbers are
 * so big that you can't contain them in any ordinary data types like a long
 * integer.
 * 
 * Use the power of Java's BigInteger class and solve this problem.
 * 
 * Input Format
 * 
 * There will be two lines containing two numbers,a and b .
 * 
 * Constraints
 * 
 * a and b are non-negative integers and can have maximum 200 digits.
 */
public class JavaBigIntegerDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger firstInput = scanner.nextBigInteger();
		BigInteger secondInput = scanner.nextBigInteger();
		
		BigInteger add, multiply;
		add = firstInput.add(secondInput);
		multiply = firstInput.multiply(secondInput);
		System.out.println(add);
		System.out.println(multiply);
		System.out.println("Is it Prime"
				+ firstInput.isProbablePrime(scanner.nextInt()));
		scanner.close();
	}

}
