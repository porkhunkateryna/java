package cw4;
import java.util.Scanner;

public class t3_4 {
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int a= scanner.nextInt();
		int b=scanner.nextInt();
		int c= scanner.nextInt();
		if(a==b) {
			if(a==c) {
				System.out.println(1);
			}
			else  {
				System.out.println(2);
			}
			
		}
		else if(a==c) {
			System.out.println(2);
		}
		else if(b==c) {
			System.out.println(2);
		}
		else {
			System.out.println(3);
		}
		
	}
	
}