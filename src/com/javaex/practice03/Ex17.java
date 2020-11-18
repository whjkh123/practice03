package com.javaex.practice03;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int count = sc.nextInt();
		for(int y = count; y > 0; y--) {
			for(int x = 0; x < y; x++) {
			System.out.print("*");
			}System.out.println();
		}sc.close();

	}

}
