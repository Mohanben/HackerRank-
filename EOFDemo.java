/**
 * 
 */
package com.renault.hackerrank;

import java.util.Scanner;

/**
 * @author z017954
 *
 */
public class EOFDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i=1;
		while (scanner.hasNextLine()) {
			String mString = scanner.nextLine();
			System.out.println(i+++" "+mString);
		}
		scanner.close();
	}

}


