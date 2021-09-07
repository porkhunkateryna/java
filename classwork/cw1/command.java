package classwork;
import java.util.Arrays;
import java.util.Scanner;
public class command {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.print("Input Number of Elements in Array: ");
    int inp = sc.nextInt();    
    int arr[] = new int [inp];
    int sum = 0;

        for(int i=0; i< inp; i++) {
        System.out.print("Input "+(i+1)+"th Element:");
         arr [i] = sc.nextInt();
         sum+=arr [i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("sum "+sum);
        
}
}
	            
			
			



