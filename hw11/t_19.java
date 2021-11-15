package hw11;

public class t_19 {
	static void splitString(String str)
	{
		StringBuffer num = new StringBuffer(),
	 special = new StringBuffer();
		
		for (int i=0; i<str.length(); i++)
		{
			if (Character.isDigit(str.charAt(i)))
				num.append(str.charAt(i));

			else
				special.append(str.charAt(i));
		}
	
		System.out.println(num);
		System.out.println(special);
	}
	
	// Driver method
	public static void main(String args[])
	{
		String str = "bkgn b754b %%%hvjvf*^&$H,m34";
		splitString(str);
	}
}


