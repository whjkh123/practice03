package com.javaex.practice03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		
		int input = sc.nextInt();
		int fac = 1;
		for(int i = input; i > 0; i--) {
			fac = fac * i;
		}sc.close();
		System.out.println("결과값: " + fac);

	}

}
