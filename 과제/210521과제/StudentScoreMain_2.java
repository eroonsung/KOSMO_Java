import java.util.Scanner;

public class StudentScoreMain_2 {
  
  public ststic void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String [] studentName = new String[10];
    
    int mathSum = 0;
    int sciSum = 0;
    int engSum = 0;
    int avg = 0;
    int count = 0;
    
    Student students[] = new Student[10];
    
    for(int i = 0; i<students.length; i++){
      System.out.println("학생 성적을 입력하세요. (이름/학년/주소/수학/과학/영어)");
      String result = sc.nextLine();
      
      if("/sum".equals(result)){
        System.out.println("수학: " + mathSum + "/" + (mathSum / count));
				System.out.println("과학: " + sciSum + "/" + (sciSum / count));
				System.out.println("영어: " + engSum + "/" + (engSum / count));
				break;
      }
      
      name[i] = result;
      String[] data = name[i].split("/");
      students[i] = new Student();
      students[i].name = data[0];
      students[i].grade = Integer.parseInt(data[1]);
      students[i].address = data[2];
      
      students[i].subj = new Score[3];
      for(int j = 0; j<3; j++){
        students[i].subj[j] = new Score();
				students[i].subj[j].subject = data[3+j];
				students[i].subj[j].score = Integer.parseInt(data[3+j]);
      }
      System.out.println(i+1+"/10");
      mathSum += Integer.parseInt(data[3]);
      sciSum += Integer.parseInt(data[4]);
			engSum += Integer.parseInt(data[5]);
      
      System.out.println();
      count++;
    }
  }
}
