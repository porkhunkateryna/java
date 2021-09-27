package cw4;
import java.util.Random;

public class t3_3 {
	public static Random rnd=new Random();
	public static int dice() {
		return rnd.nextInt( 6)+1;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0;i<6;++i) {
			System.out.println(dice());
		}
		

	}

}
