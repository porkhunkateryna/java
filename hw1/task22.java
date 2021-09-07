/** ця програма отримує на вхід два числа, і за допомогою десяткового логарифма
 * та рахує к-ть розрядів, а також їх середнє гармонійне
 * @author kateryna porkhun*/
package homework;
import java.util.Scanner;
public class task22 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		long a,b;
		System.out.println("enter first number: ");
		a = scanner.nextInt();
		System.out.println("enter second number: ");
		b = scanner.nextInt();
		
		int logmethod;
		if (a == 0){
			logmethod = 1;
		}else {
			logmethod =(int) Math.ceil(Math.log10(Math.abs(a) + 0.5));
		}
		int strmethod = String.valueOf(Math.abs(b)).length();
		
		double harmonic = 2 / (1.0/a + 1.0/b);
		
        System.out.printf("\nLogarithmic method, number %d: %d",a,  logmethod);
        System.out.printf("\nString method, number %d: %d", b, strmethod);
        System.out.printf("\nHarmonic mean: %.2f", harmonic);
		
		
	}
	

}
