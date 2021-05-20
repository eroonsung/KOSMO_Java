package com.java.Day6;

import java.util.Scanner;

public class MathPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("N의 값을 입력하세요.");
		int num = sc.nextInt();
		
		double sum = 0;
		double result;
		
		for(int i=1; i<=num; i++) {
			result = Math.pow(2*i, (2*i)-1);
			sum += result;
		}
		System.out.println("N의 값 : "+ num);
		System.out.println("합계 : "+ sum);
		
	}

}
