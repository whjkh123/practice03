package com.javaex.practice03;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요.");
		int num = sc.nextInt();
		
		for(int x = 1; x > 0 ; x++) {
			if(num%x==0) {
				System.out.println(x);
			}sc.close();
		}

	}

}
