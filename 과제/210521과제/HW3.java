package HW_210521;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		
		for(int i =0; i<num; i++) {
			for(int j = 0; j<num-i-1; j++) {
				System.out.print(" ");
			}
			for(int k =0; k<i+1; k++) {
				System.out.print(1+k);
			}
			System.out.println();
		}
		 
	}

}
