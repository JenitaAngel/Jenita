package org.demo.test;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = scr.nextInt();
		int f1 = 0;
		int f2 = 1;
		int f3 = -1;
		int a = 0;

		for (int i = 0; i < n; i++) {
			a = f3 + f2;
			f3 = f2;
			f2 = a;
		}
		System.out.println(a);
		scr.close();
	}
}
