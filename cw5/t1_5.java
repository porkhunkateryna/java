package cw5;
import java.util.Scanner;
public class t1_5 {
	public static double dist(double x,double xi,double y, double yi, double z, double zi) {
		return Math.sqrt(Math.pow(x - xi, 2) + Math.pow(y - yi, 2) + Math.pow(z - zi, 2));
	}
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        int n = in.nextInt();
        double[] xi=new double[n];
        double[] yi=new double[n];
        double[] zi=new double[n];



        for (int i = 0; i<n;i++) {
        	System.out.printf("x%d", i);
            xi[i] = in.nextDouble();
            System.out.printf("y%d", i);
            yi[i] = in.nextDouble();
            System.out.printf("z%d", i);
            zi[i] = in.nextDouble();
            
            }
        double maxd=0;
        int maxi=0;
        for (int i=0;i<n;i++) {
        	double d = dist(x,y,z,xi[i],yi[i],zi[i]);
        	if(d>maxd) {
        		maxd=d;
        		maxi=1;
        	}
        	
        }
        System.out.println(maxd);
        System.out.printf("Closest point = (%f, %f, %f)\n", xi[maxi],yi[maxi],zi[maxi]);
    }
}


