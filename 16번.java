import java.util.Scanner;

public class Beat {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		String bin = Integer.toBinaryString(~num);
		
		System.out.println(~num);
		System.out.println(bin);
		
	}

}
