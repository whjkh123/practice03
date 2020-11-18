package com.javaex.practice03;

public class Ex06 {

	public static void main(String[] args) {
		
		for(int x = 1; x <= 100; x++) {
			if(x % 5 == 0 && x % 7 == 0) {
				System.out.println(x);
			}
		}
	}
}
