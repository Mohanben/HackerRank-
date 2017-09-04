/**
 * 
 */
package com.renault.hackerrank;

/**
 * @author z017954
 * 
 */
public class MethoOverrridingDemo {

	public static void main(String[] args) {
		Sports sports = new Sports();
		System.out.println(sports.getName());
		sports.getNumberOfTeamMembers();
		Soccer soccer = new Soccer();
		System.out.println(soccer.getName());
		soccer.getNumberOfTeamMembers();
	}

}

class Sports {
	String getName() {
		return "Generic Sports";
	}

	void getNumberOfTeamMembers() {
		System.out.println("Each team has n players in " + getName());
	}
}

class Soccer extends Sports {
	String getName() {
		return "Soccer Class";
	}

	void getNumberOfTeamMembers() {
		System.out.println("Each team has 11 players in " + getName());
	}
}