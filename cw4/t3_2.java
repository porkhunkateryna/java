package cw4;
import java.util.Random;
public class t3_2 {
	final static int num = 5;

	public static void main(String[] args) {
		Random r = new Random();
		int a = r.nextInt(20);
		for(int i = 0; i < num;++i) {
			int x = r.nextInt(20);
			if(x<a) {
				System.out.printf("%d is less than %d\n", x,a);
			}
			else if(x>a) {
				System.out.printf("%d is greater than %d\n", x,a);
				
			}
			else {
				System.out.println("numbers are equal");
			}
		}
		// TODO Auto-generated method stub

	}

}
