package cw11;
public class t6_4 {
    public static void main(String[] args) {
        String s = "i have a small pen, i have an orange -> hm small orange-pen";
        s = s.replaceAll(" an? ", " ");
        System.out.println(s);
    }
}
