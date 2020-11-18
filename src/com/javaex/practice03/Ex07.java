package com.javaex.practice03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		
		for(int line = 1; line <= 6; line++) {
			for(int x = line; x <= line; x++) {
				System.out.print(x);
			}		
			System.out.println();
		}
	}
	
}
