package com.javaex.practice03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		
		int num = sc.nextInt();
		int start = num%2;
		int sum = 0;
		
		for(int i = start; i <= num; i += 2) {
			if(i > start) {
				System.out.println(i);
				sum += i;
			}
		}
		sc.close();
		System.out.println(sum);
	}

}
