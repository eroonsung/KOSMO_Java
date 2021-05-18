package HW_210518;

import java.util.Scanner;

public class HW3_Ternary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String height;
		int weight;
		//BMI : Body Mass Index
		String BMI ="정상";
		
		while(true) {
			System.out.println("키를 입력하세요.");
			height = sc.next();
			
			if (height.equals("q") ||height.equals("-1")) {
				System.out.println("종료");
				break;
			}
			
			System.out.println("몸무게를 입력하세요.");
			weight = sc.nextInt();
			
			
			int result = weight+100-Integer.parseInt(height);
						
			BMI = result >0 ? "비만" : "정상";
			
			System.out.println("비만수치 : "+BMI);
			continue;
		}
		
		
		
		
		
	}
}
