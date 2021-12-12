package color1;

/**
 * created: 20.11.2021
 * @author  Kateryna Porkhun
 * 3 course, comp math
 * Taras Shevchenko National University of Kyiv
 */
public class ColorRGB extends Color {

    private int red;
    private int green;
    private int blue;
    private double alpha;
    private static final double eps = 1e-10;
    
    private double ifdouble(double n) {
		if (n > 1) {
			return 1.0;
		} else if (n < 0) {
			return 0.0;
		} else {
			return Math.round(n * 100) / 100.0;
		}
	}
    private int ifint(int n) {
		if (n > 360) {
			return 360;
		} else if (n < 0) {
			return 0;
		} else {
			return n;
		}
	}
    public ColorRGB(int red, int green, int blue, double alpha) {
		this.red = ifint(red);
		this.green = ifint(green);
		this.blue = ifint(blue);
		this.alpha = ifdouble(alpha);
	}
	public ColorRGB(int red, int green, int blue) {
		this.red = ifint(red);
		this.green = ifint(green);
		this.blue = ifint(blue);
		this.alpha = 1;
	}
	
	public ColorRGB() {
		this.red = 255;
		this.green = 255;
		this.blue = 255;
		this.alpha = 1;
	}
	public int getRed() {
		return red;
	}
	
	public void setRed(int red) {
		this.red = ifint(red);
	}
	
	public int getGreen() {
		return green;
	}
	
	public void setGreen(int green) {
		this.green = ifint(green);
	}
	
	public int getBlue() {
		return blue;
	}
	
	public void setBlue(int blue) {
		this.blue = ifint(blue);
	}
	
	public double getAlpha() {
		return alpha;
	}
	
	public void setAlpha(double alpha) {
		this.alpha = ifdouble(alpha);
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d, %d, %s)",
				this.red, this.green, this.blue,
				Double.toString(this.alpha)
				);
	}
  
    @Override
	public Color sum(Color c) {
		ColorRGB col = c.toRGB();
		return new ColorRGB(
				Math.round((this.red + col.red) / 2.0f),
				Math.round((this.green + col.green) / 2.0f),
				Math.round((this.blue + col.blue) / 2.0f),
				(this.alpha + col.alpha) / 2.0f
				);
	}
	
	@Override
	public Color union(Color c) {
		ColorRGB col = c.toRGB();
		return new ColorRGB(
				this.red & col.red,
				this.green & col.red,
				this.blue & this.blue,
				((int) (this.alpha ) & (int) (col.alpha))
				);
	}

	@Override
	public Color intersection(Color c) {
		ColorRGB col = c.toRGB();
		return new ColorRGB(
				this.red | col.red,
				this.green | col.red,
				this.blue | this.blue,
				((int) (this.alpha) | (int) (col.alpha))
				);
	}

	@Override
	public Color XOR(Color c) {
		ColorRGB col = c.toRGB();
		return new ColorRGB(
				this.red ^ col.red,
				this.green ^ col.red,
				this.blue ^ this.blue,
				((int) (this.alpha) ^ (int) (col.alpha))
				);
	}
	
	@Override
	public ColorRGB toRGB() {
		return this;
	}
	//https://www.rapidtables.com/convert/color/rgb-to-hsl.html
    public ColorHSL toHSL() {
		double r = (red * alpha) / 255;
		double g = (green * alpha) / 255;
		double b = (blue * alpha) / 255;
		
		double max = Math.max(r, Math.max(g, b));
		double min = Math.min(r, Math.min(g, b));
		
		int hue = 0;
		double saturation = 0.0, lightness = 1.0;
		double delta=(max - min);
		if (Math.abs(delta) < eps) {
			hue = 0;
		} else if (Math.abs(max - r) < eps) {
			if (g > b) {
				hue = (int) Math.round(60 * (g - b) / (delta));
			} else {
				hue = (int) Math.round(60 * (g - b) / (delta) + 360);
			}
		} else if (Math.abs(max - g) < eps) {
			hue = (int) Math.round(60 * (b - r) / (delta) + 120);
		} else if (Math.abs(max - b) < eps) {
			hue = (int) Math.round(60 * (r - g) / (delta) + 240);
		}
		
		if (max != 0) {
			saturation = 1 - min / max;
		}
		
		lightness = max;
		
		return new ColorHSL(hue, saturation, lightness);
	}

    public ColorCMYK toCMYK(){
    	double r = (red * alpha) / 255;
		double g = (green * alpha) / 255;
		double b = (blue * alpha) / 255;
		
		double max = Math.max(r, Math.max(g, b));
		
		double black = 1 - max;
		double cyan = (1 - r - black) / (1 - black);
		double magenta = (1 - g - black) / (black);
		double yellow = (1 - b - black) / (1 - black);
		
		return new ColorCMYK(cyan, magenta, yellow, black);
    }

	@Override
	public int valueInt() {
		return (int) Math.round(this.valueFloat() * 255);
	}

	@Override
	public float valueFloat() {
		return Math.round(( red +  green +  blue) * alpha ) / 255.0f;
	}
}