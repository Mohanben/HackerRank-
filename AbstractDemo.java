/**
 * 
 */
package com.renault.hackerrank;

import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class AbstractDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		MyBook book = new MyBook();
		book.setTitle(input);
		System.out.println("The title is: "+book.getTitle());
		scanner.close();
	}

}

abstract class Book {
	String title;

	abstract void setTitle(String title);

	String getTitle() {
		return title;
	}
}

class MyBook extends Book {

	void setTitle(String title) {
		this.title = title;
	}

}
