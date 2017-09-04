/**
 * 
 */
package com.renault.hackerrank;

/**
 * @author z017954
 * 
 */
public class UnaryOperatorDemo {

	private static byte a = 1;
	private static byte b = 1;
	private static int c;
	public static void main(String[] args) {
		c = ~ b + ~ a;
		System.out.println(c);
	}

}
