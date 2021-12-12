package color1;

/**
 * created: 20.11.2021
 * @author  Kateryna Porkhun
 * 3 course, comp math
 * Taras Shevchenko National University of Kyiv
 */
public class ColorCMYK extends Color{

    private double cyan;
    private double magenta;
    private double yellow;
    private double black;
    
    private double ifdouble(double n) {
		if (n > 1) {
			return 1.0;
		} else if (n < 0) {
			return 0.0;
		} else {
			return Math.round(n * 100) / 100.0;
		}
	}
 
	public ColorCMYK(double cyan, double magenta, double yellow, double black) {
		this.cyan = ifdouble(cyan);
		this.magenta = ifdouble(magenta);
		this.yellow = ifdouble(yellow);
		this.black = ifdouble(black);
	}
    public ColorCMYK() {
		this.cyan = 0;
		this.magenta = 0;
		this.yellow = 0;
		this.black = 0;
	}
	
	public double getCyan() {
		return cyan;
	}
	
	public void setCyan(double cyan) {
		this.cyan = ifdouble(cyan);
	}
	
	public double getMagenta() {
		return magenta;
	}
	
	public void setMagenta(double magenta) {
		this.magenta = ifdouble(magenta);
	}
	
	public double getYellow() {
		return yellow;
	}
	
	public void setYellow(double yellow) {
		this.yellow = ifdouble(yellow);
	}
	
	public double getBlack() {
		return black;
	}
	
	public void setBlack(double black) {
		this.black = ifdouble(black);
	}
   
	@Override
	public String toString() {
		return String.format("(%s, %s, %s, %s)",Double.toString(this.cyan), Double.toString(this.magenta),Double.toString(this.yellow),Double.toString(this.black)
				);
	}

	public Color sum(Color c) {
		ColorCMYK col = c.toCMYK();
		return new ColorCMYK(
				(this.cyan + col.cyan) / 2,
				(this.magenta + col.magenta) / 2,
				(this.yellow + col.yellow) / 2,
				(this.black + col.black) / 2
				);
	}

	@Override
	public Color intersection(Color c) {
		ColorCMYK col = c.toCMYK();
		return new ColorCMYK(
				((int) (this.cyan) | (int) (col.cyan )),
				((int) (this.magenta) | (int) (col.magenta)) ,
				((int) (this.yellow) | (int) (col.yellow)),
				((int) (this.black) | (int) (col.black ))
				);
	}

	@Override
	public Color union(Color c) {
		ColorCMYK col = c.toCMYK();
		return new ColorCMYK(
				((int) (this.cyan) & (int) (col.cyan)),
				((int) (this.magenta)& (int) (col.magenta)),
				((int) (this.yellow) & (int) (col.yellow)),
				((int) (this.black) & (int) (col.black))
				);
	}

	public Color XOR(Color c) {
		ColorCMYK col = c.toCMYK();
		return new ColorCMYK(
				((int) (this.cyan) ^ (int) (col.cyan)),
				((int) (this.magenta) ^ (int) (col.magenta)),
				((int) (this.yellow) ^ (int) (col.yellow)),
				((int) (this.black) ^ (int) (col.black))
				);
    }
	
	@Override
	public ColorRGB toRGB() {
		
		int red = (int) Math.round(255 * (1 - cyan) * (1 - black));
		int green = (int) Math.round(255 * (1 - magenta) * (1 - black));
		int blue = (int) Math.round(255 * (1 - yellow) * (black));
		
		return new ColorRGB(red, green, blue);
	}

	@Override
	public ColorHSL toHSL() {
		return this.toRGB().toHSL();
	}

	@Override
	public ColorCMYK toCMYK() {
		return this;
	}

    @Override
    public int valueInt(){
        return toRGB().valueInt();
    }

    @Override
    public float valueFloat(){
        return toRGB().valueFloat();
    }
}
