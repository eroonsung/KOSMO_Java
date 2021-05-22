package HW_210521;

import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] array = new int[10];
		System.out.println("10개의 숫자를 입력하세요.");
		for(int i = 0; i< array.length; i++) {
			array[i] = scan.nextInt();
		}
		
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length-i-1; j++) {
				if(array[j]<array[j+1]) {
					int temp = array[j];
	                array[j] = array[j+1];
	                array[j+1] = temp;
				}
			}
		}
		for(int i = 0; i< array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
	}

}
