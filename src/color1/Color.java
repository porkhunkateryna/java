/**

 * created: 20.11.2021
 * @author  Kateryna Porkhun
 * 3 course, comp math
 * Taras Shevchenko National University of Kyiv
 */
package color1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Color {

	public static void write (String filename, Color[]array) throws IOException{
		  BufferedWriter outputWriter = null;
		  outputWriter = new BufferedWriter(new FileWriter(filename));
		  for (int i = 0; i < array.length; i++) {
		    outputWriter.write(array[i]+"\n");
		    
		  }
		  outputWriter.flush();  
		  outputWriter.close();  
		}

	public static Color[] read(String filename) {
		BufferedReader buf = null;
		try {
			 buf = new BufferedReader(new FileReader(filename));
			List<Color> array = new ArrayList<Color>();
			while (true) {
				String line = buf.readLine();
				while (line != null) {
				
					array.add(stringToColor(line));
					line = buf.readLine();
			}
			buf.close();
			return array.toArray(new Color[0]);
			
		}
		
		}catch (IOException e) {
			
		}
		return null;
	}
	
	
    public abstract int valueInt();

    public abstract float valueFloat();
    
    public abstract ColorRGB toRGB();
	
	public abstract ColorHSL toHSL();
	
	public abstract ColorCMYK toCMYK();
	
	public abstract Color sum(Color c);
	
	public abstract Color union(Color c);
	
	public abstract Color intersection(Color c);
	
	public abstract Color XOR(Color c);
	
	private static Color stringToColor(String c) {
		if ("RGB".equals(c.substring(0, 3))) {
			String[] arr = c.substring(4, c.length() - 1).split(",\\s");
			if (arr.length == 3) {
				return new ColorRGB(
						Integer.valueOf(arr[0]),
						Integer.valueOf(arr[1]),
						Integer.valueOf(arr[2])
						);
			} else {
				return new ColorRGB(
						Integer.valueOf(arr[0]),
						Integer.valueOf(arr[1]),
						Integer.valueOf(arr[2]),
						Double.valueOf(arr[3])
						);
			}
		} else if ("HSL".equals(c.substring(0, 3))) {
			String[] arr = c.substring(4, c.length() - 1).split(",\\s");
			return new ColorHSL(
					Integer.valueOf(arr[0]),
					Double.valueOf(arr[1]),
					Double.valueOf(arr[2])
					);
		} else if ("CMYK".equals(c.substring(0, 4))) {
			String[] arr = c.substring(5, c.length() - 1).split(",\\s");
			return new ColorCMYK(
					Double.valueOf(arr[0]),
					Double.valueOf(arr[1]),
					Double.valueOf(arr[2]),
					Double.valueOf(arr[3])
					);
		}
		return null;
	}
}