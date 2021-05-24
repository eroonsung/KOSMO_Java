package HW_210521;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("3~10 사이의 자연수를 입력하세요.");
		int num = scan.nextInt();
		char out = 'A';
		
		for(int i = 0; i <num; i++) {
			if((n<3)||(n>10)){
				System.out.println("범위를 벗어났습니다.")
				break;
			}
			for(int j=0; j<num-i; j++, out++) {
				System.out.print(out);
			}
			System.out.println();
		}

	}

}
