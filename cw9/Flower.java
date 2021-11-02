package cw9;

public abstract class Flower implements Comparable<Flower> {
	
		
		protected double length;
		protected double freshness;

		public Flower(double length, double freshness) {
			this.length = length;
			this.freshness = freshness;
		}
		
		public String toString() {
			return (
				"������� ������: " + length +
				". ������: " + freshness +
				". ֳ��: " + getPrice() + "\n"
			);
		}

		public double getLength() {return length;}
		public double getFreshness() {return freshness;}
		public abstract double getPrice();
		
		public int compareTo(Flower other) {
			if (this.freshness > other.freshness)
				return 1;
			else if (this.freshness < other.freshness)
				return -1;
			else
				return 0;
		}
	}


