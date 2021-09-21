package cw3;
import java.util.Scanner;
public class t2_4 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
        int n= scanner.nextInt();
        int m=scanner.nextInt();
        int shift = 1 << m ;
        int res = n ^ shift;
        System.out.println(res);
}}
