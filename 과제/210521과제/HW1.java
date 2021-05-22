package HW_210521;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		char out = 'A';
		
		for(int i = 0; i <num; i++) {
			for(int j=0; j<num-i; j++, out++) {
				System.out.print(out);
			}
			System.out.println();
		}

	}

}
