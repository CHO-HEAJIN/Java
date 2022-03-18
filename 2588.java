# Java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int num1 = s.nextInt(); //472
		int num2 = s.nextInt(); //385
		
		System.out.println( num1 * ( (num2 % 100) % 10) ); //2360
		System.out.println( num1 * ( (num2 % 100) / 10) ); //3776
		System.out.println( num1 * (num2 / 100) ); //1416
		System.out.println( num1 * num2 ); //181720
		
		s.close();

	}

}
