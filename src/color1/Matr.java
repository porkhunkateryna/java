package color1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public  abstract class Matr {
	private int m;
	private int n;
	private int[][] arr;
	
	public Matr(int m, int n, int[][] arr) {
		this.m = m;
		this.n = n;
		this.arr = arr;
	}
	
	public Matr() {
		this.m = 0;
		this.n = 0;
		this.arr = null;
	}
	public void set_m(int m) {
		this.m = m;
	}
	public int get_m() {
		return m;
	}
	
	public void set_n(int n) {
		this.n = n;
	}
	
	public int get_n() {
		return n;
	}
	
	public void setMatr(int[][] matrix) {
		this.arr = matrix;
	}
	
	public int[][] getMatr() {
		return arr;
	}

	
	public void setElement(int i, int j, int el) {

		arr[i][j] = el;
	}
	
	public int getElement(int i, int j) {

		return arr[i][j];
	}
	

	@Override
	public String toString() {
		String s = String.format("%d*%d:\n", m, n);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				 s += Integer.toString(this.getElement(i, j)) + " ";
			}
			s += "\n";
		}
		return s;
	}
	public void writeMatrix(String filename) {
		BufferedWriter outputWriter = null;
		try {
			outputWriter = new BufferedWriter(new FileWriter(filename));
			outputWriter.write(this.toString());
			outputWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	
		
	}


	

