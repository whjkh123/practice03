package com.javaex.practice03;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int remain = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------");
			
			System.out.print("선택> ");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.print("예금액> ");
				remain += sc.nextInt();
				break;
			case 2:
				System.out.print("출금액> ");
				remain -= sc.nextInt();
				break;
			case 3:
				System.out.print("잔고액> " + remain);
				System.out.println();
				break;
			case 4: 
				System.out.print("프로그램 종료");
				System.out.println();
				run = false;
				break;
			default:
				System.out.println("다시 입력해주세요.");	
			}
		}sc.close();
		
	}

}
