package com.renault.hackerrank;

import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class StaticInitilizationBlockDemo {

	static {

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int B = scanner.nextInt();
		int H = scanner.nextInt();
		try {
			if (B >= 0 && H >= 0 && B <= 100 && H <= 100) {
				int P = B * H;
				System.out.println(P);
			}
		} catch (Exception e) {
			System.out
					.println("java.lang.Exception: Breadth and height must be positive");
		}
		scanner.close();
	}

}
