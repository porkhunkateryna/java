package cw11;
public class t6_5 {
    public static void main(String[] args) {
        String s = "i have a large pen, i have an orange -> hm small orange-pen";
        String[] StrsToReplace = {"small", "large"};
        for (String repS: StrsToReplace) {
            s = s.replaceAll(repS, "very " + repS);
        }
        System.out.println(s);
    }
}
