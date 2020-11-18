package com.javaex.practice03;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt, hap, mok, nmg, i;
		cnt = 0;
		hap = 0;
		System.out.print("숫자를 입력하세요: ");
		int input = sc.nextInt();
		
		for(i = 1; i <= input; i++) {
			mok = i / 5;
			nmg = i - mok * 5;
			if(nmg == 0) {
				cnt++;
				hap += i;
			}sc.close();
		}
		System.out.println("5의 배수의 개수: " + cnt);
		System.out.println("5의 배수의 합: " + hap);
		
	}

}
