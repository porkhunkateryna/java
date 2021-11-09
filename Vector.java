package hw8;
import java.util.ArrayList;
public class Vector {
	 private final int len;       
	 private double[] data;
	 public Vector(int n) {
	        this.len = n;
	        this.data = new double[n];
	    }

	    public Vector(double[] arr) {
	        len = arr.length;

	        this.data = new double[len];
	        System.arraycopy(arr, 0, this.data, 0, len);
	    }


	    public int length() {
	        return len;
	    }

	    public double get(int i) {
	        return data[i];
	    }

	    public void set(int i, double value) {
	        data[i] = value;
	    }
	    public void incr(int i) {
	    	data[i]++;
	    }
	    public void dect(int i) {
	    	data[i]--;
	    }

	    public double dot(Vector that) throws IllegalArgumentException {
	        if (this.length() != that.length())
	            throw new IllegalArgumentException("Vectors must have the same dimensions.");
	        double res = 0.0;
	        for (int i = 0; i < len; i++)
	            res = res + (this.data[i] * that.data[i]);
	        return res;
	    }

	    public double abs() {
	        return Math.sqrt(this.dot(this));
	    }


	    public double angle(Vector that) throws IllegalArgumentException {
	        if (this.length() != that.length())
	            throw new IllegalArgumentException("Vectors must have the same dimensions.");
	        if (this.length() == 0){
	            throw new IllegalArgumentException("Can't find the angle between zero vector and another.");
	        }

	        double mod1 = this.abs();
	        double mod2 = that.abs();
	        return Math.acos(this.dot(that) / (mod1 * mod2));
	    }

	     
	    public String toString() {
	        StringBuilder res = new StringBuilder();
	        res.append('(');
	        for (int i = 0; i < len; i++) {
	            res.append(data[i]);
	            if (i < len - 1) res.append(", ");
	        }
	        res.append(')');
	        return res.toString();
	    }


	    public static void main(String[] args){
	        int m = 5;
	        int n = 5;
	        int mult = 1000;
	        ArrayList<Vector> array = new ArrayList<Vector>(m);
	        for (int i = 0; i < m; i++){
	            Vector tmp = new Vector(n);
	            for (int j = 0; j < n; j++){
	                tmp.set(j, Math.random() * mult);
	            }
	            array.add(i, tmp);
	        }

	        for (int i = 0; i < m; i++){
	            for (int j = 0; j < m; j++){
	                if (i == j){
	                    continue;
	                }

	                System.out.println("angle for  " + array.get(i) + " and " + array.get(j) + ":");
	                System.out.println(array.get(i).angle(array.get(j))+ "\n");
	                System.out.println("dot production  for  " + array.get(i) + " and " + array.get(j) + ":");
	                System.out.println(array.get(i).dot(array.get(j))+ "\n");
	                System.out.println("length  for  " + array.get(i) + " and " + array.get(j) + ":");
	                System.out.println(array.get(i).abs()+array.get(j).abs());

	            }
	        }
	    }
	

}
