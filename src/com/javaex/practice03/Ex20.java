package com.javaex.practice03;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while(run) {
			
			System.out.println("=========================");
			System.out.println("     [숫자맞추기게임 시작]     ");
			System.out.println("=========================");
			
			int hidden = sc.nextInt();
			
			while(true) {
				
				System.out.print(">> ");
				int input = sc.nextInt();				
				
				if(input > hidden) {
					System.out.println("더 낮게");
					continue;
				}
				else if(input < hidden) {
					System.out.println("더 높게");
					continue;
				}
				else {
					System.out.println("정답입니다.");
					System.out.println("게임을 종료하시겠습니까? (y / n)");
				}
			
			String select01 = sc.next();
				if(select01.equals("n")) {
					break;
				}
				if(select01.equals("y")) {
					System.out.println("=========================");
					System.out.println("     [숫자맞추기게임 종료]     ");
					System.out.println("=========================");
					run = false;
					break;
				}
				
			}
			
		}sc.close();
	}
}
