package com.javaex.practice03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요. ");
		
		int input = sc.nextInt();
		
		for(int line = 1; line <= input; line++) {
			for(int x = 1; x <= line; x++) {
				System.out.print(x);
			}System.out.println();
		}sc.close();
		
	}
	
}
