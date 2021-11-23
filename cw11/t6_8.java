package cw11;
import java.util.Locale;
import java.util.Scanner;

public class t6_8 {
    public static void main(String[] args) {
        String text;
//        text =
//                "We use this to illustrate the methods of class StringBuffer. " +
//                        "Task required implementation of some methods, that illustrate something. " +
//                        "London is the capital of Great Britain?";
        if (args.length != 0){
            text = String.join(" ", args);
        }
        else{
            Scanner sc = new Scanner(System.in);
            text = sc.nextLine();
        }
        System.out.println("Depend on register[y/n]:");
        Scanner sc = new Scanner(System.in);
        Character manageC = sc.nextLine().charAt(0);
        System.out.println("word to find:");
        String word = sc.nextLine();
        int res = -1;
        if (manageC == 'y') {
            res = text.indexOf(word);
        } else if (manageC == 'n') {
            res = Math.max(text.indexOf(word.toLowerCase()), text.indexOf(word.toUpperCase()));
        }
        String outStr = (res != -1) ? "Word exists in text" : "Word doesnt exist in text";
        System.out.println(outStr);


    }
}
