package com.java.Day4;

public class CharacterEx1 {
	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1); //���� ��� : A
		System.out.println((int)ch1); //���ڿ� �ش��ϴ� ���� ��(�ƽ�Ű�ڵ尪) ��� : 65
		
		char ch2 = 66; // ���� �� ����
		System.out.println(ch2); // ���� ���� �ش��ϴ� ���� ��� : B
		
		int ch3 = 67;
		System.out.println(ch3); // ���� ���� �� ��� : 67
		System.out.println((char)ch3); // ���� ���� �ش��ϴ� ���� ��� : C
		
		// ����
		char ch4 = 'Z';
		System.out.println(ch4); //Z
		System.out.println((int)ch4); //90
		char ch5 = 38;
		System.out.println(ch5); // &
		int ch6 = 97;
		System.out.println(ch6); //97
		System.out.println((char)ch6); //a
	}
}
