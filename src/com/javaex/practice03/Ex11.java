package com.javaex.practice03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		
		int a = 0;
		int sum = 0;
		int data = sc.nextInt();
		while(a<=data) {
			a++;
			if(a>0) {
				sum+=a;
			}
		}System.out.println("결과값: " + sum);
		
	}

}
