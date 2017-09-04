package com.renault.hackerrank;

/**
 * @author z017954
 * 
 */
public class InheritanceII {

	public static void main(String[] args) {
		Adder adder = new Adder();

		System.out.println(adder.add(10, 10));
		System.out.println(adder.add(20, 20));
		System.out.println("MySuper Class Name is :"
				+ adder.getClass().getSuperclass().getName());
	}

}

class Arithmetic {
	int add(int a, int b) {
		return a + b;
	}
}

class Adder extends Arithmetic {

}