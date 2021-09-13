package cw2;
import java.util.Scanner;
public class t3_7 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		long m1,m2,r;
		System.out.println("enter m1: ");
		m1 = scanner.nextInt();
		System.out.println("enter m2: ");
		m2 = scanner.nextInt();
		System.out.println("enter r: ");
		r = scanner.nextInt();
		double g = 6.673e-11f;
		double F = (g *(m1*m2))/(r*r);
		System.out.println("F= "+F);
		
		
		
	}

}
