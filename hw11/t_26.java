package hw11;

public class t_26 {
	public static String removeDuplicates(String input) {
		if(input.length()<=1)
			return input;
		if(input.charAt(0)==input.charAt(1))
			return removeDuplicates(input.substring(1));
		else
			return input.charAt(0) + removeDuplicates(input.substring(1));
	}
	public static void main(String[] args)
	{
		String S = "aabcca";
		System.out.println(removeDuplicates(S));
	}

}


