package cw5;
import java.util.Scanner;
public class t1_4 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String str=scanner.nextLine();
		String[]arr= str.split(" ");
		int[]a=new int[arr.length];
		for(int i=0;i<a.length;i++) {
			a[i]=Integer.parseInt(arr[i]);
		}
		int maxlen=1;
		int same=1; 
		int num=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=a[i-1]) {
				if(maxlen<same) {
					maxlen=same;
					num=a[i-1];
				}
				same=1;
			}
			else {
				same++;
			}
		System.out.println(maxlen);
		System.out.println(same);
				
		}
		
		// TODO Auto-generated method stub

	}

}
