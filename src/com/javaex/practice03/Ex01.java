package com.javaex.practice03;

public class Ex01 {

	public static void main(String[] args) {
		
		int index = 0;
		
		System.out.println("while");
		while(index < 3) {
			System.out.println("index = " + index);
			index++;
		}
		System.out.println("for");
		for(int order = 0; order < 3; order++) {
			System.out.println("order = " + order);
		}

	}

}