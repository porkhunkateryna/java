package cw11;
import java.util.Objects;

public class t6_1 {
    public static void main(String[] args) {
//        String text = "";
        String text = "we " +
                "wish " +
                "you " +
                "a " +
                "marry " +
                "christmas " +
                "we " +
                "wish " +
                "you " +
                "a " +
                "marry " +
                "christmas " +
                "and " +
                "a " +
                "happy " +
                "new " +
                "year ";
        if (Objects.equals(text, "")){
            System.out.println(args.length);
        }
        else{
            System.out.println(text.split("\\s").length);
        }

    }

}
