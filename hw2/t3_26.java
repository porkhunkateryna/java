package homework.hw1;
import java.util.Scanner;
import java.lang.Math;
public class t3_26 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		long r;
		System.out.println("enter radius: ");
		r = scanner.nextInt();
		long h;
		System.out.println("enter height: ");
		h = scanner.nextInt();
		double v = Math.PI*h*Math.pow(r, 2);
		System.out.println("V= "+ v);
				
	}

}
