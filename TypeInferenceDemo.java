package com.renault.hackerrank;

import java.util.ArrayList;

/**
 * @author z017954
 * 
 */
public class TypeInferenceDemo {

	public static void main(String[] args) {
		ArrayList<Integer> s = new ArrayList<Integer>();
		arrayList(s);
	}

	private static <M, V> void pick(M t, M t2, V v) {
		// return t;

	}

	private static ArrayList<? extends String> arrayList(
			ArrayList<? extends Object> s) {
		return null;

	}
}
