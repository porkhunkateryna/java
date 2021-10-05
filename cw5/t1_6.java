package cw5;

import java.util.Scanner;
public class t1_6 {
	int numberofdigits(int x) {
		int k = 0;
		while(x>0) {
			x/=10;
			k++;
		}
		return k;
	}
	void maxdigits(int[]arr) {
		int mdigit=0;
		int[] result=new int[arr.length];
		int k = 0;
		for(int x:arr) {
			int tmp=numberofdigits(x);
			mdigit=tmp>mdigit?tmp:mdigit;
			if (tmp>mdigit) {
				result[0]=x;
				for(int i=1;i<result.length;i++) result[i]=Integer.INFINITY;
				k=1;
			}
			else if(tmp==mdigit) {
				result[k++]=x;
			}
		}
		for(int x:arr) {
			if(numberofdigits(x)==mdigit) {
				System.out.println(x);
			}
		}
		int z=0;
		for(int x:result) {
			System.out.printf("a[%d]=%d", z++,x);
		}
	}



}
