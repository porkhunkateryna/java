package color1;

import java.io.IOException;

public class file {
	public static void RGBA(String filename) {
		System.out.println("RGBA VALUES");
		Color[] colors = Color.read(filename);
		
		try {  
			ColorRGB c1 = colors[0].toRGB();
			ColorRGB c2 = colors[1].toRGB();
			
			System.out.println(c1);
			
			System.out.println("\n to RGBA " + c1.toRGB());
			System.out.println("\n to HSL " + c1.toHSL());
			System.out.println("\n to CMYK " + c1.toCMYK());
			System.out.println("\n int " + c1.valueInt());
			System.out.println("\n float " + c1.valueFloat());
			
			System.out.println(c2);

			System.out.println("\n sum " + c1.sum(c2));
			System.out.println("\n union" + c1.union(c2));
			System.out.println("\n intersection " + c1.intersection(c2));
			System.out.println("\n XOR" + c1.XOR(c2));
			
			}catch (IllegalArgumentException ex) {}  
		
	}
	
	public static void HSL(String filename) {
		System.out.println("\n HSL VAUES");
		Color[] colors = Color.read(filename);
		
		ColorHSL c1 = colors[0].toHSL();
		ColorHSL c2 = colors[1].toHSL();
		
		System.out.println(c1);
		
		System.out.println("\n to RGBA " + c1.toRGB());
		System.out.println("\n to HSL " + c1.toHSL());
		System.out.println("\n to CMYK " + c1.toCMYK());
		System.out.println("\n int " + c1.valueInt());
		System.out.println("\n float " + c1.valueFloat());
		
		System.out.println(c2);

		System.out.println("\n sum " + c1.sum(c2));
		System.out.println("\n union" + c1.union(c2));
		System.out.println("\n intersection " + c1.intersection(c2));
		System.out.println("\n XOR" + c1.XOR(c2));
	}
	
	public static void CMYK(String filename) {
		System.out.println("\n CMYK VAUES");
		Color[] colors = Color.read(filename);
		
		ColorCMYK c1 = colors[0].toCMYK();
		ColorCMYK c2 = colors[1].toCMYK();
		
		System.out.println(c1);
		
		System.out.println("\n to RGBA " + c1.toRGB());
		System.out.println("\n to HSL " + c1.toHSL());
		System.out.println("\n to CMYK " + c1.toCMYK());
		System.out.println("\n int " + c1.valueInt());
		System.out.println("\n float " + c1.valueFloat());
		
		System.out.println(c2);

		System.out.println("\n sum " + c1.sum(c2));
		System.out.println("\n union" + c1.union(c2));
		System.out.println("\n intersection " + c1.intersection(c2));
		System.out.println("\n XOR" + c1.XOR(c2));
	}

	public static void Array(String input, String output) {
		System.out.println("\n array");
		Color[] colors = Color.read(input);;
		for (Color c : colors) {
			System.out.println("\t" + c);
		}
		try {
			Color.write(output, colors);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	}
	

