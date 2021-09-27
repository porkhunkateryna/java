package cw4;
import java.util.Random;
public class t3_6 {
	static Random r = new Random();
	private static int A() {
		int c = 2;
		int p = r.nextInt(2);
		int curr=r.nextInt(2);
		while(p+curr<2) {
			p=curr;
			curr=r.nextInt(2);
			c+=1;
					
		}
		return c;
	}
	private static int B() {
		int c = 2;
		int p = r.nextInt(2);
		int curr=r.nextInt(2);
		while(p<=curr) {
			p=curr;
			curr=r.nextInt(2);
			c+=1;
					
		}
		return c;
	

}
	public static void main(String[] args) {
		int n = 1000000;
		double s=0;
		for (int i = 0; i<n; ++i) {
			if (A()<B()) {
				s+=1;
			}
		}
		System.out.println(s/n);
		
	}}
