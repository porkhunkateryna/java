package cw2;

public class t4_3 {
	public static double Rosenbrock2d(double x, double y) {
		return 100*(x*x-y)*(x*x-y)+(x-1)*(x-1);
	}
	public static void main(String[] args) {
		System.out.println(Rosenbrock2d(3,4));
		System.out.println(Rosenbrock2d(7,7));
		System.out.println(Rosenbrock2d(33,4));
	}
	

}
