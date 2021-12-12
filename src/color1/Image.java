package color1;

public class Image extends Matr {
	public Image(int m, int n, int[][] array) {
		super(m, n, array);
	}

	public Image() {
		super();
	}
		
	
	public void ImageMask(Mask mask) {
		for (int i = 0; i < this.get_m(); i++) {
			for (int j = 0; j < this.get_n(); j++) {
				this.setElement(i, j, this.getElement(i, j)+mask.getElement(i, j)*2);
			}
		}
	}
	

}
