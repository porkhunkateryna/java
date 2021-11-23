package cw11;
public class t6_3 {
    public static void main(String[] args) {
        String s = "i have a small pen, i have a small apple -> hm small apple-pen";
        s = s.replaceAll("small", "very large");
        System.out.println(s);
    }
}
