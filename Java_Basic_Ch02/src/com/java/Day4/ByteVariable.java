package com.java.Day4;

public class ByteVariable {
	public static void main(String[] args) {
		//Byte�� : byte
		byte bs1 = -128;
		//byte bs2 = 128; //2^7
		
		//Short : 2byte
		short sh1 = 128;
		short sh2 = -32768;
		//short sh3 = 32768; //2^15
		
		//Int : 4byte
		int int1 = 32768;
		int int2 = -2147483648;
		//int int3 = 2147483648;
		
		//Long : 8byte
//		�ڹٴ� ��� ���� ���� �⺻���� int������ ó���ϱ� ������
//		long���� ��Ÿ���� �ĺ����� L�̳� l�� ����Ϸ��� ���� �ڿ� ����
		
		long num1 = 2147483648L;
		long num2 = -12345678900L;
		//long num3 = 12345678900;
		
		//int�� ������ ���� �ʰ� int���� long������ �ڵ� ����ȯ ��
		long num4 = 1000; 
		
		//Char
		char ch1 = 'A';
		char ch2 = 'z';
	}
}
