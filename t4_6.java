package hw4;
import java.util.Math;

public class t4_6 {

		public static int checkValidity(double a,
									double b, double c)
		{

			if (a + b <= c || a + c <= b || b + c <= a)
				return 0;
			else
				return 1;
		}

		public static void main(String args[])
		{
			
		

			


			int n = 50000;
			double s=0;
			for (int i = 0; i<n; ++i) {
				double a = Math.random();
				double b= Math.random();
				double c = Math.random();
				double res=checkValidity(a, b, c);
				if (res == 1) {
					s+=1;
				}
			}
			System.out.println(s/n);
			
		}
	}





