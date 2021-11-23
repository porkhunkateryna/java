package cw11;
import java.util.Scanner;

public class t6_7 {
    public static void main(String[] args) {
        String text;
//        text =
//                "We use this to illustrate the methods of class StringBuffer. " +
//                "Task required implementation of some methods, that illustrate something. " +
//                        "London is the capital of Great Britain?";
        if (args.length != 0){
            text = String.join(" ", args);
        }
        else{
            Scanner sc = new Scanner(System.in);
            text = sc.nextLine();
        }

        String sentenceRegExp = "((\\b\\w+\\b[, ]{1,2})+(\\b\\w+\\b[.?]))+";
        String wordRegExp = "\\b\\w+\\b";
        String symbolRegExp = ".";
        String specSymbolRegExp = "[,.?]";
        String resStr;
        resStr = text.replaceAll(symbolRegExp, "#");
        long symbolsNumber = resStr.chars().filter(ch -> ch == '#').count();

        resStr = text.replaceAll(wordRegExp, "#");
        long wordsNumber = resStr.chars().filter(ch -> ch == '#').count();

        resStr = text.replaceAll(sentenceRegExp, "#");
        long sentencesNumber = resStr.chars().filter(ch -> ch == '#').count();

        resStr = text.replaceAll(specSymbolRegExp, "#");
        long specSymbolsNumber = resStr.chars().filter(ch -> ch == '#').count();

        System.out.println("Number of symbols: " + symbolsNumber);
        System.out.println("Number of words: " + wordsNumber);
        System.out.println("Number of sentences: " + sentencesNumber);
        System.out.println("Number of special symbols: " + specSymbolsNumber);

    }
}
