/**
 * 
 */
package com.renault.hackerrank;

import java.text.NumberFormat;

/**
 * @author z017954
 * 
 */
public class CountMoney {

	public static void main(String[] args) {
		double money = 2122311888;
		String moneyCount = "";
		/*
		 * StringBuilder builder = new StringBuilder(); int length =
		 * money.length(); //
		 * System.out.println("Mohan = "+money.substring(7,10)); for (int i =
		 * length - 3; i > 0; i--) { builder.append(money.substring(0, length -
		 * 3) + "," + money.substring(i, length)); length = money.length();
		 * System.out.println(builder.toString()); }
		 */

		NumberFormat formatNumberFormat = NumberFormat.getInstance();
		formatNumberFormat.setGroupingUsed(true);
		formatNumberFormat.format(money);
		System.out.println(formatNumberFormat.format(money));
		
		/*NumberFormat myFormat = NumberFormat.getInstance();
	      myFormat.setGroupingUsed(true);

	      double[] numbers = { 11220.00, 232323232.24, 121211.55, 102.121212 };

	      for (double d : numbers) {
	         System.out.println(myFormat.format(d));
	      }*/
	      System.out.println();
	}

}
