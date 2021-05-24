package HW_210518;

public class P123_Q4 {
	public static void main(String[] args) {
		
		int line;
		int space = 4;
		int star = 1;
		
		for(line=1; line<=4; line++) {
			for(int i = 0; i<space; i++) {
				System.out.print(' ');
			}
			for(int i = 0; star<10; i++) {
				System.out.print('*');
			}
			for(int i = 0; i<space; i++) {
				System.out.print(' ');
			}
			space -=1;
			star +=2;
			System.out.println();
		}
	}
}
