package HW_210521;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		int[] array = new int[100];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		for(int i = 0; i< array.length; i++) {
			array[i] = scan.nextInt();
			if (array[i]==0) {
				for(int j = i-1; j>=0; j--) {
					System.out.print(array[j]+" ");
				}
			}
		}
	}
}
