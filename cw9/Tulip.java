package cw9;

public class Tulip extends Flower {
	

		public Tulip(double length, double freshness) {
			super(length, freshness);
		}
		
		public String toString() {
			return "Òşëüïàí. " + super.toString();
		}

		@Override
		public double getPrice() {
			return length * 7 * (freshness < 1 ? 1 : 1 / freshness);
		}
	

}
