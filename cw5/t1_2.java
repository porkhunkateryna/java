package cw5;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.ArrayList;
public class t1_2 {
	public static void main(String[] args) {
        System.out.println("¬вед≥ть числа у р€док:");
        Scanner in = new Scanner(System.in);
        int x,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;

        while (in.hasNextInt()){
            x = in.nextInt();
            if (x > max)
                max = x;
            if (x < min)
                min = x;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

}


