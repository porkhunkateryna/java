package cw3;

import java.util.Scanner;

public class t2_1 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
        int a= scanner.nextInt();
        int b=scanner.nextInt();

        int x = a | b;
        int y = a ^ b;
        int z = a & b;
        
        System.out.println(a + " " + Integer.toBinaryString(a));
        System.out.println(b + " " + Integer.toBinaryString(b));
        System.out.println("a | b " + Integer.toBinaryString(x));
        System.out.println("a ^ b " + Integer.toBinaryString(y));
        System.out.println("a & b " + Integer.toBinaryString(z));
	    
		
		

	}

}
