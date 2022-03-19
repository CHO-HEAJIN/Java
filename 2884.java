import java.util.Scanner;

public class Num2884 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		int H = s.nextInt();
		int M = s.nextInt();
		
		
		if ( M-45 < 0) {
			M = M + 15;
			if ( H-1 < 0 ) {
				H = 23; 
				} 
			else {
				H = H - 1;
				}
			} 
		else {
			M = M - 45;
		}
		
		
		System.out.println(H+ " " + M);
		
		s.close();
	}

}


