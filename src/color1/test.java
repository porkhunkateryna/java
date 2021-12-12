package color1;
import java.util.Scanner;
public class test {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("choose 0 for file test or 1 for console");
		int choice=sc.nextInt();
		if(choice==0) {
				
		

			file.RGBA("C:\\Users\\katyu\\eclipse-workspace\\color1\\resources\\inputRGBA.txt");
			file.HSL("C:\\Users\\katyu\\eclipse-workspace\\color1\\resources\\inputHSL.txt");
			file.CMYK("C:\\Users\\katyu\\eclipse-workspace\\color1\\resources\\inputCMYK.txt");
			file.Array("C:\\Users\\katyu\\eclipse-workspace\\color1\\resources\\inputArray.txt",
					"C:\\Users\\katyu\\eclipse-workspace\\color1\\resources\\outputArray.txt");		
}
		else {
			console.RGBA();
			console.HSL();
			console.CMYK();
			console.Array("C:\\Users\\katyu\\eclipse-workspace\\color1\\resources\\outputArray.txt");
			console.ImageMask("C:\\Users\\katyu\\eclipse-workspace\\color1\\resources\\outputImage.txt");
		}
			}
		}
