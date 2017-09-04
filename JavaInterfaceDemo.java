/**
 * 
 */
package com.renault.hackerrank;

import java.util.Scanner;

/**
 * @author z017954
 * 
 */

/*
 * 
 * A Java interface can only contain method signatures and fields. The interface
 * can be used to achieve polymorphism. In this problem, you will practice your
 * knowledge on interfaces.
 * 
 * You are given an interface AdvancedArithmetic which contains a method
 * signature int divisor_sum(int n). You need to write a class called
 * MyCalculator which implements the interface.
 * 
 * divisorSum function just takes an integer as input and return the sum of all
 * its divisors. For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum
 * should return 12. The value of n will be at most 1000.
 * 
 * Read the partially completed code in the editor and complete it. You just
 * need to write the MyCalculator class only. Your class shouldn't be public.
 */
public class JavaInterfaceDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MyCalCulator calCulator = new MyCalCulator();
		System.out.println(calCulator.divisor_sum(scanner.nextInt()));
		ImplemnetdInterfaceClassName(calCulator);
		scanner.close();
	}

	private static void ImplemnetdInterfaceClassName(Object object) {
		Class[] classes = object.getClass().getInterfaces();
		for (int i = 0; i < classes.length; i++) {
			String className = classes[i].getName();
			System.out.println(className);
		}
	}

}

class MyCalCulator implements AdvancedArithmetic {
	int sum = 0;

	public int divisor_sum(int n) {
		for (int i = n; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					sum = sum + j;
				}
			}
		}
		return sum;
	}

}

interface AdvancedArithmetic {
	public int divisor_sum(int n);
}
