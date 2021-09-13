package homework.hw1;

public class t4_4 {
	public static double perim(double a, double b, double c) {
		return a+b+c;
	}
	public static double plos(double a, double b,double c, double pp) {
		return Math.sqrt(pp*(pp-a)*(pp-b)*(pp-c));
	}

	public static void main(String[] args) {
		double a=3;
		double b=  3.5+3/(Math.pow(2, 111));
		double c=  3.5+3/(Math.pow(2, 111));
		double pp = (perim(a,b,c))/2;
		System.out.println(perim(a,b,c));
		System.out.println(plos(a,b,c,pp));
		
		
		
		
		
				
	
	}

}
