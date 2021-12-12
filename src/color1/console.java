package color1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class console {
	private static final Scanner sc = new Scanner(System.in);
	private static ColorRGB inputRGB() {
		System.out.print("Input RGBA: ");
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		double a = sc.nextDouble();
		return new ColorRGB(r, g, b, a);
	}
	public static void RGBA() {
		
		ColorRGB c1 = inputRGB();
		ColorRGB c2 = inputRGB();
		
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
	
	private static ColorHSL inputHSL() {
		System.out.print("Input HSL: ");
		int h = sc.nextInt();
		double s = sc.nextDouble();
		double b = sc.nextDouble();
		return new ColorHSL(h, s, b);
	}
	
	
	public static void HSL() {

		ColorHSL c1 = inputHSL();
		ColorHSL c2 = inputHSL();
		
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
	
	private static ColorCMYK inputCMYK() {
		System.out.print("Input CMYK: ");
		double c = sc.nextDouble();
		double m = sc.nextDouble();
		double y = sc.nextDouble();
		double k = sc.nextDouble();
		return new ColorCMYK(c, m, y, k);
	}
	
	
	public static void CMYK() {
		ColorCMYK c1 = inputCMYK();
		ColorCMYK c2 = inputCMYK();
		
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
	public static void Array(String output) {
		System.out.println("\n Array");
		List<Color> colors = new ArrayList<Color>();
		while (true) {
			System.out.print("Input 1 for RGBA, 2 for HSL, 3 for CMYK, 4 to STOP ");
			int n = sc.nextInt();
			if (n == 1) {
				colors.add(inputRGB());
			} else if (n == 2) {
				colors.add(inputHSL());
			} else if (n == 3) {
				colors.add(inputCMYK());
			} else if (n == 4) {
				break;
			}
		}
		for (Color c : colors) {
			System.out.println("\t" + c);
		}
		try {
			Color.write(output, colors.toArray(new Color[0]));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void ImageMask(String outputImage) {
		System.out.println("image:\n");
		Image image = new Image();
		System.out.print("m and n: ");
		image.set_m(sc.nextInt());
		image.set_n(sc.nextInt());
		image.setMatr(new int[image.get_m()][image.get_n()]);
		for (int i = 0; i < image.get_m(); i++) {
			for (int j = 0; j < image.get_n(); j++) {
				image.setElement(i, j, sc.nextInt());
			}
		}
		System.out.println("\n" + image);
		System.out.println("mask:\n");
		Mask mask = new Mask();
		System.out.print("m and n: ");
		mask.set_m(sc.nextInt());
		mask.set_n(sc.nextInt());
		mask.setMatr(new int[mask.get_m()][mask.get_n()]);
		for (int i = 0; i < mask.get_m(); i++) {
			for (int j = 0; j < mask.get_n(); j++) {
				mask.setElement(i, j, sc.nextInt());
			}
		}
		System.out.println("\n" + mask);
		System.out.println("image + 2*mask:\n");
		image.ImageMask(mask);
		System.out.println(image);
		image.writeMatrix(outputImage);
	}

	
}
