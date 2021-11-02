package cw9;

public class Rose extends Flower {
	

		public Rose(double length, double freshness) {
			super(length, freshness);
		}
		
		public String toString() {
			return "����. " + super.toString();
		}

		@Override
		public double getPrice() {
			return length * 10 * (freshness < 1 ? 1 : 1 / freshness);
		}
	}


