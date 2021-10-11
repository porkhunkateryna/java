package hw4;


import java.util.Scanner;

public class t1_21 {

    private static void triangle(int n, int max){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < max-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num= sc.nextInt();

	    triangle(num,num+1);


    }}
