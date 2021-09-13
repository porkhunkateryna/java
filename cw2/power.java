package cw2;
import java.util.Scanner;
public class power {
	public static void main(String[] args) {
		Integer max = Integer.MAX_VALUE;
		Scanner scanner =new Scanner(System.in);
		long x;
		System.out.println("enter x: ");
		x = scanner.nextInt();
		double y = Math.pow(x, 8);
		if (y<=max) {
			System.out.println(y);
		}else {
			System.out.println("переповнення");
		}
		
		
	}

}
