package HW_210521;

import java.util.Scanner;

public class StudentScoreMain {

	public static void main(String[] args) {
		Student[] test = new Student[2];
		test[0] = new Student();
		test[1] = new Student();
		
		test[0].name = "홍길동";
		test[0].grade = 3;
		test[0].address = "구로구";
		test[0].subj = new Score[3];
		test[0].subj[0] = new Score();
//		test[0].subj[0].subject = new String[3];
//		test[0].subj[0].subject[0]= new String();
		test[0].subj[0].subject[0] = "수학";
		test[0].subj[0].score[0] = 90;
		test[0].subj[1] = new Score();
		test[0].subj[1].subject[1] = "과학";
		test[0].subj[1].score[1] = 95;
		test[0].subj[2] = new Score();
		test[0].subj[2].subject[2] = "영어";
		test[0].subj[2].score[2] = 100;
		
		test[1].name = "성이현";
		test[1].grade = 3;
		test[1].address = "마포구";
		test[1].subj = new Score[3];
		test[1].subj[0] = new Score();
		test[1].subj[0].subject[0] = "수학";
		test[1].subj[0].score[0] = 80;
		test[1].subj[1] = new Score();
		test[1].subj[1].subject[1] = "과학";
		test[1].subj[1].score[1] = 85;
		test[1].subj[2] = new Score();
		test[1].subj[2].subject[2] = "영어";
		test[1].subj[2].score[2] = 90;
		
		System.out.println("명령을 내리세요.");
		Scanner scan = new Scanner(System.in);
		scan.next();
		
		int sum[] = new int[3];
		for(int i =0; i<test.length; i++) {
			for(int j =0; j<test[i].subj.length; j++) {
				for(int k = 0; k<test[i].subj[j].score.length;k++) {
					sum[i] += test[i].subj[j].score[k];
				}
			}
		}
		System.out.println("수학 : "+ sum[0]+ "/"+sum[0]/test.length);
		System.out.println("과학 : "+ sum[1]+ "/"+sum[1]/test.length);
		System.out.println("영어 : "+ sum[2]+ "/"+sum[2]/test.length);
		
		
	}

}
