import java.util.Scanner;

public class Num2530 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int H = s.nextInt(); //시
		int h ;
		int M = s.nextInt(); //분
		int m;
		int n;
		int input = s.nextInt(); //초
		int S;
		int SP = s.nextInt(); //요리하는 필요한 초
		
		
		S = input + SP;
		input = S % 60;
		n = S / 60;
		m = (M + n) % 60;
		h = H + ( (M + n) / 60);
		
		if (h > 24) {
			H = h % 24;
			System.out.println( H + " " + m + " "+ input);		
			} 
		else {
			if (h == 24) {
				H = 0; 
				System.out.println( H + " " + m + " "+ input );
			} 
			else {
				System.out.println( h + " " + m + " "+ input );
			}
		}
			
	}

}
