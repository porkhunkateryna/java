package hw13;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class t_4 {
public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<>();
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			nums.add(input.nextInt());
		}
		input.close();
		
		FileOutputStream fileOutputStream = new FileOutputStream("F");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		for (int i = 0; i < n; i++) {
			objectOutputStream.writeInt(nums.get(i));
		}
		objectOutputStream.close();
		
		ArrayList<Integer> read_nums = new ArrayList<>();
		FileInputStream fileInputStream = new FileInputStream("F");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		for (int i = 0; i < n; i++) {
			read_nums.add(objectInputStream.readInt());
		}
		objectInputStream.close();
		
		ArrayList<Integer> n1 = even_nums(read_nums);
		ArrayList<Integer> n2 = odd_nums(read_nums);
		
		FileOutputStream fileOutputStream1 = new FileOutputStream("G");
		ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(fileOutputStream1);
		for (int i = 0; i < n1.size(); i++) {
			objectOutputStream1.writeInt(n1.get(i));
		}
		objectOutputStream1.close();
		FileOutputStream fileOutputStream2 = new FileOutputStream("H.txt");
		ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(fileOutputStream2);
		for (int i = 0; i < n2.size(); i++) {
			objectOutputStream2.writeInt(n2.get(i));
		}
		
		
		
		
		objectOutputStream2.close();
	}

	
	public static ArrayList<Integer> even_nums(ArrayList<Integer> nums){
		
		ArrayList<Integer> new_nums = new ArrayList<>();
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) % 2 == 0) {
				new_nums.add(nums.get(i));
			}
		}
		return new_nums;
	}
	
	public static ArrayList<Integer> odd_nums(ArrayList<Integer> nums){
		
		ArrayList<Integer> new_nums = new ArrayList<>();
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) % 2 != 0 ) {
				new_nums.add(nums.get(i));
			}
		}
		return new_nums;
	}


}
