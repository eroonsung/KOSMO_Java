package HW_210521;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("100 미만의 양의 정수들을 입력하세요.");
		String input = scan.nextLine();
		//입력된 숫자들을 쪼개서 number 배열에 넣기 
		String[] number = input.split(" ");
		int[] inputArray = new int[number.length];
		// inputArray에 입력된 값을 정수값으로 변환해서 저장하기 
		for(int i = 0; i<inputArray.length; i++) {
			inputArray[i]= Integer.parseInt(number[i]);
		}
		
		int[] count = new int[10]; // 10의 자리수에 해당하는 숫자 개수를 넣는 배열
		int ten; 
		for(int i =0; i<inputArray.length; i++) {
			if(inputArray[i] != 0) {
				ten = inputArray[i]/10; //10의 자리수 : 입력된 숫자/10
				count[ten]++;
			}
		}

		
		for(int i = 0; i<count.length; i++) {
			if(count[i] != 0) {
				System.out.println(i+" : "+count[i]);
			}
		}
	}

}
