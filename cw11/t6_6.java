package cw11;
import java.util.Scanner;

public class t6_6 {
    public static void main(String[] args) {
        System.out.println("input str:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer(s);
        sb.append(", that we use to illustrate the methods of class StringBuffer");
        System.out.println(sb.toString());
    }
}
