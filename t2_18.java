package homework.hw3;
import java.util.Scanner;
public class t2_18 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
        int num = scanner.nextInt(); 
        int bit = scanner.nextInt(); 
        bit--; 
        int mask  = 1 << bit; 
        num = num ^ mask; 
        System.out.println(num + " " +Integer.toString(num, 16)+ " " +Integer.toString(num, 2));
	    
	}


}

