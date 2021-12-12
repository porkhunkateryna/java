package color1;

/**
 * created: 20.11.2021
 * @author  Kateryna Porkhun
 * 3 course, comp math
 * Taras Shevchenko National University of Kyiv
 */
public class ColorHSL extends Color {

    private int hue;
    private double saturation;
    private double lightness;
    
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
    public ColorHSL(int hue, double saturation, double lightness) {
		this.hue = ifint(hue);
		this.saturation = ifdouble(saturation);
		this.lightness = ifdouble(lightness);
	}

    public ColorHSL() {
    	this.hue = 0;
		this.saturation = 0.0;
		this.lightness = 1.0;
	}
	
	public int getHue() {
		return hue;
	}
	
	public void setHue(int hue) {
		this.hue = ifint(hue);
	}
	
	public double getSaturation() {
		return saturation;
	}
	
	public void setSaturation(double saturation) {
		this.saturation = ifdouble(saturation);
	}

	public double getLightness() {
		return lightness;
	}
	
	public void setLightness(double lightness) {
		this.lightness = ifdouble(lightness);
	}

	@Override
	public String toString() {
		return String.format("(%d, %s, %s)",
				this.hue,
				Double.toString(this.saturation),
				Double.toString(this.lightness)
				);
	}
    @Override
	public Color sum(Color c) {
		ColorHSL col = c.toHSL();
		return new ColorHSL(
				Math.round((this.hue + col.hue) / 2.0f),
				(this.saturation + col.saturation) / 2.0,
				(this.lightness + col.lightness) / 2.0
				);
	}

	@Override
	public Color intersection(Color c) {
		ColorHSL col = c.toHSL();
		return new ColorHSL(
				this.hue | col.hue,
				((int) (this.saturation) | (int)(col.saturation)),
				((int) (this.lightness) | (int) (col.lightness))
				);
	}

	@Override
	public Color union(Color c) {
		ColorHSL col = c.toHSL();
		return new ColorHSL(
				this.hue & col.hue,
				((int) (this.saturation) & (int) (col.saturation)),
				((int) (this.lightness) & (int) (col.lightness))
				);
	}

	@Override
	public Color XOR(Color c) {
		ColorHSL col = c.toHSL();
		return new ColorHSL(
				this.hue ^ col.hue,
				((int) (this.saturation) ^ (int) (col.saturation)),
				((int) (this.lightness) ^ (int) (col.lightness)) 
				);
	}

	@Override
    public ColorRGB toRGB() {
    	int h = hue;
		double s = saturation ;
		double l = lightness;
		double r, g, b;
		int hh=(int)(h * 6);
		float f = h * 6 - hh;
	    double p = l * (1 - s);
	    double q = l * (1 - f * s);
	    double t = l * (1 - (1 - f) * s);
	    
		
	    if (hh == 0) {
	        r = l;
	        g = t;
	        b = p;
	    } else if (hh == 1) {
	        r = q;
	        g = l;
	        b = p;
	    } else if (hh == 2) {
	        r = p;
	        g = l;
	        b = t;
	    } else if (hh == 3) {
	        r = p;
	        g = q;
	        b = l;
	    } else if (hh == 4) {
	        r = t;
	        g = p;
	        b = l;
	    } else  {
	        r = l;
	        g = p;
	        b = q;
		}
		return new ColorRGB(
				(int) Math.round(r * 255),
				(int) Math.round(g * 255),
				(int) Math.round(b * 255)
				);
	}

	@Override
	public ColorHSL toHSL() {
		return this;
	}

	@Override
	public ColorCMYK toCMYK() {
		return this.toRGB().toCMYK();
	}

    @Override
    public int valueInt(){
        return this.toRGB().valueInt();
    }

    @Override
    public float valueFloat(){
        return this.toRGB().valueFloat();
    }
}
