package cw11;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class t6_2 {
    public static void main(String[] args) {
        String text;
        if (args.length != 0){
            Collections.reverse(Arrays.asList(args));

            System.out.println(String.join(" ", args));
        }
        else{
            Scanner sc = new Scanner(System.in);
            text = sc.nextLine();
            String[] arr = text.split(" ");
            Collections.reverse(Arrays.asList(arr));
            System.out.println(String.join(" ", arr));
        }

    }
}
