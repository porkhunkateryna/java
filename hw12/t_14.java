package hw12;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class t_14 {
	
		public static void main(String[] args) throws IOException{
			
			File data = new File("C:\\Users\\katyu\\eclipse-workspace\\hw12\\src\\hw12\\input.txt");
			FileReader fileReader = new FileReader(data);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			ArrayList<String> dataset = new ArrayList<>();
			String[] current = {};
			String numbers = "";
			while(bufferedReader.ready()) {
				dataset.add(bufferedReader.readLine());
			}
			bufferedReader.close();
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter surname and name :");
			String surname = input.nextLine();
			String ini = input.nextLine();
			input.close();
			
			for (int i = 0; i < dataset.size(); i++) {
				current = dataset.get(i).split(" ");
				if (current[0].equals(surname) ) {
					if (current[1].equals(ini) ) {
					
					//System.out.println(current[2]);
						numbers = numbers + current[2]+     System.lineSeparator();
					
					
				}
					else {
						System.out.println("the name doesnt match the surname");
					}
			}
			}
			if (numbers.length() == 0) {
				numbers = "There are no " + surname +"'"+"number";
			}else {
				System.out.println("the number of " + surname+ ":" );
				System.out.println(numbers);
			}
		}
			}
		
			
	

