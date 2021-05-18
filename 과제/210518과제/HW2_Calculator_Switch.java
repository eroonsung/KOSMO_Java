package HW_210518;

import java.util.Scanner;

public class HW2_Calculator_Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		String operator = sc.next();
		int num2 = sc.nextInt();

		int result;
		
		switch(operator) {
		case "+":
			result= num1+num2;
			break;
		case "-":
			result = num1-num2;
			break;
		case "*":
			result = num1*num2;
			break;
		default :
			result = num1/num2;
		}
		System.out.println("피연산자1 : "+num1);
		System.out.println("연산자 : "+operator);
		System.out.println("피연산자2 : "+num2);
		System.out.println("결과 : "+result);
	}
}
