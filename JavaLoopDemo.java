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
 * Given an integer,N, print its first 10 multiples. Each multiple N*i (where
 * i<n<10 ) should be printed on a new line in the form: N x i = result.
 */
public class JavaLoopDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for (int i = 0; i <= 10; i++) {
			System.out.println(N + " x " + i + " = " + N * i);
		}
		scanner.close();
	}

}
