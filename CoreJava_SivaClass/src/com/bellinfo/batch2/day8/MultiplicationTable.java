package com.bellinfo.batch2.day8;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number of Tables");
		int No = sc.nextInt();
		System.out
				.println("Enter The till what number Multiplication to be Done");
		int mul = sc.nextInt();

		for (int j = 1; j <= No; j++) {
			System.out.println("\t");
			for (int i = 1; i <= 10; i++) {
				if(i>mul){
					//break;
					continue;
					
				}
				System.out.println(j + "*" + i + "=" + j * i);
			}

		}
	}

}
