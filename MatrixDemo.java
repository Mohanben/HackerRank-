/**
 * 
 */
package com.renault.hackerrank;

import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class MatrixDemo {

	private static int[][] a;
	private static int[][] b;
	private static int[][] c;
	private static int m, n, o, p, q;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter row and column value for A Matrix");
		m = scanner.nextInt();
		n = scanner.nextInt();
		System.out.println("Enter row and column value for B Matrix");
		//p = scanner.nextInt();
		o = scanner.nextInt();
		a = new int[m][n];
		b = new int[n][o];
		c= new int[m][o];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Enter value for A matrix");
				a[i][j] = scanner.nextInt();
				//System.out.print(a[i][j]);
				//System.out.println("\n");
			}
		}
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < q; j++) {
				System.out.println("Enter value for B matrix");
				b[i][j] = scanner.nextInt();
				//System.out.print(b[i][j]);
				//System.out.println("\n");
			}
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < o; j++) {
				for (int k = 0; k <n ; k++) {
					c[i][j] = 0;
					c[i][j] =c[i][j] +a[i][k] * b[k][j]; 
				}
			}
			
		}
		scanner.close();
	}
}
