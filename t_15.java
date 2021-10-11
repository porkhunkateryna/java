package hw4;
import java.util.Scanner;
import java.util.Random;
public class t_15 {

	 public static void main(String[] args) {
		 Scanner scanner= new Scanner(System.in);
		 String str=scanner.nextLine();
		 String[]arr= str.split(" ");
		 String random = (arr[new Random().nextInt(arr.length)]);

			 System.out.println(random); 

}
}