package cw2;
import java.util.Scanner;
import java.lang.Math;
public class t3_13 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		long n;
		System.out.println("enter number from 0 to 10000: ");
		n = scanner.nextInt();
		double p = Math.pow(n, 8);
		System.out.printf("%20.4f",p);
		
		
	}

}
