package hw4;

import java.util.Scanner;
public class t1_21_2 {
   static String f(int n,String s){
      String l = "";
      for (int i = 1; i++ < (n); l += " ") ;
        return n > 1? n % 2 < 1?l + s + "\n" + f(--n , s + " \\_")
                             :l + s + "\n" + f(--n , "_/ " + s)
                              :s;
      }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;  
		Scanner sc=new Scanner(System.in);   
		n = sc.nextInt();  
		int[] array = new int[n]; 
		
		/*int numr=n/2;
		int numc=n;
		int[][] prod=new int[numr][numc];

		
		for(int row=0;row<numr;row++) {
			for(int col=0;col<numc;col++) {
				prod[row][col]=0;
		prod[1][(numc - 1) / 2] = 1;
		prod[1][(numc + 1) / 2] = 2;
		for( row = 0 ; row < numr;++row);
	        for(  col = 0 ; col < numc; ++col){
	            if ( prod[row][col] == 1 ){
	            prod[row + 1][col - 1] = 1;
	        }
	            if( prod[row][col] == 2){
	                prod[row + 1][col + 1] = 2;
	            }
	        }
	            
	            
	     for (row = 1; row < numr; ++row)
	    {
	        for ( col = 1; col < numc; ++col)
	        	System.out.println( prod[row][col] );
			}
		}*/

		
		System.out.println(f(n/2,"_/\\_"));

 

		}  
		}
		


