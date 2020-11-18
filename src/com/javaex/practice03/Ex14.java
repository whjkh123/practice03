package com.javaex.practice03;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		
		int input = sc.nextInt();
		int sum = 0;
			for(int i = 1; i <= input; i++) {
				sum = sum + i;
			}sc.close();
			System.out.println("합계: " +sum);

	}

}
