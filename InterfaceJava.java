/**
 * 
 */
package com.renault.hackerrank;

/**
 * @author z017954
 * 
 */
public class InterfaceJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Note note = new Note();
		Note testNote = new TestNote();
		note.getName();
		testNote.getName();
		
	}

}

class TestNote extends Note {
	public void getName() {
		System.out.println("child class is called");
	}
}

/*
 * class MyNote { public void getName() {
 * System.out.println("Main Parent is called"); } }
 */

class Note {
	public void getName() {
		System.out.println("getName is called");
	}
}
