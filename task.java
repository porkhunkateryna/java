import java.util.Scanner;  
public class task  
{  
	public static void main(String args[])  
{  
int i, sum=0, z;  
Scanner sc = new Scanner(System.in);  
System.out.print("\n Enter Number of Numbers: ");  
int n = sc.nextInt();  
for(i=0;i<n;i++)     
{  
	System.out.print("Enter the number: ");  
	z = sc.nextInt();   
	sum=sum+z;      
}  
	System.out.println("The sum is: "+sum);  
}  
}  