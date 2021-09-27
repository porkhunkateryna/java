package cw4;
import java.util.Scanner;
public class t4_20 {
	private static double func(double x, double e) {
		double ans=0;
		double i =0;
		double curr=x;
		while((curr>=e)||(curr<=-e)) {
			ans+=curr;
			curr*=(-1);
			curr*=(x*x);
			i+=2;
			curr/=i*(i+1);
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in) ;
		System.out.println("enter x and epsilon: ");
		double x=scanner.nextDouble();
		double e=scanner.nextDouble();	
	
		
		System.out.println(func(x,e));
				
		
	}

}
