package com.bellinfo.batch2.day8;

import java.util.Scanner;

public class ArrayWhileLoop {

	public static void main(String[] args) {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Integers");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter The Numbers");
		while (i < array.length) {
			array[i] = sc.nextInt();
			i++;
		}
		i = 0;
		System.out.println("Entered Numbers are...");
		while (i < array.length) {
			System.out.println(array[i]);
			i++;
		}
		System.out.println("Reverse Of Numbers...");
		i = array.length - 1;
		while (i >= 0) {
			System.out.println(array[i]);
			i--;
		}
	}

}
